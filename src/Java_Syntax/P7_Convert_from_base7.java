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
public class P7_Convert_from_base7 {
    public static void main(String[] args) {
        System.out.print("Please enter an integer number: ");
        Scanner sc = new Scanner(System.in);
        String varInt = sc.next();
        
        System.out.println(Integer.parseInt(varInt, 7));
    }
}
