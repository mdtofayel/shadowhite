package com.theme.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.theme.domain.Support;
import com.theme.service.SupportService;



@Controller
@RequestMapping("/Admin/theme/support")
public class SupportController extends AppController{
	
	
	@Autowired
	SupportService supportService;
	
	@RequestMapping("/showsupport")
	public String showSupport(Model model) {

		getAllHeaderPart(model);
		List<Support> listOfSupports = supportService.listAllSupport();
		model.addAttribute("listOfSupports", listOfSupports);

		return "theme/support_view";
		        
				 
	}

	@RequestMapping("/supportAdd")
	public String supportAdd(Model model) {
		getAllHeaderPart(model);
		Support supports = new Support() ;
		model.addAttribute("supports", supports);

		return "theme/support_add";
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveSupport(Support supports) {
		System.out.println("Hi mata now i am here: " + supports.getName());
		supports.setCreated(new Date());
		supportService.saveSupports(supports);

		return "redirect:/Admin/theme/support/showsupport";
	}

	@RequestMapping("/update/{id}")
	public String updateSupport(Model model, @PathVariable Integer id) {
		getAllHeaderPart(model);

		Support supports =supportService.getSupportById(id);

			supports.setModified(new Date());
		model.addAttribute("supports", supports);
		return "theme/support_add";
	}

	@RequestMapping("/delete/{id}")
	public String supportDelete(Model model, @PathVariable Integer id) {

		supportService.deleteSupports(id);;
		
		return "redirect:/Admin/theme/support/showsupport";

	}


}
