package com.theme.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.theme.config.SlugConvert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.theme.domain.Categories;
import com.theme.domain.CompatibleWith;
import com.theme.service.CategoriesService;
import com.theme.service.CompatibleWithService;

@Controller
@RequestMapping("/Admin/theme/compatiblewith")
public class CompatibleWithController extends AppController{

		@Autowired
		CompatibleWithService compatibleWithService;
		
		@Autowired
		CategoriesService categoriesService;
		

		@RequestMapping("/showcompatiblewith")
		public String showCompatiblewith(Model model) {

			getAllHeaderPart(model);
			List<CompatibleWith> listOfCompatibleWith = compatibleWithService.listAllCompatibleWith();
			model.addAttribute("listOfCompatibleWith", listOfCompatibleWith);

			return "theme/compatible_with_view";
					 
		}

		@RequestMapping("/compatiblewithAdd")
		public String compatiblewithAdd(Model model) {

			getAllHeaderPart(model);
			CompatibleWith compatibleWith = new CompatibleWith();


			List<Categories> listOfCategories = categoriesService.listAllCatagories();

			ArrayList<Categories> categoriesArrayList = new ArrayList<>();

			for (Categories categoriesForCheck : listOfCategories) {
				if (categoriesForCheck.getParentId() == 0){
					categoriesArrayList.add(categoriesForCheck);
				}
			}
			model.addAttribute("listOfCategories",categoriesArrayList);
			model.addAttribute("compatibleWith", compatibleWith);

			return "theme/compatible_with_add";
		}

		/*
		 * @RequestMapping(value = "/save", method = RequestMethod.POST) public
		 * String savecompatablebrowsers(CreateIn
		 * createIn, @RequestParam(value="category", required=false) String name,
		 * RedirectAttributes redirectAttributes) {
		 * 
		 * System.out.println("Hi mata now i am here: " + createIn.getName());
		 * Categories categories = categoriesService.getCatagoriesByName(name);
		 * 
		 * 
		 * logger.info("created____________________"+createInService.
		 * checkUniqueNessOfChild(categories.getId(),createIn.getName()));
		 * 
		 * if (createInService.checkUniqueNessOfChild(categories.getId(),createIn.
		 * getName())==null ){ createIn.setCatagories(categories);
		 * createIn.setStatus("ACTIVE");
		 * createIn.setSlug(SlugConvert.nameToSlug(createIn.getName()));
		 * createIn.setCreated(new Date()); createInService.saveCreateIn(createIn);
		 * } else { redirectAttributes.addFlashAttribute("checkUnique",
		 * "name already exist"); return
		 * "redirect:/Admin/threeD/compatableBrowsers/browsersAdd"; }
		 * 
		 * return "redirect:/Admin/threeD/compatableBrowsers/showBrowsers"; }
		 */
		@RequestMapping(value = "/save", method = RequestMethod.POST)
		public String saveCompatibleWith(CompatibleWith compatibleWith,@RequestParam(value="category", required=false) String name, RedirectAttributes redirectAttributes) {
			System.out.println("Hi mata now i am here: " + compatibleWith.getName());
			Categories categories = categoriesService.getCatagoriesByName(name);
			if(compatibleWithService.checkUniqueNessOfChild(categories.getId(), compatibleWith.getName())==null){
			compatibleWith.setCatagories(categories);
			compatibleWith.setSlug(SlugConvert.nameToSlug(SlugConvert.nameToSlug(compatibleWith.getName())));
			compatibleWith.setCreated(new Date());
			compatibleWith.setStatus("ACTIVE");
			compatibleWithService.saveCompatibleWith(compatibleWith);
			}
			else{
				redirectAttributes.addFlashAttribute("checkUnique", "name already exist");
				return "redirect:/Admin/theme/compatiblewith/compatiblewithAdd";
			}
			return "redirect:/Admin/theme/compatiblewith/showcompatiblewith";
		}

		@RequestMapping("/update/{id}")
		public String updateCompatibleWith(Model model, @PathVariable Integer id) {


			CompatibleWith compatibleWith = compatibleWithService.getCompatibleWithById(id);
			if (compatibleWith.getStatus().equals("ACTIVE")){
				compatibleWith.setStatus("INACTIVE");
			}
			else {
				compatibleWith.setStatus("ACTIVE");
			}
			compatibleWith.setModified(new Date());
			compatibleWithService.saveCompatibleWith(compatibleWith);
			return "redirect:/Admin/theme/compatiblewith/showcompatiblewith";
		}


		@RequestMapping("/delete/{id}")
		public String compatibleWithDelete(Model model, @PathVariable Integer id) {
			compatibleWithService.deleteCompatibleWith(id);
			return "redirect:/Admin/theme/compatiblewith/showcompatiblewith";
		}
}
