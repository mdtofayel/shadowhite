package com.theme.serviceImplementation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.theme.domain.Tags;
import com.theme.repository.TagsRepository;
import com.theme.service.TagsService;


@Service
public class TagsServiceImpl implements TagsService {

	
	@Autowired
	TagsRepository tagsRepository;
	
	@Override
	public List<Tags> listAllTags() {
		// TODO Auto-generated method stub
		return tagsRepository.findAll();
	}

	@Override
	public Tags getsofTagsById(Integer id) {
		// TODO Auto-generated method stub
		return tagsRepository.findById(id);
	}

	@Override
	public Tags saveTags(Tags support) {
		// TODO Auto-generated method stub
		return tagsRepository.save(support);
	}

	@Override
	public void deleteTags(Integer id) {
		
		tagsRepository.delete(id);
		
	}

	@Override
	public Optional<List<String>> listOfTages() {
		return null;
	}

	@Override
	public Tags findByTagsName(String tags) {
		return null;
	}
	//P0021
}
