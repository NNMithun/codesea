package com.hackerrank;
import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

/**
 * Created by mithun on 04/05/18.
 */
public class BirthdayCakeCandles {

    /*
     * Complete the birthdayCakeCandles function below.
     */
    static int birthdayCakeCandles(int n, int[] ar) {

        int max = 0, maxCount=0,tmp=0;
        for (int i = 0; i < n; i++) {
            max = (max > ar[i]) ? max :ar[i];
            if(max==tmp){
                if(max==ar[i]){
                    maxCount++;
                 tmp=max;
                }
            }
            else{
                maxCount=1;
                tmp=max;
            }

        }
       return maxCount;
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(scan.nextLine().trim());

        int[] ar = new int[n];

        String[] arItems = scan.nextLine().split(" ");

        for (int arItr = 0; arItr < n; arItr++) {
            int arItem = Integer.parseInt(arItems[arItr].trim());
            ar[arItr] = arItem;
        }

        int result = birthdayCakeCandles(n, ar);

        bw.write(String.valueOf(result));
        bw.newLine();

        bw.close();
    }
}
