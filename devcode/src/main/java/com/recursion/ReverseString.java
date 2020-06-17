package com.recursion;

public class ReverseString {

    public static void main(String[] args) {

       String s= reverseString("STRING");
        System.out.println(s);

    }

    //"aaaa "


    private static String reverseString(String str) {

        if(str.length()<=1){
            return str;
        }
        return reverseString(str.substring(1)+str.charAt(0));

    }

    /*"1234"
    *
    *  */



}
