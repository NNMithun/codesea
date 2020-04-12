package com.hackerRank.Arrays2D;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class ArrayRotation {

    // Complete the rotLeft function below.
    static int[] rotLeft(int[] a, int d) {
        HashMap<Integer, Integer> h= new HashMap<>();
        for(int i=0;i<d;i++){
            h.put(i,a[i]);
        }
        for(int i=d;i<a.length;i++){
            a[i-d]= a[i];
        }

        for(int i=0;i<d;i++){
            a[(a.length-d)+i]= h.get(i);
        }

        for (int i:a
                ) {
            System.out.print(i);
        }

        return a;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
int[] a={1,2,3,4,5};
        rotLeft(a,2);
    }
}
