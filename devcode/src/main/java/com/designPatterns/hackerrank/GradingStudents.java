package com.designPatterns.hackerrank;

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class GradingStudents {

    /*
     * Complete the gradingStudents function below.
     */
    static int[] gradingStudents(int[] grades) {
        int[] roundOffGrades= new int[grades.length];
        for (int i=0; i<grades.length;i++){
            int studentMarks=grades[i];
            if (studentMarks%5>=3){
                if ((studentMarks+(studentMarks%5))<40){
                    roundOffGrades[i]=studentMarks;
                }
                else {
                    roundOffGrades[i]=studentMarks+(5-(studentMarks%5));
                }

            }
            else{
                roundOffGrades[i]=studentMarks;
            }
        }

        return roundOffGrades;
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
       // BufferedWriter bw = new BufferedWriter(new FileWriter("/Users/mithun/test.txt"));

        int n = Integer.parseInt(scan.nextLine().trim());

        int[] grades = new int[n];

        for (int gradesItr = 0; gradesItr < n; gradesItr++) {
            int gradesItem = Integer.parseInt(scan.nextLine().trim());
            grades[gradesItr] = gradesItem;
        }

        int[] result = gradingStudents(grades);

        for (int resultItr = 0; resultItr < result.length; resultItr++) {
           // bw.write(String.valueOf(result[resultItr]));
            System.out.println(String.valueOf(result[resultItr]));
           // if (resultItr != result.length - 1) {
              //  bw.write("\n");

           // }
        }

       // bw.newLine();

       // bw.close();
    }
}
