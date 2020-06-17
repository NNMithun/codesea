package com.DynamicProgramming;

import java.util.HashMap;

public class PracticeFibonacci {

    public static void main(String[] args) {
        int n=8;
        HashMap<Integer,Integer> lookup= new HashMap<>();
        fib(n, lookup);
    }
    //0 1 2 3 4 5
    //0 1 1 2 3 5
    private static int fib(Integer n, HashMap<Integer, Integer> lookup) {
        if(n<=1){
            return 1;
        }
        if(!lookup.containsKey(n)){
           int val=fib(n-1,lookup)+fib(n-2,lookup);
            lookup.put(n,val);
        }
        return lookup.get(n);

    }

}
