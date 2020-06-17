package com.javaRawBasics;

public class TestReferenceAndValue {

    public static void main(String[] args) {
        /*int a=3;
        int b=5;
        primitiveValueModifier(a);
        System.out.println("a : "+a);


        a=b; //a->5<-b
        System.out.println("a : "+a);
        a=11;
        System.out.println("a : "+a);
        System.out.println("b : "+b);*/

        Integer c=2;
        Integer d=4;
        objectValueModifier(c);
        System.out.println("c : "+c);





    }
    //pass by value happened
    private static void primitiveValueModifier(int a){
        a=7;
        System.out.println("primitiveValueModifier a : "+a);

    }
    private static void objectValueModifier(Integer c){
        c=1000;
        System.out.println("objectValueModifier c: "+c);

    }
}
