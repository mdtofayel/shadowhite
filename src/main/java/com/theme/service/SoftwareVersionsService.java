package com.theme.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.theme.domain.SoftwareVersions;


@Service
public interface SoftwareVersionsService {
    List<SoftwareVersions> listAllSoftwareVersions();
    SoftwareVersions getSoftwareVersionsById(Integer id);
    SoftwareVersions saveSoftwareVersions(SoftwareVersions softwareVersions);
    void deleteSoftwareVersions(Integer id);
    Optional<List<String>> listOfSoftwareVersion();
    SoftwareVersions findByVersion(String fileName);
    SoftwareVersions checkUniqueNessOfChild(Integer parentId, String name);
}
