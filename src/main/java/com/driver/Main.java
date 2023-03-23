package com.driver;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        RWOnly r = new RWOnly();
        r.setName("rashmika");
        System.out.println(r.getName());
//        'name' has private access in 'com.driver.RWOnly'
    }
}