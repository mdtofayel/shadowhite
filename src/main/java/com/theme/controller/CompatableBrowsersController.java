package com.theme.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.theme.config.SlugConvert;
import com.theme.domain.Categories;
import com.theme.service.CategoriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.theme.domain.CompatableBrowsers;
import com.theme.service.CompatableBrowsersService;
import com.threeD.domain.CreateIn;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/Admin/theme/compatableBrowsers")
public class CompatableBrowsersController extends AppController {

	@Autowired

	CompatableBrowsersService compatableBrowsersService;

	@Autowired
	CategoriesService categoriesService;

	@RequestMapping("/showBrowsers")
	public String showCompatableBrowsers(Model model) {
		getAllHeaderPart(model);
		List<CompatableBrowsers> listOfCompatableBrowsers = compatableBrowsersService.listAllCompatableBrowsers();
		model.addAttribute("listOfCompatableBrowsers", listOfCompatableBrowsers);

		return "theme/compatable_browsers_view";

	}

	@RequestMapping("/browsersAdd")
	public String CompatableBrowsersAdd(Model model) {
		getAllHeaderPart(model);
		CompatableBrowsers compatableBrowsers = new CompatableBrowsers();

		List<Categories> listOfCategories = categoriesService.listAllCatagories();

		ArrayList<Categories> categoriesArrayList = new ArrayList<>();

		for (Categories categoriesForCheck : listOfCategories) {
			if (categoriesForCheck.getParentId() == 0) {
				categoriesArrayList.add(categoriesForCheck);
			}
		}
		model.addAttribute("listOfCategories", categoriesArrayList);

		model.addAttribute("compatableBrowsers", compatableBrowsers);

		return "theme/compatable_browsers_add";
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
	public String savecompatablebrowsers(CompatableBrowsers compatableBrowsers,
			@RequestParam(value = "category", required = false) String name, RedirectAttributes redirectAttributes) {
		System.out.println("Hi mata now i am here: " + compatableBrowsers.getName());
		Categories categories = categoriesService.getCatagoriesByName(name);
		if (compatableBrowsersService.checkUniqueNessOfChild(categories.getId(),
				compatableBrowsers.getName()) == null) {

			compatableBrowsers.setCatagories(categories);
			compatableBrowsers.setStatus("ACTIVE");
			compatableBrowsers.setSlug(SlugConvert.nameToSlug(compatableBrowsers.getName()));
			compatableBrowsers.setCreated(new Date());
			compatableBrowsersService.saveCompatableBrowsers(compatableBrowsers);
		} else {
			redirectAttributes.addFlashAttribute("checkUnique", "name already exist");
			return "redirect:/Admin/theme/compatableBrowsers/browsersAdd";
		}
		return "redirect:/Admin/theme/compatableBrowsers/showBrowsers";
	}

	@RequestMapping("/update/{id}")
	public String updateCompatableBrowsers(Model model, @PathVariable Integer id) {
		getAllHeaderPart(model);
		CompatableBrowsers compatableBrowsers = compatableBrowsersService.getCompatableBrowsersById(id);
		// logger.info("__________________________________0"+compatableBrowsers.getStatus());

		if (compatableBrowsers.getStatus().equals("ACTIVE")) {
			// logger.info("__________________________________1");
			compatableBrowsers.setStatus("INACTIVE");
		} else {
			compatableBrowsers.setStatus("ACTIVE");
		}
		compatableBrowsers.setModified(new Date());
		compatableBrowsersService.saveCompatableBrowsers(compatableBrowsers);
		return "redirect:/Admin/theme/compatableBrowsers/showBrowsers";
	}

	@RequestMapping("/delete/{id}")
	public String compatablebrowsersDelete(Model model, @PathVariable Integer id) {
		compatableBrowsersService.deleteCompatableBrowsers(id);
		return "redirect:/Admin/theme/compatableBrowsers/showBrowsers";
	}
}
