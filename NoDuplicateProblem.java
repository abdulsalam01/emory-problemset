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
public class NoDuplicateProblem {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        
        String words = r.nextLine();
        if (words.length() > 80) System.exit(0);

        String arrWords[] = words.split(" ");
        // add flag
        boolean flag = true;
        
        // solve problem
        for (int i = 0; i < arrWords.length; i++) {
            for (int j = i + i; j < arrWords.length; j++) {

                if (arrWords[i].equals(arrWords[j]) && i != j) {
                    flag = false;
                    break;
                }
            }
        }
        
        System.out.println(flag ? "yes" : "no");
    }
}
