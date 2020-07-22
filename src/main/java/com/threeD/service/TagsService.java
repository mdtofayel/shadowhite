package com.threeD.service;

import com.threeD.domain.Tags;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public interface TagsService {
	
	List<Tags> listAllTags();
	Tags getsofTagsById(Integer id);
	Tags saveTags(Tags tags);
    void deleteTags(Integer id);
    Optional<List<String>> listOfTages();
    Tags findByTagsName(String tags);

}
