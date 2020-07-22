package com.theme.service;

import com.theme.domain.DigitalItemCommentChild;


public interface DigitalItemCommentChildService {

    Iterable<DigitalItemCommentChild> listAllDigitalItemCommentChild();
    DigitalItemCommentChild getDigitalItemCommentChildById(Integer id);
    DigitalItemCommentChild saveDigitalItemCommentChild(DigitalItemCommentChild digitalItems);
    void deleteDigitalItemCommentChild(Integer id);

}
