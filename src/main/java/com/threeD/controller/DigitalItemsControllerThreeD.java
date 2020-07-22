package com.threeD.controller;

import com.threeD.domain.DigitalItemVersions;
import com.threeD.domain.DigitalItems;
import com.threeD.domain.UserFeedback;
import com.threeD.service.DigitalItemVersionsService;
import com.threeD.service.DigitalItemsService;
import com.threeD.service.UserFeedbackService;
import com.utils.GlobalUtils;
import javassist.NotFoundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/Admin/threeD/digitalItems")
public class DigitalItemsControllerThreeD extends AppController {
	
	@Autowired
    DigitalItemsService digitalItemsService;
	
	@Autowired
    UserFeedbackService userFeedbackService;

	@Autowired
	ServletContext servletContext;

	@Autowired
    DigitalItemVersionsService digitalItemVersionsService;



	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@RequestMapping("/showdigitalitems")
	public String showDigitalItems(Model model) {
		List<DigitalItems> listOfDigitalItems = digitalItemsService.listAllDigitalItems();
		model.addAttribute("listOfDigitalItems", listOfDigitalItems);

		return "threeD/digital_items_view";
	}


	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveDigitalItems(DigitalItems digitalItems) {
	System.out.println("Hi mata now i am here" + digitalItems.getName());
		digitalItems.setCreated(new Date());
		digitalItemsService.saveProduct(digitalItems);

		return "redirect:";
	}

	
	
	@RequestMapping("/update/{id}")
	public String updateDigitalItems(Model model, @PathVariable Integer id) {

		DigitalItems digitalItems = digitalItemsService.getProductById(id);
	
		model.addAttribute("digitalItems", digitalItems);
		return "";
	}


	@RequestMapping(value = "/edit/{id}", method = RequestMethod.POST)
	public String editDigitalItems(@PathVariable("id") Integer id, @RequestParam("productStatus") String productStatus) {
		DigitalItems digitalItems = digitalItemsService.getProductById(id);
		digitalItems.setStatus(productStatus);
		digitalItemsService.saveProduct(digitalItems);
		return "redirect:/Admin/threeD/digitalItems/causeOfApprove/"+id;
	}


	@RequestMapping("/causeOfApprove/{id}")
	public String causeOfApprove(@PathVariable("id") Integer id,Model model) {
		DigitalItems digitalItems = digitalItemsService.getProductById(id);
//		digitalItems.getCauseOfApprove(productStatus);
//		digitalItemsService.saveProduct(digitalItems);

		logger.info("_______)))))))_________"+digitalItems.getId());

		model.addAttribute("digitalItem",digitalItems);

		return "threeD/cause_of_approve";
	}

	@RequestMapping(value = "/causeOfApprove", method = RequestMethod.POST)
	public String causeOfApprovePost(@RequestParam("id") Integer id, @RequestParam("message") String message) {

		logger.info("_______________________________________++"+id+message);
		DigitalItems digitalItems = digitalItemsService.getProductById(id);
		digitalItems.setCauseOfApprove(message);
		digitalItemsService.saveProduct(digitalItems);
		return "redirect:/Admin/threeD/digitalItems/approvedinfo";
	}



	@RequestMapping("/rejectinfo")
	public String digitalItemsRejectList(Model model){

		getAllHeaderPart(model);

		List<DigitalItems> listOfDigitalItems = digitalItemsService.listAllDigitalItems();
		
		List<DigitalItems> listOfRejectedDigitalItems = new ArrayList<>();
		
		for(DigitalItems check: listOfDigitalItems){
			if(check.getStatus().toLowerCase().contains("rejected")){
				listOfRejectedDigitalItems.add(check);
			}
		}
		model.addAttribute("listOfRejectedDigitalItems",listOfRejectedDigitalItems);
	
		return "threeD/reject_all";
	}



