package com.theme.controller;

import com.theme.domain.Tags;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by Tofayel Ahmed on  9/23/17.
 */
@Controller
public class TestController {


    @RequestMapping("/hello")
    public String showTags(Model model) {

        return "theme/test";
    }


}
