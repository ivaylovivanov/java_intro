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
public class P6_Convert_base7 {
    public static void main(String[] args) {
        System.out.print("Please enter an integer number: ");
        Scanner sc = new Scanner(System.in);
        int varInt = sc.nextInt();
        System.out.print(Integer.toString(varInt, 2));
    }
}
