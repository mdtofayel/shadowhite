package com.threeD.serviceImplementation;

import com.threeD.domain.FileIncluded;
import com.threeD.repository.FileIncludedRepository;
import com.threeD.service.FileIncludedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service("fileIncludedServiceThreeD")
public class FileIncludedServiceImpl implements FileIncludedService {

    private FileIncludedRepository fileIncludedRepository;

    @Autowired
    public void setFileIncludedRepository(@Qualifier("fileIncludedRepositoryThreeD") FileIncludedRepository fileIncludedRepository) {
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
	public FileIncluded checkUniqueNessOfChild(int catId, String fileName) {
		// TODO Auto-generated method stub
		return fileIncludedRepository.checkUniqueNessOfChild(catId, fileName);
	}


}
