package com.training.annotation;

import org.springframework.stereotype.Component;

@Component
public class PersonAddress {

    private String no = "99";
    private String street = "XX";
    private String country ="Thai";
    private int zipcode = 10200;

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getZipcode() {
        return zipcode;
    }

    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }

    @Override
    public String toString() {
        return "PersonAddress{" +
                "no='" + no + '\'' +
                ", street='" + street + '\'' +
                ", country='" + country + '\'' +
                ", zipcode=" + zipcode +
                '}';
    }
}
