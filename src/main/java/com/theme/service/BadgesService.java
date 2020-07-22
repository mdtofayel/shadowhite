package com.theme.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.theme.domain.Badges;

@Service
public interface BadgesService {

    List<Badges> listAllBadges();
    Badges getBadgesById(Integer id);
    Badges saveBadges(Badges badges);
    void deleteBadges(Integer id);
}
