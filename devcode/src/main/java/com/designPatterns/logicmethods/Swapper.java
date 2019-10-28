package com.designPatterns.logicmethods;

import java.util.Scanner;

/**
 * Created by mithun on 14/09/17.
 */
public class Swapper {
    private int a;
    private int b;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int swap() {
        int temp;

        Scanner scan=new Scanner(System.in);
        System.out.println("enter value for a");
        a=scan.nextInt();
        System.out.println("enter value for b");
        b=scan.nextInt();
        System.out.println("nBefore Swap:na="+a+"tb="+b);

        temp = a;
        a = b;
        b = temp;

        return a;
    }
}
