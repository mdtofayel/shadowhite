package com.threeD.controller;

import com.threeD.config.SlugConvert;
import com.threeD.domain.Categories;
import com.threeD.domain.CreateIn;
import com.threeD.service.CategoriesService;
import com.threeD.service.CreateInService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller()
@RequestMapping("/Admin/threeD/compatableBrowsers")
public class CreateInControllerThreeD extends AppController {

	@Autowired
	@Qualifier("CreateInServiceThreeD")
    CreateInService createInService;


	@Autowired
	@Qualifier("categoriesServiceThreeD")
    CategoriesService categoriesService;

	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@RequestMapping("/showBrowsers")
	public String showCompatableBrowsers(Model model) {
		getAllHeaderPart(model);
		List<CreateIn> listOfCreateIn = createInService.listAllCreateIn();
		model.addAttribute("listOfCompatableBrowsers", listOfCreateIn);

		return "threeD/compatable_browsers_view";
				 
	}

	@RequestMapping("/browsersAdd")
	public String CompatableBrowsersAdd(Model model) {
		getAllHeaderPart(model);
		CreateIn compatableBrowsers = new CreateIn();

		List<Categories> listOfCategories = categoriesService.listAllCatagories();
		ArrayList<Categories> categoriesArrayList = new ArrayList<>();




		for (Categories categoriesForCheck : listOfCategories) {
			if (categoriesForCheck.getParentId() == 0){
				categoriesArrayList.add(categoriesForCheck);
			}
		}
		model.addAttribute("listOfCategories",categoriesArrayList);

		model.addAttribute("compatableBrowsers", compatableBrowsers);

		return "threeD/compatable_browsers_add";
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String savecompatablebrowsers(CreateIn createIn, @RequestParam(value="category", required=false) String name, RedirectAttributes redirectAttributes) {

		System.out.println("Hi mata now i am here: " + createIn.getName());
		Categories categories = categoriesService.getCatagoriesByName(name);


		logger.info("created____________________"+createInService.checkUniqueNessOfChild(categories.getId(),createIn.getName()));

		if (createInService.checkUniqueNessOfChild(categories.getId(),createIn.getName())==null ){
			createIn.setCatagories(categories);
			createIn.setStatus("ACTIVE");
			createIn.setSlug(SlugConvert.nameToSlug(createIn.getName()));
			createIn.setCreated(new Date());
			createInService.saveCreateIn(createIn);
		}
		else {
			redirectAttributes.addFlashAttribute("checkUnique", "name already exist");
			return "redirect:/Admin/threeD/compatableBrowsers/browsersAdd";
		}

		return "redirect:/Admin/threeD/compatableBrowsers/showBrowsers";
	}

	@RequestMapping("/update/{id}")
	public String updateCompatableBrowsers(Model model, @PathVariable Integer id) {
		getAllHeaderPart(model);
		CreateIn createIn = createInService.getCreateInId(id);
		//logger.info("__________________________________0"+compatableBrowsers.getStatus());

		if (createIn.getStatus().equals("ACTIVE")){
			//logger.info("__________________________________1");
			createIn.setStatus("INACTIVE");
		}
		else {
			createIn.setStatus("ACTIVE");
		}
		createIn.setModified(new Date());
		createInService.saveCreateIn(createIn);
		return "redirect:/Admin/threeD/compatableBrowsers/showBrowsers";
	}

	@RequestMapping("/delete/{id}")
	public String compatablebrowsersDelete(Model model, @PathVariable Integer id) {
		createInService.deleteCreateIn(id);;
		return "redirect:/Admin/threeD/compatableBrowsers/showBrowsers";
	}
}
