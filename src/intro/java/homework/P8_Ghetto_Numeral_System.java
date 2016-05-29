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
public class P8_Ghetto_Numeral_System {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String[] digit = sc.next().split("");
        String[] arr = {"Gee", "Bro", "Zuz", "Ma", "Duh", "Yo", "Dis", "Hood", "Jam", "Mack"};
        
        for (String digit1 : digit) {
            int index = Integer.parseInt(digit1);
            System.out.print(arr[index]);
        }
        
    }
}
