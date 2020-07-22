package com.threeD.serviceImplementation;



import com.threeD.domain.DigitalItemVersions;
import com.threeD.repository.DigitalItemVersionsRepository;
import com.threeD.service.DigitalItemVersionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("digitalItemVersionsServiceThreeD")
public class DigitalItemVersionsServiceImpl implements DigitalItemVersionsService {

    DigitalItemVersionsRepository digitalItemVersionsRepository;

    @Autowired
    public void setDigitalItemVersionsRepository(@Qualifier("digitalItemVersionsRepositoryThreeD") DigitalItemVersionsRepository digitalItemVersionsRepository) {
        this.digitalItemVersionsRepository = digitalItemVersionsRepository;
    }

    @Override
    public Iterable<DigitalItemVersions> listAllDigitalItemVersionsScreens() {
        return null;
    }

    @Override
    public DigitalItemVersions getDigitalItemVersionsById(Integer id) {
        return digitalItemVersionsRepository.getOne(id);
    }

    @Override
    public DigitalItemVersions saveDigitalItemVersions(DigitalItemVersions digitalItemVersions) {
        return digitalItemVersionsRepository.save(digitalItemVersions);
    }

    @Override
    public void deleteDigitalItemVersions(Integer id) {

    }
}
