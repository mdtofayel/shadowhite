package com.theme.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.theme.domain.Tags;




@Service
public interface TagsService {
	
	List<Tags> listAllTags();
	Tags getsofTagsById(Integer id);
	Tags saveTags(Tags tags);
    void deleteTags(Integer id);
    Optional<List<String>> listOfTages();
    Tags findByTagsName(String tags);

}
