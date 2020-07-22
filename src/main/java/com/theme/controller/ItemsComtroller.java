package com.theme.controller;

import javassist.NotFoundException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Tofayel Ahmed on  8/22/17.
 */

@Controller
@RequestMapping("/Admin/theme/item")
public class ItemsComtroller {

    @RequestMapping("/aa")
    public String rejectList(Model model) throws NotFoundException {

//        if (true) throw new NotFoundException("Not FOund");


        return "theme/user_info";
    }


    @RequestMapping("/soldItems")
    public String soldItem(Model model) throws NotFoundException {

        if (true) throw new NotFoundException("Not FOund");
        return "/user_info";
    }


    @RequestMapping("/cc")
    public String feedBack(Model model) throws NotFoundException {

        if (true) throw new NotFoundException("Not FOund");


        return "theme/user_info";
    }


}
