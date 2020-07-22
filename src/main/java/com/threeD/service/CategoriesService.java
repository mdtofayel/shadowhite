package com.threeD.service;


import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.threeD.domain.Categories;


@Service
public interface CategoriesService {
    List<Categories> listAllCatagories();
    Categories getCatagoriesById(Integer id);
    Categories saveCatagories(Categories categories);
    void deleteCatagories(Integer id);
    Optional<List<String>> listOfName();
    Categories getCatagoriesByName(String name);
   /* Categories checkUniqueNessOfParents(int parentId,String name);*/
}


