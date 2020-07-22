package com.theme.serviceImplementation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.theme.domain.Categories;
import com.theme.repository.CategoriesRepository;
import com.theme.service.CategoriesService;





@Service
public class CategoriesServiceImpl implements CategoriesService{

    CategoriesRepository categoriesRepository;

    @Autowired
    public void setCategoriesRepository(@Qualifier("categoriesRepository") CategoriesRepository categoriesRepository) {
        this.categoriesRepository = categoriesRepository;
    }

    @Override
    public List<Categories> listAllCatagories() {
        return categoriesRepository.findAll();
    }

    @Override
    public Categories getCatagoriesById(Integer id) {
        return categoriesRepository.getOne(id);
    }

    @Override
    public Categories saveCatagories(Categories categories) {
        return categoriesRepository.save( categories);
    }

    @Override
    public void deleteCatagories(Integer id) {
    	categoriesRepository.delete(id);
    }

    @Override
    public Optional<List<String>> listOfName() {
        return categoriesRepository.findAllName();
    }

	@Override
	public Categories getCatagoriesByName(String name) {
		// TODO Auto-generated method stub
		return categoriesRepository.findByName(name);
	}
}
