package com.theme.service;



import com.theme.domain.DigitalItemCompatibleWith;

import java.util.List;

public interface DigitalItemCompatibleWithService {
    List<DigitalItemCompatibleWith> listAllDigitalItemCompatibleWith();
    DigitalItemCompatibleWith getDigitalItemCompatibleWithById(Integer id);
    DigitalItemCompatibleWith saveDigitalItemCompatibleWith(DigitalItemCompatibleWith digitalItemCompatibleWith);
    void deleteDigitalItemCompatibleWith(Integer id);
}
