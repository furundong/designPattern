package com.example;

import cn.designPattern.dp.creator._3_abstractFactory.example1.Drink;

import java.io.Serializable;

public class Cola implements Drink, Serializable {
    private String name;

    public Cola() {
    }

    public Cola(String name, String company) {
        this.name = name;
        this.company = company;
    }

    @Override
    public String toString() {
        return "Cola{" +
                "name='" + name + '\'' +
                ", company='" + company + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    private String company;

    public void drink() {
        System.out.println("喝可乐");
    }
}
