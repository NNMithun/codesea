package com.recursion;

public class RecursionSumOfN {
    public static void main(String[] args) {
//        int n=count(4);
        String s=reverseString("String");
        System.out.println(s);
    }
    private static int sum(int n){
        System.out.println(n);
        if(n==0){
            return n;
        }
        return sum(--n)+n;
    }
    private static int count(int n){
        System.out.println(n);
        if(n==0 ){

            return 1;
        }

        return count(n-1)+count(n-1)+count(n-1);
    }
    private static String reverseString(String s){
        if(s.equals("") ){

            return "";
        }

        return reverseString(s.substring(1))+s.charAt(0);
    }
}
