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

import com.theme.domain.SoftwareVersions;
import com.theme.service.SoftwareVersionsService;

import javassist.tools.framedump;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


@Controller
@RequestMapping("/Admin/theme/softwareversions")
public class SoftwareVersionsController extends AppController{

	@Autowired
	CategoriesService categoriesService;
	
	@Autowired
	SoftwareVersionsService softwareVersionsService;
	@RequestMapping("/showsoftwareversion")
	public String showSoftwareVersions(Model model){

		getAllHeaderPart(model);
		List<SoftwareVersions> listOfSoftwareVersions = softwareVersionsService.listAllSoftwareVersions();
		model.addAttribute("listOfSoftwareVersions", listOfSoftwareVersions);

		return "theme/softwareversions_view";
		        
				 
	}

	@RequestMapping("/softwareversionAdd")
	public String softwareVersionsAdd(Model model) {

		getAllHeaderPart(model);
		SoftwareVersions softwareVersions = new SoftwareVersions() ;

		List<Categories> listOfCategories = categoriesService.listAllCatagories();

		ArrayList<Categories> categoriesArrayList = new ArrayList<>();

		for (Categories categoriesForCheck : listOfCategories) {
			if (categoriesForCheck.getParentId() == 0){
				categoriesArrayList.add(categoriesForCheck);
			}
		}

		model.addAttribute("listOfCategories",categoriesArrayList);



		model.addAttribute("softwareVersions", softwareVersions);
		return "/softwareversions_add";
	}
	/*redirectAttributes.addFlashAttribute("checkUnique", "Name already exist.");
	return "redirect:/Admin/theme/frameworks/frameworks_add";
*/
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveSoftwareVersions(SoftwareVersions softwareVersions,@RequestParam(value="category", required=false) String name, RedirectAttributes redirectAttributes) {
		Categories categories = categoriesService.getCatagoriesByName(name);


		System.out.println("name______________________________________"+categories.getName());
		if(softwareVersionsService.checkUniqueNessOfChild(categories.getId(), softwareVersions.getVersion())==null){
		softwareVersions.setCatagories(categories);
		softwareVersions.setSlug(SlugConvert.nameToSlug(SlugConvert.nameToSlug(softwareVersions.getVersion())));
		System.out.println("Hi mata now i am here: " + softwareVersions.getVersion());
		softwareVersions.setCreated(new Date());
		softwareVersions.setModified(new Date());
		softwareVersions.setStatus("ACTIVE");
		softwareVersionsService.saveSoftwareVersions(softwareVersions);
		}
		else
		{
			redirectAttributes.addFlashAttribute("checkUnique","Name already exist." );
			return "redirect:/Admin/theme/softwareversions//softwareversions_add";
		}
		return "redirect:/Admin/theme/softwareversions/showsoftwareversion";
	}


	@RequestMapping("/update/{id}")
	public String updateSoftwareVersions(Model model, @PathVariable Integer id) {

		SoftwareVersions softwareVersions =softwareVersionsService.getSoftwareVersionsById(id);

		if (softwareVersions.getStatus().equals("ACTIVE")){
			softwareVersions.setStatus("INACTIVE");
		}
		else {
			softwareVersions.setStatus("ACTIVE");
		}
		softwareVersionsService.saveSoftwareVersions(softwareVersions);
		return "redirect:/Admin/theme/softwareversions/showsoftwareversion";
	}

	@RequestMapping("/delete/{id}")
	public String softwareVersionsDelete(Model model, @PathVariable Integer id) {

		softwareVersionsService.deleteSoftwareVersions(id);;
		
		return "redirect:/Admin/theme/softwareversions/showsoftwareversion";

	}

}
