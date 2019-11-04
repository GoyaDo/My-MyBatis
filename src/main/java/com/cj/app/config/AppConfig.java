package com.cj.app.config;

import com.cj.app.dao.CityDao;
import com.cj.app.test.Test;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;
import java.lang.reflect.Proxy;

/**
 * @author cj
 * @date 2019-11-03 - 17:44
 * bean配置类
 */
@ComponentScan("com.cj")
@Configuration
//@MapperScan("com.cj.app.dao")
@MyScan //让自己写的的MyBeanFactoryPostProcessor注册进来以实现MyFactoryBean
public class AppConfig {
//    @Bean
//    public SqlSessionFactory sqlSessionFactory() throws Exception {
//        SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
//        factoryBean.setDataSource(dataSource());
//        return factoryBean.getObject();
//    }
//
//    @Bean
//    public DataSource dataSource(){
//        DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
//        driverManagerDataSource.setDriverClassName("com.mysql.jdbc.Driver");
//        driverManagerDataSource.setUsername("root");
//        driverManagerDataSource.setPassword("123456");
//        driverManagerDataSource.setUrl("jdbc:mysql://localhost:3306/test?useUnicode=utf-8");
//        return driverManagerDataSource;
//
//    }
//
//    public CityDao cityDao(){
//        Class[] classes = new Class[]{CityDao.class};
//        CityDao cityDao = (CityDao) Proxy.newProxyInstance(Test.class.getClassLoader(),classes,new MyInvocationHandler());
//        return cityDao;
//    }

}
