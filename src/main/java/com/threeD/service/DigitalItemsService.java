package com.threeD.service;

import com.threeD.domain.DigitalItemComments;
import com.threeD.domain.DigitalItems;

import java.util.List;

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
