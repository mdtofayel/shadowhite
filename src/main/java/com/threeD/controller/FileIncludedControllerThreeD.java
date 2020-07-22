package com.threeD.controller;

import com.threeD.config.SlugConvert;
import com.threeD.domain.Categories;
import com.threeD.domain.CreateIn;
import com.threeD.domain.FileIncluded;
import com.threeD.service.CategoriesService;
import com.threeD.service.FileIncludedService;


import org.springframework.beans.factory.annotation.Autowired;
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

@Controller
@RequestMapping("/Admin/threeD/fileincluded")
public class FileIncludedControllerThreeD extends AppController {

	@Autowired
    CategoriesService categoriesService;
		
		@Autowired
        FileIncludedService fileIncludedService;
		@RequestMapping("/showfileincluded")
		public String showFileIncluded(Model model) {
			List<FileIncluded> listOfFileIncludeds = fileIncludedService.listAllFileIncluded();
			model.addAttribute("listOfFileIncludeds", listOfFileIncludeds);

			return "threeD/fileincluded_view";
					 
		}

		@RequestMapping("/fileincludedAdd")
		public String fileIncludedAdd(Model model) {

			getAllHeaderPart(model);
			FileIncluded fileIncludeds = new FileIncluded();


			List<Categories> listOfCategories = categoriesService.listAllCatagories();

			ArrayList<Categories> categoriesArrayList = new ArrayList<>();

			for (Categories categoriesForCheck : listOfCategories) {
				if (categoriesForCheck.getParentId() == 0){
					categoriesArrayList.add(categoriesForCheck);
				}
			}

			model.addAttribute("listOfCategories",categoriesArrayList);
			model.addAttribute("fileIncludeds", fileIncludeds);

			return "threeD/fileincluded_add";
		}


			
			@RequestMapping(value = "/save", method = RequestMethod.POST)
			public String savecompatablebrowsers(FileIncluded fileIncludeds, @RequestParam(value="category", required=false) String name, RedirectAttributes redirectAttributes) {

				System.out.println("Hi mata now i am here: " + fileIncludeds.getName());
				Categories categories = categoriesService.getCatagoriesByName(name);


			//	logger.info("created____________________"+fileIncludedService.checkUniqueNessOfChild(categories.getId(),fileIncludeds.getName()));

				if (fileIncludedService.checkUniqueNessOfChild(categories.getId(),fileIncludeds.getName())==null ){
					fileIncludeds.setCatagories(categories);
					fileIncludeds.setSlug(SlugConvert.nameToSlug(fileIncludeds.getName()));
					fileIncludeds.setStatus("ACTIVE");
					fileIncludeds.setCreated(new Date());
					fileIncludeds.setModified(new Date());
				    fileIncludedService.saveFileIncluded(fileIncludeds);
				}
				else {
					redirectAttributes.addFlashAttribute("checkUnique", "File name already exist.");
					return "redirect:/Admin/threeD/fileincluded/fileincludedAdd";
				}
				return "redirect:/Admin/threeD/fileincluded/showfileincluded";
		}

		@RequestMapping("/update/{id}")
		public String updatefileIncludeds(Model model, @PathVariable Integer id) {

			FileIncluded fileIncludeds = fileIncludedService.getFileIncludedById(id);


			if (fileIncludeds.getStatus().equals("ACTIVE")){
				fileIncludeds.setStatus("INACTIVE");
			}
			else {
				fileIncludeds.setStatus("ACTIVE");
			}
			fileIncludeds.setModified(new Date());

			fileIncludedService.saveFileIncluded(fileIncludeds);

			return "redirect:/Admin/threeD/fileincluded/showfileincluded";
		}

		@RequestMapping("/delete/{id}")
		public String fileIncludedsDelete(Model model, @PathVariable Integer id) {

			fileIncludedService.deleteFileIncluded(id);
			
			return "redirect:/Admin/threeD/fileincluded/showfileincluded";

		}
	
}
