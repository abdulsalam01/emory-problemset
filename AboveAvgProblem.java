/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emory;

import java.util.Scanner;

/**
 *
 * @author abdul
 */
public class AboveAvgProblem {

    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);

        int nCase = r.nextInt();
        int finalGrades[][] = new int[nCase][1000];
        // temp count all students in 1 class
        int students[] = new int[nCase];
        
        // fill final grades 
        for (int i = 0; i < nCase; i++) {
            int student = r.nextInt();
            // fill students class
            students[i] = student;

            for (int j = 0; j < student; j++) {
                finalGrades[i][j] = r.nextInt();
            }
        }

        // get average per line
        int avg[] = new int[nCase];

        for (int i = 0; i < nCase; i++) {
            int sum = 0;
            for (int j = 0; j <= finalGrades[i][0]; j++) {
                sum += finalGrades[i][j];
            }

            avg[i] = sum / students[i];
        }
        
        // check the student that above avg
        int countAvg[] = new int[nCase];        
        
        for (int i = 0; i < nCase; i++) {
            for (int j = 0; j <= finalGrades[i][0]; j++) {
                if (finalGrades[i][j] > avg[i]) countAvg[i]++;
            }
        }
        
        // print solution (studentAboveAvg / totalStudent * 100)
        for (int i = 0; i < nCase; i++) {
            float percentange = ((float) (countAvg[i] * 100f) / students[i]);
            System.out.printf("%.3f", percentange);
            System.out.println("%");
        }
    }
}
