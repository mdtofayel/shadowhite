package com.threeD.service;

import com.threeD.domain.DigitalItemComments;


public interface DigitalItemCommentsService {
    Iterable<DigitalItemComments> listAllDigitalItemComments();
    DigitalItemComments getDigitalItemCommentsById(Integer id);
    DigitalItemComments saveDigitalItemComments(DigitalItemComments digitalItems);
    void deleteDigitalItemComments(Integer id);
}
