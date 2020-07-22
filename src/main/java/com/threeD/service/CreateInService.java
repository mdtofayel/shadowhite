package com.threeD.service;


import com.threeD.domain.CreateIn;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public interface CreateInService {

    List<CreateIn> listAllCreateIn();
    CreateIn getCreateInId(Integer id);
    CreateIn saveCreateIn(CreateIn createIn);
    void deleteCreateIn(Integer id);
    Optional<List<String>> listOfCreateIn();
    CreateIn findByCreateInName(String createIn);
    CreateIn checkUniqueNessOfChild(Integer catId, String name);
}
