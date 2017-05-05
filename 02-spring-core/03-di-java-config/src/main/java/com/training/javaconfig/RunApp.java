package com.training.javaconfig;

import com.training.javaconfig.bean.EmployeeBean;
import com.training.javaconfig.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by amanurat on 3/15/2016 AD.
 */
public class RunApp {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        EmployeeBean bean = context.getBean(EmployeeBean.class);

        System.out.println(bean);

        System.out.println(bean.getAddressBean());
    }
}
