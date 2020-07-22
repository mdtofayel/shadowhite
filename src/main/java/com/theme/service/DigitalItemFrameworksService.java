package com.theme.service;

import com.theme.domain.DigitalItemFrameworks;

import java.util.List;

/**
 * Created by Tofayel Ahmed on  8/13/17.
 */
public interface DigitalItemFrameworksService {
    List<DigitalItemFrameworks> listAllDigitalItemFrameworks();
    DigitalItemFrameworks getDigitalItemFrameworksById(Integer id);
    DigitalItemFrameworks saveDigitalItemFrameworks(DigitalItemFrameworks digitalItemFrameworks);
    void deleteDigitalItemFrameworks(Integer id);
}
