package com.threeD.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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

import com.theme.domain.CompatibleWith;
import com.threeD.config.SlugConvert;
import com.threeD.domain.Categories;
import com.threeD.service.CategoriesService;

@Controller
@RequestMapping("/Admin/threeD/categories")
public class CategoriesControllerThreeD extends AppController {

    @Autowired
    @Qualifier("categoriesServiceThreeD")
    CategoriesService categoriesService;

   


    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @RequestMapping("/showcategories")
    public String showCategories(Model model) {

        getAllHeaderPart(model);
        List<Categories> listOfCategories = categoriesService.listAllCatagories();

        ArrayList<Categories> arrayListForMainCategories = new ArrayList<>();

        for (Categories categories : listOfCategories) {
            if (categories.getParentId() == 0)
                arrayListForMainCategories.add(categories);
        }

        model.addAttribute("listOfCategories", arrayListForMainCategories);
        return "threeD/categories_view";
    }


    @RequestMapping("/showcategoriesChild/{id}")
    public String showCategoriesChild(Model model, @PathVariable("id") Integer id) {
        getAllHeaderPart(model);

        logger.info(")((((((((((((++++++++++" + id);

        List<Categories> listOfCategories = categoriesService.listAllCatagories();

        ArrayList<Categories> arrayListForMainCategories = new ArrayList<>();

        for (Categories categories : listOfCategories) {
            if (categories.getParentId() == id)
                arrayListForMainCategories.add(categories);
        }

        model.addAttribute("listOfCategories", arrayListForMainCategories);
        return "threeD/categories_view_child";
    }


    @RequestMapping("/categoriesAdd")
    public String categoriesAdd(Model model) {
        getAllHeaderPart(model);
        Categories categories = new Categories();
        model.addAttribute("categories", categories);
        List<Categories> listOfCategories = categoriesService.listAllCatagories();

        ArrayList<Categories> categoriesArrayList = new ArrayList<>();

        for (Categories categoriesForCheck : listOfCategories) {
            if (categoriesForCheck.getParentId() == 0) {
                categoriesArrayList.add(categoriesForCheck);
            }
        }
        model.addAttribute("listOfCategories", categoriesArrayList);
        return "threeD/categories_add";
    }


    @RequestMapping("/categoriesAddChild")
    public String categoriesAddChild(Model model) {
        getAllHeaderPart(model);
        Categories categories = new Categories();
        model.addAttribute("categories", categories);
        List<Categories> listOfCategories = categoriesService.listAllCatagories();

        ArrayList<Categories> categoriesArrayList = new ArrayList<>();

        for (Categories categoriesForCheck : listOfCategories) {
            if (categoriesForCheck.getParentId() == 0) {
                categoriesArrayList.add(categoriesForCheck);
            }
        }
        model.addAttribute("listOfCategories", categoriesArrayList);
        return "threeD/categories_add_child";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String saveCategories(Categories categories, CompatibleWith compatibleWith, @RequestParam(value = "category", required = false) String name,RedirectAttributes redirectAttributes) {

    
    	
    	/*if(categoriesService.checkUniqueNessOfParents(categories.getParentId(), categories.getName()) == null){
       */ System.out.println("Hi mata now i am here" + categories.getName());
        Categories categories1 = categoriesService.getCatagoriesByName(name);
        categories.setParentId(categories1.getId());
        categories.setCreated(new Date());
        categories.setStatus("ACTIVE");
        categories.setSlug(SlugConvert.nameToSlug(categories.getName()));
        categoriesService.saveCatagories(categories);
    	/*}
    	else{
    		redirectAttributes.addFlashAttribute("checkUnique", "Category already exist");
			return "redirect:/Admin/threeD/compatableBrowsers/browsersAdd";
    	}*/
        return "redirect:/Admin/threeD/categories/showcategories";
    }


   @RequestMapping(value = "/saveParent", method = RequestMethod.POST)
    public String saveCategoriesParent(Categories categories) {

//        logger.info("________________" + browsers[0]);
        System.out.println("Hi mata now i am here" + categories.getName());

        categories.setParentId(0);
        categories.setCreated(new Date());
        categories.setStatus("ACTIVE");
        categories.setSlug(SlugConvert.nameToSlug(categories.getName()));
        categoriesService.saveCatagories(categories);


//        for (int i = 0; browsers.length > i; i++) {
//            CompatableBrowsers compatableBrowsers = new CompatableBrowsers();
//            String browser = "";
//            browser = browsers[i];
//            categories.getId();
//            compatableBrowsers.setStatus("ACTIVE");
//            compatableBrowsers.setSlug(GlobalUtils.nameToSlug(browser));
//            compatableBrowsers.setCatagories(categories);
//            compatableBrowsers.setName(browser);
//            compatableBrowsersService.saveCompatableBrowsers(compatableBrowsers);
//        }
        return "redirect:/Admin/threeD/categories/showcategories";
    }


    @RequestMapping("/update/{id}")
    public String updateCategories(Model model, @PathVariable Integer id) {

        Categories categories = categoriesService.getCatagoriesById(id);

        if (categories.getStatus().equals("ACTIVE")) {
            categories.setStatus("INACTIVE");
        } else {
            categories.setStatus("ACTIVE");
        }
        categories.setModified(new Date());
        categoriesService.saveCatagories(categories);
        return "redirect:/Admin/threeD/categories/showcategories";
    }


    @RequestMapping("/updatecat/{id}")
    public String updateCategoriesChild(Model model, @PathVariable Integer id) {

        Categories categories = categoriesService.getCatagoriesById(id);
        if (categories.getStatus().equals("ACTIVE")) {
            categories.setStatus("INACTIVE");
        } else {
            categories.setStatus("ACTIVE");
        }
        categories.setModified(new Date());
        categoriesService.saveCatagories(categories);
        return "redirect:/Admin/threeD/categories/showcategoriesChild/" + categories.getParentId();
    }


    @RequestMapping("/delete/{id}")
    public String categoriesDelete(Model model, @PathVariable Integer id) {
        categoriesService.deleteCatagories(id);
        return "redirect:/Admin/threeD/categories/showcategories";
    }
}
