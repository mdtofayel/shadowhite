package com.theme.service;

import java.util.List;

import com.theme.domain.DigitalItemComments;
import com.theme.domain.DigitalItems;

public interface DigitalItemsService {

    List<DigitalItems> listAllDigitalItems();

    DigitalItems getProductById(Integer id);

    DigitalItems saveProduct(DigitalItems digitalItems);

    void deleteProduct(Integer id);

    List<DigitalItemComments> getCommentListsByDigitalItem(Integer id);

    String getItemRating(DigitalItems digitalItems);

    List<DigitalItems> listOfDigitalItemsByPrice(Integer price);

    DigitalItems getDigitalItemsByName(String name);



}
