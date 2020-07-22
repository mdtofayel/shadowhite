package com.threeD.service;

import com.threeD.domain.Badges;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BadgesService {

    List<Badges> listAllBadges();
    Badges getBadgesById(Integer id);
    Badges saveBadges(Badges badges);
    void deleteBadges(Integer id);
}
