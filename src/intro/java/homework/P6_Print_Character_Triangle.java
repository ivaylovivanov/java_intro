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
public class P6_Print_Character_Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lines = sc.nextInt();
        char[] chr = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'x', 'y', 'z'};
        
        for (int i = 0; i < lines; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(chr[j]);
            }
            System.out.println();
        }
        
        for (int i = lines - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(chr[j]);
            }
            System.out.println();
        }
        
    }
}
