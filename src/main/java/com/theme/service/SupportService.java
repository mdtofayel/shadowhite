package com.theme.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.theme.domain.Support;

@Service
public interface SupportService {

	List<Support> listAllSupport();

	Support getSupportById(Integer id);

	Support saveSupports(Support support);

	void deleteSupports(Integer id);

	Optional<List<String>> listOfSupport();

	Support findBySupportName(String fileName);

}
