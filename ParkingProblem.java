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
public class ParkingProblem {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        
        int nCase = r.nextInt();
        int longStreets[][] = new int[nCase][99];
        
        // fill longstreet distance
        for (int i = 0; i < nCase; i++) {
            int stores = r.nextInt();
            
            for (int j = 0; j < stores; j++) {
                longStreets[i][j] = r.nextInt();
            }
        }
        
        // min-distance
        int min[] = new int[nCase];
        int max[] = new int[nCase];
        
        // fill min-distance with max val
        for (int i = 0; i < nCase; i++) min[i] = Integer.MAX_VALUE;
        
        // solve problem
        for (int i = 0; i < nCase; i++) {
            for (int j = 0; j <= longStreets[i][0]; j++) {
                // find min-elem
                if (min[i] > longStreets[i][j] && longStreets[i][j] > 0) min[i] = longStreets[i][j];
                // find max-elem
                if (max[i] < longStreets[i][j] && longStreets[i][j] > 0) max[i] = longStreets[i][j];
            }
        }
        
        //max - min * 2 (two ways)
        for (int i = 0; i < nCase; i++) {
            int res = (max[i] - min[i]) * 2;
            System.out.println(res);
        }
    }
}
