package com.cj.app.config;

import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author cj
 * @date 2019-11-04 - 23:02
 */
public class MyImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {
    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        //不能填写那个具体bean，不然也是交给spring容器new，需要自己new
        //mybatis提供了一个MapperFactoryBean去实现
        BeanDefinitionBuilder beanDefinitionBuilder = BeanDefinitionBuilder.genericBeanDefinition(MyFactoryBean.class);
        GenericBeanDefinition beanDefinition = (GenericBeanDefinition) beanDefinitionBuilder.getBeanDefinition();
        //这个beanDefinition里面有传入参数的构造方法
        beanDefinition.getConstructorArgumentValues().addGenericArgumentValue("com.cj.app.dao.CityDao");
        registry.registerBeanDefinition("cityDao",beanDefinition);
    }
}
