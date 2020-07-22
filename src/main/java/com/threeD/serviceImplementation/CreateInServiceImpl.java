package com.threeD.serviceImplementation;


import com.threeD.domain.CreateIn;
import com.threeD.repository.CreateInRepository;
import com.threeD.service.CreateInService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service("CreateInServiceThreeD")
public class CreateInServiceImpl implements CreateInService {

    CreateInRepository createInRepository;

    @Autowired
    public void setCreateInRepository(@Qualifier("createInRepositoryThreeD") CreateInRepository createInRepository) {
        this.createInRepository = createInRepository;
    }

    @Override
    public List<CreateIn> listAllCreateIn() {
        return createInRepository.findAll();
    }

    @Override
    public CreateIn getCreateInId(Integer id) {
        return createInRepository.findOne(id);
    }

    @Override
    public CreateIn saveCreateIn(CreateIn CreateIn) {
        return createInRepository.save(CreateIn);
    }

    @Override
    public void deleteCreateIn(Integer id) {
    	createInRepository.delete(id);
    }

    @Override
    public Optional<List<String>> listOfCreateIn() {
        return createInRepository.findAllName();
    }

    @Override
    public CreateIn findByCreateInName(String createdIn) {
        return createInRepository.findByName(createdIn);
    }

    @Override
    public CreateIn checkUniqueNessOfChild(Integer catId, String name) {
        return createInRepository.checkUniqueNessOfChild(catId,name);
    }
}
