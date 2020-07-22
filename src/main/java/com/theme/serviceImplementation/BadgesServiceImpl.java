package com.theme.serviceImplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.theme.domain.Badges;
import com.theme.repository.BadgesRepository;
import com.theme.service.BadgesService;


@Service
public class BadgesServiceImpl implements BadgesService {

	private BadgesRepository badgesRepository;

	@Autowired
	public void setBadgesRepository(@Qualifier("badgesRepository") BadgesRepository badgesRepository) {
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
