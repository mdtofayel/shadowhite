package com.theme.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.theme.domain.Frameworks;


@Service
public interface FrameworkService {

    List<Frameworks> listAllframeworks();
    Frameworks getframeworksById(Integer id);
    Frameworks saveframeworks(Frameworks frameworks);
    void deleteframeworks(Integer id);
    Frameworks checkUniqueNessOfChild(Integer parentId, String name);
}
