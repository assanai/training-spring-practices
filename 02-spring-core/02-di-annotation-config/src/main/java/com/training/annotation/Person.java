package com.training.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class Person {

    private String firstName = "Assanai";
    private String lastName = "Manurat";

    @Autowired
    private PersonAddress personAddress;

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        Person person = context.getBean(Person.class);

        System.out.println("My name is : " + person.getFirstName() + " "+ person.getLastName());
        PersonAddress personAddress = person.getPersonAddress();
        System.out.println("My address is : " + personAddress.toString());
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public PersonAddress getPersonAddress() {
        return personAddress;
    }

    public void setPersonAddress(PersonAddress personAddress) {
        this.personAddress = personAddress;
    }
}
