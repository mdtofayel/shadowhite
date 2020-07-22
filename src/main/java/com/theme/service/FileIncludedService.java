package com.theme.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.theme.domain.FileIncluded;


@Service
public interface FileIncludedService {
    List<FileIncluded> listAllFileIncluded();
    FileIncluded getFileIncludedById(Integer id);
    FileIncluded saveFileIncluded(FileIncluded fileIncluded);
    void deleteFileIncluded(Integer id);
    Optional<List<String>> listOfFileName();
    FileIncluded findByFileName(String fileName);
    //this method for checking UniqueNesss of FileIncluded 
    FileIncluded checkUniqueNessOfChild(Integer parentId,  String name);
}
