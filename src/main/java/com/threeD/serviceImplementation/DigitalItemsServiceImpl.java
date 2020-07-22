package com.threeD.serviceImplementation;

import com.threeD.domain.DigitalItemComments;
import com.threeD.domain.DigitalItemRating;
import com.threeD.domain.DigitalItems;
import com.threeD.repository.DigitalItemsRepositoy;
import com.threeD.service.DigitalItemsService;
import org.apache.commons.collections.IteratorUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;


@Service("digitalItemsServiceThreeD")
public class DigitalItemsServiceImpl implements DigitalItemsService {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    private DigitalItemsRepositoy digitalItemsRepositoy;

    @Autowired
    public void setDigitalItemsRepositoy(@Qualifier("digitalItemsRepositoyThreeD") DigitalItemsRepositoy digitalItemsRepositoy) {
        this.digitalItemsRepositoy = digitalItemsRepositoy;
    }

    @Override
    public List<DigitalItems> listAllDigitalItems() {
        return digitalItemsRepositoy.findAllByOrderByIdDesc();
    }

    @Override
    public DigitalItems getProductById(Integer id) {
        DigitalItems digitalItems = digitalItemsRepositoy.findOne(id);
        System.out.println("");
        return digitalItems;
    }

    @Override
    public DigitalItems saveProduct(DigitalItems digitalItems) {
        return digitalItemsRepositoy.save(digitalItems);
    }

    @Override
    public void deleteProduct(Integer id) {

    }


    @Override
    public List<DigitalItemComments> getCommentListsByDigitalItem(Integer id) {
        DigitalItems digitalItems = digitalItemsRepositoy.findOne(id);
        Iterator<DigitalItemComments> it = digitalItems.getDigitalItemComments().iterator();
        List<DigitalItemComments> digitalItemComments = IteratorUtils.toList(it);
        return digitalItemComments;
    }

    @Override
    public String getItemRating(DigitalItems digitalItems) {
        float total =0.0f;
        float average =0.0f;
        String avg;
        if(digitalItems.getDigitalItemRatingList().size()>=3){
            float sizeOfRating = digitalItems.getDigitalItemRatingList().size();
            for (DigitalItemRating f: digitalItems.getDigitalItemRatingList()) {
                total += f.getRating();
            }
            average = total/sizeOfRating;
            avg = String.format("%.2f", average);
        }
        else {
            avg = "Minimum of 3 votes required";
        }
        return avg;
    }

    @Override
    public List<DigitalItems> listOfDigitalItemsByPrice(Integer price) {
        return digitalItemsRepositoy.findByPrice(price);
    }

    @Override
    public DigitalItems getDigitalItemsByName(String name) {
        return digitalItemsRepositoy.findDigitalItemsByName(name);
    }


    public String getDateTimeCount(Date d1) {
        Date d2 = new Date();
        long diff = d2.getTime() - d1.getTime();
        long day = TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
        return day+"";
    }

}
