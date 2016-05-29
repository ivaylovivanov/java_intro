/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java_Syntax;

import java.util.Scanner;

/**
 *
 * @author Ivailo
 */
public class P10_Hit_Target {
    public static void main(String[] args) {
        System.out.print("Please enter two digits, separated by space: ");
        Scanner sc = new Scanner(System.in);
        int temp = sc.nextInt();
        
        for (int i = 1; i <= 20; i++) {
            for (int j = 1; j <= 20; j++) {
                if (i + j == temp) {
                    System.out.println( i + " + " + j + " = " + temp);
                }
            }
        }
        
        for (int i = 20; i >= 1; i--) {
            for (int j = 20; j >= 1; j--) {
                if (i - j == temp) {
                    System.out.println( i + " - " + j + " = " + temp);
                }
            }
        }
    }
}
