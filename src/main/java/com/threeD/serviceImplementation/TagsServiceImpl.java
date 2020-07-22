package com.threeD.serviceImplementation;

import com.threeD.domain.Tags;
import com.threeD.repository.TagsRepository;
import com.threeD.service.TagsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service("tagsServiceThreeD")
public class TagsServiceImpl implements TagsService {


    @Autowired
    @Qualifier("tagsRepositoryThreeD")
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
