package com.theme.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.theme.domain.CompatableBrowsers;
import com.theme.service.CompatableBrowsersService;
import com.utils.GlobalUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.theme.domain.Categories;
import com.theme.domain.CompatibleWith;
import com.theme.service.CategoriesService;

@Controller
@RequestMapping("/Admin/theme/categories")
public class CategoriesController extends AppController {

    @Autowired
    CategoriesService categoriesService;

    @Autowired
    CompatableBrowsersService compatableBrowsersService;


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
        return "theme/categories_view";
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
        return "theme/categories_view_child";
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
        return "theme/categories_add";
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
        return "theme/categories_add_child";
    }


    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String saveCategories(Categories categories, CompatibleWith compatibleWith, @RequestParam(value = "category", required = false) String name) {

        System.out.println("Hi mata now i am here" + categories.getName());

        Categories categories1 = categoriesService.getCatagoriesByName(name);

        categories.setParentId(categories1.getId());
        categories.setCreated(new Date());
        categories.setStatus("ACTIVE");
        categories.setSlug(com.theme.config.SlugConvert.nameToSlug(categories.getName()));
        categoriesService.saveCatagories(categories);

        return "redirect:/Admin/theme/categories/showcategories";
    }


    @RequestMapping(value = "/saveParent", method = RequestMethod.POST)
    public String saveCategoriesParent(Categories categories, CompatibleWith compatibleWith, @RequestParam(value = "category", required = false) String name, @RequestParam(value = "browsers", required = false) String[] browsers) {

        logger.info("________________" + browsers[0]);
        System.out.println("Hi mata now i am here" + categories.getName());

        categories.setParentId(0);
        categories.setCreated(new Date());
        categories.setStatus("ACTIVE");
        categories.setSlug(com.theme.config.SlugConvert.nameToSlug(categories.getName()));
        categoriesService.saveCatagories(categories);


        for (int i = 0; browsers.length > i; i++) {
            CompatableBrowsers compatableBrowsers = new CompatableBrowsers();
            String browser = "";
            browser = browsers[i];
            categories.getId();
            compatableBrowsers.setStatus("ACTIVE");
            compatableBrowsers.setSlug(GlobalUtils.nameToSlug(browser));
            compatableBrowsers.setCatagories(categories);
            compatableBrowsers.setName(browser);
            compatableBrowsersService.saveCompatableBrowsers(compatableBrowsers);
        }
        return "redirect:/Admin/theme/categories/showcategories";
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
        return "redirect:/Admin/theme/categories/showcategories";
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
        return "redirect:/Admin/theme/categories/showcategoriesChild/" + categories.getParentId();
    }


    @RequestMapping("/delete/{id}")
    public String categoriesDelete(Model model, @PathVariable Integer id) {

        categoriesService.deleteCatagories(id);
        return "redirect:/Admin/theme/categories/showcategories";

    }
}
