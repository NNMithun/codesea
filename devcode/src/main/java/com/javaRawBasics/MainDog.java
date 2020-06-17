package com.javaRawBasics;

public class MainDog {
    public static void main(String[] args) {
        Dog jimmy=new Dog();
        jimmy.setDogname("jimmy");
        name(jimmy);
        System.out.println(jimmy.getDogname());
    }

    private static void name(Dog dog){
        dog.setDogname("Raja");
        System.out.println(dog.getDogname());

    }
}
