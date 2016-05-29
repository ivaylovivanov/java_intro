/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intro.java.homework;

/**
 *
 * @author Ivailo
 */
public class P5_Print_Characters {
    public static void main(String[] args){
        for (char c = 'a'; c <= 'z'; c++) {
            System.out.print(c);
            if (c != 'z') {
                System.out.print(" ");
            }
        }
    }
}
