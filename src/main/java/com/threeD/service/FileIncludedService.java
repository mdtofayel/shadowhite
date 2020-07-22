package com.threeD.service;

import com.threeD.domain.FileIncluded;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public interface FileIncludedService {
    List<FileIncluded> listAllFileIncluded();
    FileIncluded getFileIncludedById(Integer id);
    FileIncluded saveFileIncluded(FileIncluded fileIncluded);
    void deleteFileIncluded(Integer id);
    Optional<List<String>> listOfFileName();
    FileIncluded findByFileName(String fileName);
    FileIncluded checkUniqueNessOfChild(int catId, String fileName);
}
