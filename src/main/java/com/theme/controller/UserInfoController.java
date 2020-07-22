package com.theme.controller;

import com.theme.domain.User;
import com.theme.service.UserService;
import javassist.NotFoundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


import java.util.List;

/**
 * Created by Tofayel Ahmed on  8/22/17.
 */
@Controller
@RequestMapping("/Admin/theme/user")
public class UserInfoController extends AppController{

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Qualifier("userServiceForAdmin")
    @Autowired
    UserService userService;

    @RequestMapping("/info")
    public String showUserInfoAll(Model model) throws NotFoundException {
        getAllHeaderPart(model);

//        for (User user : userService.listAllUser()){
//            logger.info("_____________________________________"+user.getUserProfileInfo().getAddressOne());
//        }


//        if (true) throw new NotFoundException("Not FOund");

        List<User> user = userService.listAllUser();
        model.addAttribute("userList", user);
        return "theme/user_info";
    }

    @RequestMapping("/info/{id}")
    public String showUserInfoSingle(Model model, @PathVariable("id") Integer id) throws NotFoundException {

        getAllHeaderPart(model);


//        List<User> user = userService.listAllUser();
//        for (User user1: userService.listAllUser()) {
//            logger.info("____________________________________"+user1.getEmail());
//        }


        User user = userService.findUserById(id);
        model.addAttribute("user", user);
        return "theme/user_info_view";
    }


    @RequestMapping("/feedback")
    public String feedBack(Model model) throws NotFoundException {

        if (true) throw new NotFoundException("Not FOund");


        return "theme/user_info";
    }


    @RequestMapping("/userRoll")
    public String userRollAndPermission(Model model) throws NotFoundException {
        if (true) throw new NotFoundException("Not FOund");


        return "theme/user_info";
    }


}
