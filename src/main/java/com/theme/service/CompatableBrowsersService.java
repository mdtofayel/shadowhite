package com.theme.service;


import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.theme.domain.CompatableBrowsers;



@Service
public interface CompatableBrowsersService {

    List<CompatableBrowsers> listAllCompatableBrowsers();
    CompatableBrowsers getCompatableBrowsersById(Integer id);
    CompatableBrowsers saveCompatableBrowsers(CompatableBrowsers compatableBrowsers);
    void deleteCompatableBrowsers(Integer id);
    Optional<List<String>> listOfBrowsersName();
    CompatableBrowsers findByBrowsers(String browser);
    CompatableBrowsers checkUniqueNessOfChild(Integer parentId, String name);
}
