package com.designPatterns.hackerrank;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

/**
 * Created by mithun on 15/06/18.
 */
public class PlusMinus {
    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
        int n=arr.length;
        double negativeCount=0,positiveCount=0,zeroCount=0;
        for (int i=0;i<=n-1;i++)
        {
            if(arr[i]>0)positiveCount++;
            else if(arr[i]<0)negativeCount++;
            else zeroCount++;
        }
        System.out.println(positiveCount/n);
        System.out.println(negativeCount/n);
        System.out.println(zeroCount/n);


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}
