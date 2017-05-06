package com.training;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Assanai Manurat on 5/6/2017 AD.
 */
public class GreetingConstructor {

    private String text = "default constructor text";

    GreetingConstructor(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        GreetingConstructor greetingConstructor = context.getBean(GreetingConstructor.class);
        System.out.println(greetingConstructor.getText());

    }
}
