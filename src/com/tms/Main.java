package com.tms;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException, NoSuchFieldException {

        Person p = new Person();
        Class info = p.getClass();

        System.out.println(p.getPassword());

        Field field = info.getDeclaredField("password");
        field.setAccessible(true);
        field.set(p, "NEW_PASSWORD");

        System.out.println(p.getPassword());






//        Class info = Class.forName("com.tms.Person");
//        Person person = (Person) info.newInstance();


        //        Person person = new Person("student", "qwertz");
//
//        Class info = person.getClass();
//
//        int mod = info.getModifiers();
//        System.out.println();
//
//        Class[] inter = info.getInterfaces();
//        for (Class c : inter) {
//            System.out.println(c.getName());
//        }

    }
}
