package com.theme.controller;

import com.theme.domain.DigitalItems;
import com.theme.domain.User;
import com.theme.service.DigitalItemsService;
import com.theme.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.ui.Model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tofayel Ahmed on   9/21/17.
 */
public class AppController {

    @Autowired
    DigitalItemsService digitalItemsService;


    @Autowired
    @Qualifier("userServiceForAdmin")
    UserService userService;


    private final Logger logger = LoggerFactory.getLogger(this.getClass());


    public void getAllHeaderPart(Model model) {
        Authentication auth
                = SecurityContextHolder.getContext().getAuthentication();




       // User user = userService.findUserByEmail(auth.getName());


//        logger.info("(((((((((((((((((((("+auth.getName());

        model.addAttribute("user",auth.getName());
        countUploaded(model);
    }



    public void countUploaded(Model model){






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
