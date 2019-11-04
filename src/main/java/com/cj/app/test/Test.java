package com.cj.app.test;

import com.cj.app.config.AppConfig;
import com.cj.app.dao.CityDao;
import com.cj.app.service.CityService;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author cj
 * @date 2019-11-03 - 18:09
 */
public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);


        ac.getBean(CityService.class).queryAll();
//        GenericBeanDefinition genericBeanDefinition = new GenericBeanDefinition();
//        genericBeanDefinition.setBeanClassName("user");
//        genericBeanDefinition.setScope("singleton");
//        genericBeanDefinition.setBeanClass(com.cj.app.entity.User.class);
//        genericBeanDefinition.setLazyInit(false);
//        genericBeanDefinition.setAbstract(false);
//
//        ac.getBean(CityService.class).queryAll();




        //纯mybatis
//        SqlSessionFactory sqlSessionFactory = null;
//        SqlSession session = sqlSessionFactory.openSession();
//        CityDao dao = session.getMapper(CityDao.class);
    }
}
