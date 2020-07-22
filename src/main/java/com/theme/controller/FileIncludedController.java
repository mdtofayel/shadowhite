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

import com.theme.domain.FileIncluded;
import com.theme.service.FileIncludedService;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/Admin/theme/fileincluded")
public class FileIncludedController extends AppController{

	@Autowired
	CategoriesService categoriesService;
		
		@Autowired
		FileIncludedService fileIncludedService;
		@RequestMapping("/showfileincluded")
		public String showFileIncluded(Model model) {
			List<FileIncluded> listOfFileIncludeds = fileIncludedService.listAllFileIncluded();
			model.addAttribute("listOfFileIncludeds", listOfFileIncludeds);

			return "theme/fileincluded_view";
					 
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

			return "theme/fileincluded_add";
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
		public String saveFileIncludeds(FileIncluded fileIncludeds,@RequestParam(value="category", required=false) String name, RedirectAttributes redirectAttributes) {
			System.out.println("Hi mata now i am here: " + fileIncludeds.getName());
			Categories categories = categoriesService.getCatagoriesByName(name);
			if(fileIncludedService.checkUniqueNessOfChild(categories.getId(), fileIncludeds.getName())==null){
			fileIncludeds.setCatagories(categories);
			fileIncludeds.setSlug(SlugConvert.nameToSlug(fileIncludeds.getName()));
			fileIncludeds.setStatus("ACTIVE");
			fileIncludeds.setCreated(new Date());
			fileIncludeds.setModified(new Date());
		    fileIncludedService.saveFileIncluded(fileIncludeds);
			}else
			{
				redirectAttributes.addFlashAttribute("checkUnique", "Name already exist");
				return "redirect:/Admin/theme//fileincluded/fileincludedAdd";
			}
			return "redirect:/Admin/theme/fileincluded/showfileincluded";
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

			return "redirect:/Admin/theme/fileincluded/showfileincluded";
		}

		@RequestMapping("/delete/{id}")
		public String fileIncludedsDelete(Model model, @PathVariable Integer id) {

			fileIncludedService.deleteFileIncluded(id);
			
			return "redirect:/Admin/theme/fileincluded/showfileincluded";

		}
	
}
