package com.theme.serviceImplementation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.theme.domain.FileIncluded;
import com.theme.repository.FileIncludedRepository;
import com.theme.service.FileIncludedService;





@Service
public class FileIncludedServiceImpl implements FileIncludedService{

    private FileIncludedRepository fileIncludedRepository;

    @Autowired
    public void setFileIncludedRepository(@Qualifier("fileIncludedRepository") FileIncludedRepository fileIncludedRepository) {
        this.fileIncludedRepository = fileIncludedRepository;
    }

    @Override
    public List<FileIncluded> listAllFileIncluded() {
        return fileIncludedRepository.findAll();
    }

    @Override
    public FileIncluded getFileIncludedById(Integer id) {
        return fileIncludedRepository.findOne(id);
    }

    @Override
    public FileIncluded saveFileIncluded(FileIncluded fileIncluded) {
        return fileIncludedRepository.save(fileIncluded);
    }

    @Override
    public void deleteFileIncluded(Integer id) {
    			fileIncludedRepository.delete(id);
    }

    @Override
    public Optional<List<String>> listOfFileName() {
        return fileIncludedRepository.findAllName();
    }

    @Override
    public FileIncluded findByFileName(String fileName) {
        return fileIncludedRepository.findByName(fileName);
    }

	@Override
	public FileIncluded checkUniqueNessOfChild(Integer parentId, String name) {
		// TODO Auto-generated method stub
		return fileIncludedRepository.checkUniqueNessOfChild(parentId, name);
	}


}
