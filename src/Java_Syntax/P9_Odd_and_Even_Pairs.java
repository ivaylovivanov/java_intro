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
public class P9_Odd_and_Even_Pairs {
    public static void main(String[] args) {
        System.out.print("Please enter two digits, separated by space: ");
        Scanner sc = new Scanner(System.in);
        String[] temp = sc.nextLine().split(" ");
        
        if (temp.length % 2 != 0) {
            System.out.print("Invalid length");
        } else {
            int[] array = new int[temp.length];
            for (int i = 0; i < temp.length; i++) {
                array[i] = Integer.parseInt(temp[i]);
            }
            
            for (int i = 0; i < array.length; i += 2) {
                if (array[i]%2==0 && array[i+1]%2==0) {
                    System.out.println(array[i] + ", " + array[i+1] + " -> Both are even");
                } else if (array[i]%2==1 && array[i+1]%2==1) {
                    System.out.println(array[i] + ", " + array[i+1] + " -> Both are odd");
                } else if (array[i]%2 != array[i+1]%2) {
                    System.out.println(array[i] + ", " + array[i+1] + " -> different");
                } 
            }
        }
    }
}
