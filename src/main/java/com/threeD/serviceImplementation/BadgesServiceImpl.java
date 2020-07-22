package com.threeD.serviceImplementation;

import com.threeD.domain.Badges;
import com.threeD.repository.BadgesRepository;
import com.threeD.service.BadgesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("badgesServiceThreeD")
public class BadgesServiceImpl implements BadgesService {

	private BadgesRepository badgesRepository;

	@Autowired
	public void setBadgesRepository(@Qualifier("badgesRepositoryThreeD") BadgesRepository badgesRepository) {
		this.badgesRepository = badgesRepository;
	}

	@Override
	public List<Badges> listAllBadges() {
		return badgesRepository.findAll();
	}

	@Override
	public Badges getBadgesById(Integer id) {
		return badgesRepository.findOne(id);
	}

	@Override
	public Badges saveBadges(Badges badges) {
		return badgesRepository.save(badges);
	}

	@Override
	public void deleteBadges(Integer id) {
		badgesRepository.delete(id);
	}
}
