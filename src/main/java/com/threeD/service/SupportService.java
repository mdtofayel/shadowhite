package com.threeD.service;

import com.threeD.domain.Support;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface SupportService {

	List<Support> listAllSupport();

	Support getSupportById(Integer id);

	Support saveSupports(Support support);

	void deleteSupports(Integer id);

	Optional<List<String>> listOfSupport();

	Support findBySupportName(String fileName);

}
