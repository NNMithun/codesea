package com.designPatterns.hackerrank;

/**
 * Created by mithun on 14/06/18.
 */
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class DiagonalDifference {

    // Complete the diagonalDifference function below.
    static int diagonalDifference(int[][] a) {
        int n=a[0].length;
        int pDiagonalSum=0,sDiagonalSum=0,diagonalDifference=0;
        for(int i=0;i<n;i++){
            pDiagonalSum+=a[i][i];
        }
        for(int i=n-1;i>=0;i--){
            sDiagonalSum+=a[(n-1)-i][i];
        }

        diagonalDifference=pDiagonalSum-sDiagonalSum;
        return Math.abs(diagonalDifference);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("/Users/mithun/test.txt"));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[][] a = new int[n][n];

        for (int i = 0; i < n; i++) {
            String[] aRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < n; j++) {
                int aItem = Integer.parseInt(aRowItems[j]);
                a[i][j] = aItem;
            }
        }

        int result = diagonalDifference(a);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

