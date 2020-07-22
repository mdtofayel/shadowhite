package com.threeD.controller;

import com.threeD.domain.Support;
import com.threeD.service.SupportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Date;
import java.util.List;


@Controller
@RequestMapping("/Admin/threeD/support")
public class SupportControllerThreeD extends AppController {
	
	
	@Autowired
    SupportService supportService;
	
	@RequestMapping("/showsupport")
	public String showSupport(Model model) {

		getAllHeaderPart(model);
		List<Support> listOfSupports = supportService.listAllSupport();
		model.addAttribute("listOfSupports", listOfSupports);

		return "threeD/support_view";
		        
				 
	}

	@RequestMapping("/supportAdd")
	public String supportAdd(Model model) {
		getAllHeaderPart(model);
		Support supports = new Support() ;
		model.addAttribute("supports", supports);

		return "threeD/support_add";
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveSupport(Support supports) {
		System.out.println("Hi mata now i am here: " + supports.getName());
		supports.setCreated(new Date());
		supportService.saveSupports(supports);

		return "redirect:/Admin/threeD/support/showsupport";
	}

	@RequestMapping("/update/{id}")
	public String updateSupport(Model model, @PathVariable Integer id) {
		getAllHeaderPart(model);

		Support supports =supportService.getSupportById(id);

			supports.setModified(new Date());
		model.addAttribute("supports", supports);
		return "threeD/support_add";
	}

	@RequestMapping("/delete/{id}")
	public String supportDelete(Model model, @PathVariable Integer id) {

		supportService.deleteSupports(id);;
		
		return "redirect:/Admin/threeD/support/showsupport";

	}


}
