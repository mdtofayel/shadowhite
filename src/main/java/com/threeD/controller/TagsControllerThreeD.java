package com.threeD.controller;

import com.threeD.domain.Tags;
import com.threeD.service.TagsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/Admin/threeD/tags")
public class TagsControllerThreeD {
	
	
	@Autowired
    TagsService tagsService;
	
	@RequestMapping("/showtags")
	public String showTags(Model model) {
		List<Tags> listOfTags = tagsService.listAllTags();
		model.addAttribute("listOfTags", listOfTags);
		return "threeD/tags_view";
	}

	@RequestMapping("/tagsAdd")
	public String tagsAdd(Model model) {
		Tags tags = new Tags() ;
		model.addAttribute("tags", tags);

		return "threeD/tags_add";
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveTags(Tags tags) {
		System.out.println("Hi mata now i am here: " + tags.getName());
		tags.setCreated(new Date());
		tagsService.saveTags(tags);

		return "redirect:/Admin/threeD/tags/showtags";
	}

	@RequestMapping("/update/{id}")
	public String updateTags(Model model, @PathVariable Integer id) {

		Tags tags =tagsService.getsofTagsById(id);

			tags.setModified(new Date());
		model.addAttribute("tags", tags);
		return "threeD/tags_add";
	}

	@RequestMapping("/delete/{id}")
	public String tagsDelete(Model model, @PathVariable Integer id) {

		tagsService.deleteTags(id);;
		
		return "redirect:/Admin/threeD/tags/showtags";

	}
}