	@RequestMapping("/approvedinfo")
	public String digitalItemsUploaded(Model model){

		getAllHeaderPart(model);
		List<DigitalItems> listOfDigitalItems = digitalItemsService.listAllDigitalItems();
		ArrayList<DigitalItems> digitalItemsForCount = new ArrayList<>();
		int count = 0;
		for (DigitalItems digitalItems: listOfDigitalItems) {
			if (digitalItems.getStatus().equals("UPLOADED")){
				digitalItemsForCount.add(digitalItems);
			}
		}
		model.addAttribute("listOfDigitalItems",digitalItemsForCount);
		return "threeD/approved_list";
	}

	@RequestMapping("/published")
	public String digitalItemsApproved(Model model){

		getAllHeaderPart(model);
		List<DigitalItems> listOfDigitalItems = digitalItemsService.listAllDigitalItems();
		ArrayList<DigitalItems> digitalItemsForCount = new ArrayList<>();
		int count = 0;
		for (DigitalItems digitalItems: listOfDigitalItems) {
			if (digitalItems.getStatus().equals("PUBLISHED")){
				digitalItemsForCount.add(digitalItems);
			}
		}
		model.addAttribute("listOfDigitalItems",digitalItemsForCount);
		return "threeD/uploaded_list";
	}



	@RequestMapping("/details/{id}")
	public String itemDetails(Model model,@PathVariable("id") Integer id){

		getAllHeaderPart(model);

		DigitalItems digitalItems = digitalItemsService.getProductById(id);
		if (digitalItems.getPrice()==0){
			model.addAttribute("isDownloadedButton", true);
		}
		if (digitalItems.getDigitalItemVersionsList().size() == 0){
//            String previewURLeditable = digitalItems.getDigitalItemVersionsList().get(digitalItems.getDigitalItemVersionsList().size()-1).getPreviewUrl();
			model.addAttribute("previewURLeditable", null);
		}else {
			String previewURLeditable = digitalItems.getDigitalItemVersionsList().get(digitalItems.getDigitalItemVersionsList().size()-1).getPreviewUrl();

			model.addAttribute("previewURLeditable", previewURLeditable);
		}
//		model.addAttribute("user", user);
		model.addAttribute("average", digitalItemsService.getItemRating(digitalItems));
		model.addAttribute("digitalItem", digitalItems);
		return"threeD/single";
	}



	@RequestMapping("/soldItems")
	public String soldItem(Model model) throws NotFoundException {
		if (true) throw new NotFoundException("Not FOund");
		return "threeD/user_info";
	}


	@RequestMapping("/paymentDetails")
	public String paymentDetails(Model model) throws NotFoundException {
		if (true) throw new NotFoundException("Not FOund");
		return "threeD/user_info";
	}
	/*
	 * Below i do Work  for user feed back 
	*/
	
	@RequestMapping("/userfeedback")
	public String userFeedback(Model model){
		getAllHeaderPart(model);
		List<UserFeedback> listOfUserFeedback = userFeedbackService.listAllUserFeedback();
		
		model.addAttribute("listOfUserFeedback",listOfUserFeedback);
		return"threeD/user_feedback_all";
	}
	
	@RequestMapping(value = "/status/{id}", method = RequestMethod.POST)
	public String editUserFeedback(@PathVariable("id") Integer id, @RequestParam("feedbackStatus") String feedbackStatus) {
		UserFeedback userFeedback = userFeedbackService.getUserFeedbackById(id);
		userFeedback.setStatus(feedbackStatus);
		userFeedbackService.saveFeedback(userFeedback);
		return "redirect:/Admin/threeD/digitalItems/userfeedback";
	}
	
	@RequestMapping("/singleuserfeedback/{id}")
	public String singleUserFeedback(Model model,@PathVariable("id") Integer id){
		getAllHeaderPart(model);
		UserFeedback userFeedback = userFeedbackService.getUserFeedbackById(id);
		
		
		logger.info("___________________"+userFeedback.getdigitalItemsUrl());
        model.addAttribute("userFeedback", userFeedback);
		
		return"threeD/user_feedback_single_info";
	}


