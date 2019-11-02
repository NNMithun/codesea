package com.designPatterns.hackerrank;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class HourGlassProblem {
    private static final Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) throws IOException {

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(new File("./outPut.txt")));

        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int result = hourglassSum(arr);

       bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();


    }

    private static int hourglassSum(int[][] arr) {
        List<Integer> sumList= new ArrayList<Integer>();

        for (int row=0;row<arr.length-2;row++){
            int sum=0;
            for (int col=1;col<arr.length-2;col++){

                sum=    arr[row][col-1]+
                        arr[row][col]+
                        arr[row][col+1]+
                        arr[row+1][col]+
                        arr[row+2][col]+
                        arr[row+2][col]+
                        arr[row+2][col];

                sumList.add(sum);

            }


        }
        Collections.sort(sumList);
        return sumList.get(sumList.size()-1);

    }
}
