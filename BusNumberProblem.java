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
public class BusNumberProblem {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        
        int busses = r.nextInt();
        int numbers[] = new int[busses];
        
        // fill number of bus
        for (int i = 0; i < busses; i++) {
            numbers[i] = r.nextInt();
        }
        
        // sorting
        for (int i = 1; i < busses; i++) {
            for (int j = i; j > 0; j--) {
                // swap
                if (numbers[j - 1] > numbers[j]) {
                    int temp = numbers[j - 1];
                    numbers[j - 1] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        
        // check the space (minus 1 from prev element)
        int counter = 0;
        // print first element
        System.out.print(numbers[0]);
        if (numbers[1] - 1 == numbers[0]) counter++;
        
        for (int i = 1; i < busses; i++) {
            // check the line
            if (i + 1 < busses && counter == 0 && numbers[i + 1] - 1 == numbers[i]) {
                System.out.print(" " + numbers[i]);
                counter++;
            } else if (i + 1 < busses && counter >= 0 && numbers[i + 1] - 1 == numbers[i]) {
                counter++;
            } else if (i + 1 < busses && numbers[i + 1] - 1 != numbers[i]) {
                if (counter > 1) System.out.print("-" + numbers[i]);
                else System.out.print(" " + numbers[i]);
                
                counter = 0;
            }
        }
    }
}
