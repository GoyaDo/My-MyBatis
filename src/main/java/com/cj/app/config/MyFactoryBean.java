package com.cj.app.config;

import com.cj.app.dao.CityDao;
import org.springframework.beans.factory.FactoryBean;

import java.lang.reflect.Proxy;

/**
 * @author cj
 * @date 2019-11-04 - 23:05
 */
public class MyFactoryBean implements FactoryBean {
    public MyFactoryBean (Class mapperInterface){
        this.mapperInterface = mapperInterface;
    }
    Class mapperInterface;
    @Override
    public Object getObject() throws Exception {
        Object o = Proxy.newProxyInstance(FactoryBean.class.getClassLoader(), new Class[]{CityDao.class}, new MyInvocationHandler());

        return o;
    }

    @Override
    public Class<?> getObjectType() {
        return mapperInterface;
    }
}
