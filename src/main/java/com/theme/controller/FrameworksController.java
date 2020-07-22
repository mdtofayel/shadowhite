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
import com.theme.domain.Frameworks;
import com.theme.service.FrameworkService;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


@Controller
@RequestMapping("/Admin/theme/frameworks")
public class FrameworksController extends AppController{


	@Autowired
	CategoriesService categoriesService;

	@Autowired
	FrameworkService frameworkService;
	@RequestMapping("/showframework")
	public String showFramework(Model model) {
		List<Frameworks> listOfFrameworks = frameworkService.listAllframeworks();
		model.addAttribute("listOfFrameworks", listOfFrameworks);

		return "theme/frameworks_view";
				 
	}

	@RequestMapping("/frameworkAdd")
	public String frameworkdAdd(Model model) {

		getAllHeaderPart(model);
		Frameworks frameworks = new Frameworks();

		List<Categories> listOfCategories = categoriesService.listAllCatagories();
		ArrayList<Categories> categoriesArrayList = new ArrayList<>();
		for (Categories categoriesForCheck : listOfCategories) {
			if (categoriesForCheck.getParentId() == 0){
				categoriesArrayList.add(categoriesForCheck);
			}
		}
		model.addAttribute("listOfCategories",categoriesArrayList);
		model.addAttribute("frameworks", frameworks);
		return "theme/frameworks_add";
	}
	/*if(compatibleWithService.checkUniqueNessOfChild(categories.getId(), compatibleWith.getName())==null){
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
*/
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveFrameworks(Frameworks frameworks,@RequestParam(value="category", required=false) String name, RedirectAttributes redirectAttributes) {
		System.out.println("Hi mata now i am here: " + frameworks.getName());
		Categories categories = categoriesService.getCatagoriesByName(name);
		if(frameworkService.checkUniqueNessOfChild(categories.getId(), frameworks.getName())==null){
		frameworks.setCatagories(categories);
		frameworks.setStatus("ACTIVE");
		frameworks.setSlug(SlugConvert.nameToSlug(frameworks.getName()));
		frameworks.setCreated(new Date());
		frameworks.setModified(new Date());
		frameworkService.saveframeworks(frameworks);
		}
		else{
			redirectAttributes.addFlashAttribute("checkUnique", "Name already exist.");
			return "redirect:/Admin/theme/frameworks/frameworks_add";
		}

		return "redirect:/Admin/theme/frameworks/showframework";
	}

	@RequestMapping("/update/{id}")
	public String updateframeworkss(Model model, @PathVariable Integer id) {


		Frameworks frameworks =frameworkService.getframeworksById(id);
		if (frameworks.getStatus().equals("ACTIVE")){
			frameworks.setStatus("INACTIVE");
		}
		else {
			frameworks.setStatus("ACTIVE");
		}
		frameworks.setModified(new Date());
		frameworkService.saveframeworks(frameworks);
		return "redirect:/Admin/theme/frameworks/showframework";
	}

	@RequestMapping("/delete/{id}")
	public String frameworksDelete(Model model, @PathVariable Integer id) {

		frameworkService.deleteframeworks(id);
		
		return "redirect:/Admin/theme/frameworks/showframework";

	}

}
