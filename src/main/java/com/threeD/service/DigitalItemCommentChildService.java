package com.threeD.service;

import com.threeD.domain.DigitalItemCommentChild;


public interface DigitalItemCommentChildService {

    Iterable<DigitalItemCommentChild> listAllDigitalItemCommentChild();
    DigitalItemCommentChild getDigitalItemCommentChildById(Integer id);
    DigitalItemCommentChild saveDigitalItemCommentChild(DigitalItemCommentChild digitalItems);
    void deleteDigitalItemCommentChild(Integer id);

}
