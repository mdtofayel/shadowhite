package com.threeD.controller;

import com.threeD.domain.Badges;
import com.threeD.service.BadgesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/Admin/threeD")
public class BadgesControllerThreeD {

	@Qualifier("badgesServiceThreeD")
	BadgesService badgesService ;
	
	
	@Autowired
	public void setBadgesService(BadgesService badgesService) {
		this.badgesService = badgesService;
	}
	
	@RequestMapping("/badges")
	public String badgesView(Model model){
		 List<Badges> listOfBadges = badgesService.listAllBadges();
		model.addAttribute("listOfBadges",listOfBadges);
		
		return "badges_view";
	}
	
	@RequestMapping("/saveBadges")
	public String saveBadge(Model model){
		Badges badges = new Badges();
		model.addAttribute("badges", badges);
		return "/badges_add";
		
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String solutionBankSave(Badges badges) {
		badges.setCreated(new Date());
		badgesService.saveBadges(badges);
		return "redirect:/Admin/badges";
	}
	
	@RequestMapping("/update/{id}")
	public String updatetNewSolutionBank(Model model, @PathVariable Integer id) {
		Badges badges = badgesService.getBadgesById(id);
		model.addAttribute("badges", badges);
		return "badges_view";
	}
	
	@RequestMapping("/delete/{id}")
	public String  deleteBadges(Model model, @PathVariable Integer id){
		//logger.info("Hi mt_ahmed I am in Delete Method");
		badgesService.deleteBadges(id);
		
		return "redirect:/Admin/badges";
	}
	
}
