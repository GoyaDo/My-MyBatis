package com.cj.app.service.impl;

import com.cj.app.dao.CityDao;
import com.cj.app.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author cj
 * @date 2019-11-03 - 17:52
 */
@Component
public class CityServiceImpl implements CityService {

    @Autowired
    CityDao dao;

    @Override
    public void queryAll() {
        System.out.println(dao.queryAll());
    }
}
