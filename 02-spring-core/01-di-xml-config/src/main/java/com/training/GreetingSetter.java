package com.training;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class GreetingSetter {

    private String text = "default setter text";
    private AnotherBean anotherBean;
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        GreetingSetter greetingSetter = context.getBean(GreetingSetter.class);

        AnotherBean anotherBean = greetingSetter.getAnotherBean();
        System.out.println(anotherBean.getName());
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public AnotherBean getAnotherBean() {
        return anotherBean;
    }

    public void setAnotherBean(AnotherBean anotherBean) {
        this.anotherBean = anotherBean;
    }
}
