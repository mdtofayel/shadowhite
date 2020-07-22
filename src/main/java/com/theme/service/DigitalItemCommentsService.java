package com.theme.service;

import com.theme.domain.DigitalItemComments;


public interface DigitalItemCommentsService {
    Iterable<DigitalItemComments> listAllDigitalItemComments();
    DigitalItemComments getDigitalItemCommentsById(Integer id);
    DigitalItemComments saveDigitalItemComments(DigitalItemComments digitalItems);
    void deleteDigitalItemComments(Integer id);
}
