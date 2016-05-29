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
public class P5_Calculate_expression {
    public static void main(String[] args) {
        System.out.print("Please enter three digits, separated by space: ");
        Scanner sc = new Scanner(System.in);
        String[] temp = sc.nextLine().split(" ");
        
        double a = Double.parseDouble(temp[0]);
        double b = Double.parseDouble(temp[1]);
        double c = Double.parseDouble(temp[2]);
        
        double power1 = (a + b + c)/Math.sqrt(c);
        double f1 = Math.pow(((Math.pow(a, 2) + Math.pow(b, 2)) / (Math.pow(a, 2) - Math.pow(b, 2))), power1);
        String finalF1 = String.format("%.2f", f1);
        
        double power2 = a - b;
        double f2 = Math.pow(Math.pow(a, 2) + Math.pow(b, 2) - Math.pow(c, 3), power2);
        String finalF2 = String.format("%.2f", f2);
        
        double av1 = (a + b + c) / 3;
        double av2 = (f1 + f2) / 2;
        double diffAV = Math.abs(av1 - av2);
        String finalDiff = String.format("%.2f", diffAV);
        
        System.out.println("F1 result: " + finalF1 + "; F2 result: " + finalF2 + "; Diff: " + finalDiff);
        
    }
}
