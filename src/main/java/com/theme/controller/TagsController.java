package com.theme.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import com.theme.domain.Tags;
import com.theme.service.TagsService;

@Controller
@RequestMapping("/Admin/theme/tags")
public class TagsController {
	
	
	@Autowired
	TagsService tagsService;
	
	@RequestMapping("/showtags")
	public String showTags(Model model) {
		List<Tags> listOfTags = tagsService.listAllTags();
		model.addAttribute("listOfTags", listOfTags);
		return "theme/tags_view";
	}

	@RequestMapping("/tagsAdd")
	public String tagsAdd(Model model) {
		Tags tags = new Tags() ;
		model.addAttribute("tags", tags);

		return "theme/tags_add";
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveTags(Tags tags) {
		System.out.println("Hi mata now i am here: " + tags.getName());
		tags.setCreated(new Date());
		tagsService.saveTags(tags);

		return "redirect:/Admin/theme/tags/showtags";
	}

	@RequestMapping("/update/{id}")
	public String updateTags(Model model, @PathVariable Integer id) {

		Tags tags =tagsService.getsofTagsById(id);

			tags.setModified(new Date());
		model.addAttribute("tags", tags);
		return "theme/tags_add";
	}

	@RequestMapping("/delete/{id}")
	public String tagsDelete(Model model, @PathVariable Integer id) {

		tagsService.deleteTags(id);;
		
		return "redirect:/Admin/theme/tags/showtags";

	}
}
