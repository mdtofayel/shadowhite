package com.threeD.controller;

import javassist.NotFoundException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Tofayel Ahmed on  8/22/17.
 */

@Controller
@RequestMapping("/Admin/threeD/item")
public class ItemsComtrollerThreeD {

    @RequestMapping("/aa")
    public String rejectList(Model model) throws NotFoundException {

//        if (true) throw new NotFoundException("Not FOund");


        return "threeD/user_info";
    }


    @RequestMapping("/soldItems")
    public String soldItem(Model model) throws NotFoundException {

        if (true) throw new NotFoundException("Not FOund");
        return "threeD/user_info";
    }


    @RequestMapping("/cc")
    public String feedBack(Model model) throws NotFoundException {

        if (true) throw new NotFoundException("Not FOund");


        return "threeD/user_info";
    }


}
