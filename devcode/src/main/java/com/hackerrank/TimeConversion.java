package com.hackerrank;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

/**
 * Created by mithun on 04/05/18.
 */
public class TimeConversion {
    /*
    * Complete the timeConversion function below.
    */
    static String timeConversion(String s) {
        /*logic*/
        if (s.endsWith("AM")){
           if(s.startsWith("12")){
               s=s.substring(2,8);
               StringBuilder time= new StringBuilder();
               time.append("00");
               time.append(s);
               return time.toString();
           }
          return s.substring(0,8);
        }
        else if(s.endsWith("PM")){
            if (s.substring(0,2).equals("12")){
                return s.substring(0,8);
            }
            String temp=s.substring(0,2);
            String temp1=s.substring(2,8);
            long i=Long.valueOf(temp)+12;
            String time=String.valueOf(i);
            return time.concat(temp1);
        }
        return "invalid";
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
    //    BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion(s);
        System.out.println(result);
       /* bw.write(result);
        bw.newLine();

        bw.close();*/
    }
}
