package com.threeD.controller;

import com.theme.domain.User;
import com.theme.service.UserService;
import com.threeD.domain.DigitalItems;
import com.threeD.service.DigitalItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.ui.Model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tofayel Ahmed on  9/21/17.
 */
public class AppController {

    @Autowired
    @Qualifier("digitalItemsServiceThreeD")
    DigitalItemsService digitalItemsService;



    public void getAllHeaderPart(Model model) {
        countUploaded(model);
    }

    public void countUploaded(Model model){





//        if (user==null){
//            return "redirect:/login";
//        }






        List<DigitalItems> listOfDigitalItems = digitalItemsService.listAllDigitalItems();
        ArrayList<DigitalItems> digitalItemsForCount = new ArrayList<>();
        int count = 0;
        for (DigitalItems digitalItems: listOfDigitalItems) {
            if (digitalItems.getStatus().equals("UPLOADED")){
                count++;
            }
        }
        model.addAttribute("countUploaded",count);
    }
}
