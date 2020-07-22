package com.theme.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.theme.domain.CompatibleWith;
@Service
public interface CompatibleWithService {

	 List<CompatibleWith> listAllCompatibleWith();
	 CompatibleWith getCompatibleWithById(Integer id);
	 CompatibleWith saveCompatibleWith(CompatibleWith compatibleWith);
	    void deleteCompatibleWith(Integer id);
	    Optional<List<String>> listOfCompatibleWith();
	    CompatibleWith findByCompatibleWith(String compatibleWith);
	  CompatibleWith checkUniqueNessOfChild(Integer parentId, String name);
}
