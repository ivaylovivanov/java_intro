/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intro.java.homework;

import java.util.Scanner;

/**
 *
 * @author Ivailo
 */
public class P7_Sum_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lines = sc.nextInt();
        int sum = 0;
        
        for (int i = 1; i <= lines; i++) {
            sum += i;
        }
        
        System.out.print(sum);
    }
}