	@RequestMapping(value = "/screenshot/image/{folderName}/{imageName}")
	@ResponseBody
	public byte[] getImageForInline(@PathVariable(value = "imageName") String imageName, @PathVariable(value = "folderName") String folderName) throws IOException {
		logger.info("_____________________++++++++++++++________________+++++++++++");
		String PERSONAL_PICTURE_FOLDER = GlobalUtils.tomcatContextPathParent(servletContext.getRealPath("/"))+"/threeD/UploadProduct/preview_screen_shot/"+folderName+"/";
		File serverFile = new File(PERSONAL_PICTURE_FOLDER + imageName + ".png");
		return Files.readAllBytes(serverFile.toPath());
	}

	@RequestMapping(value = "/product/image/{imageName}")
	@ResponseBody
	public byte[] getImage(@PathVariable(value = "imageName") String imageName) throws IOException {
		String THUMBNAIL_FORLDER = GlobalUtils.tomcatContextPathParent(servletContext.getRealPath("/"))+"/threeD/UploadProduct/thumbnail/";
		logger.info("______________________________________________"+THUMBNAIL_FORLDER);
		File serverFile = new File(THUMBNAIL_FORLDER + imageName + ".png");
		return Files.readAllBytes(serverFile.toPath());
	}




	//second is for download process ::: 2
	@RequestMapping(value = "/product/mainfile/{id}", method = RequestMethod.GET, produces = "application/zip")
	public @ResponseBody
	Resource downloadC(HttpServletResponse response, @PathVariable Integer id) throws FileNotFoundException {
		DigitalItems digitalItems = digitalItemsService.getProductById(id);
//        String fileName = digitalItems.getSlug();
		String fileName= digitalItems.getDigitalItemVersionsList().get(digitalItems.getDigitalItemVersionsList().size()-1).getProductName();
		logger.info("product name___________________________________________________"+id);
//        String fileName = digitalItems.getSlug();
		File file = getFile(fileName);
		return new FileSystemResource(file);
	}


	//get file for downloadc() method
	//third is for download process ::: 3
	private File getFile(String fileName) throws FileNotFoundException {
		String MAIN_FILE_FOLDER = GlobalUtils.tomcatContextPathParent(servletContext.getRealPath("/"))+"/threeD/UploadProduct/main_file/";
		File file = new File(MAIN_FILE_FOLDER+ fileName+".zip");
		if (!file.exists())
		{
			throw new FileNotFoundException("file with path: " +MAIN_FILE_FOLDER+ fileName + " was not found.");
		}
		return file;
	}
	
//	@ResponseBody
//	@RequestMapping(value = "/editchange/{id}", method = RequestMethod.POST)
//	public String changeDigitalItemStatus(@PathVariable("id") Integer id, @RequestParam("productStatus") String productStatus) {
//		logger.info(id+"a____________"+productStatus);
//		DigitalItems digitalItems = digitalItemsService.getProductById(id);
//		digitalItems.setStatus(productStatus);
//		digitalItemsService.saveProduct(digitalItems);
//		return "OK";
//	}



	@RequestMapping(value = "/editchangeThree/{id}", method = RequestMethod.POST)
	public String changeDigitalItemStatus(@PathVariable("id") Integer id, @RequestParam("productStatus") String productStatus) {
		logger.info(id+"a____________"+productStatus);
		DigitalItems digitalItems = digitalItemsService.getProductById(id);
		digitalItems.setStatus(productStatus);
		digitalItemsService.saveProduct(digitalItems);
		return "redirect:/Admin/threeD/digitalItems/approvedinfo";
	}


	@ResponseBody
	@RequestMapping(value = "/edit_preview_url/{id}", method = RequestMethod.POST)
	public String editPreviewUrl(@PathVariable("id") Integer project_id, @RequestParam("slug") String slug) {
		String previewUrl = "http://45.114.233.50:8080/preview" + "/" + "item" + "/" + project_id + "/" + slug;
		logger.info("a____________"+previewUrl);
		logger.info(project_id+"a____________"+slug);
		    DigitalItems digitalItems = digitalItemsService.getProductById(project_id);
			DigitalItemVersions previewURLeditable = digitalItems.getDigitalItemVersionsList().get(digitalItems.getDigitalItemVersionsList().size()-1);
			previewURLeditable.setPreviewUrl(previewUrl);
			digitalItemVersionsService.saveDigitalItemVersions(previewURLeditable);
		return "OK";
	}
	
}