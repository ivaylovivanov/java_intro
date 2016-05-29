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
public class P4_Formatting_Numbers {
    public static void main(String[] args) {
        System.out.print("Please enter three digits, separated by space: ");
        Scanner sc = new Scanner(System.in);
        String[] temp = sc.nextLine().split(" ");
        
        int firstInt = Integer.parseInt(temp[0]);
        System.out.print("|");
        String intToHex = Integer.toHexString(firstInt).toUpperCase(); 
        System.out.print(intToHex);
        
        for (int i = 0; i < 10 - intToHex.length(); i++) {
            System.out.print(" ");
        }
        
        System.out.print("|");        
        
        String intToBin = Integer.toBinaryString(firstInt);
        if(intToBin.length() < 10){
            for (int i = 0; i < 10 - intToBin.length(); i++) {
                System.out.print("0");
            }   
        }
        System.out.print(intToBin);
        System.out.print("|");
        
        double secondD = Math.floor( Double.parseDouble(temp[1]) * 100)/100;
        String formattedData = String.format("%.2f", secondD);
        if(formattedData.length() < 10){
            for (int i = 0; i < 10 - formattedData.length(); i++) {
                System.out.print(" ");
            }   
        }
                
        System.out.print(formattedData + "|");
        
        double thirdD = Math.floor( Double.parseDouble(temp[2]) * 1000)/1000;
        formattedData = String.format("%.3f", thirdD);

        System.out.print(formattedData);        
        if(formattedData.length() < 10){
            for (int i = 0; i < 10 - formattedData.length(); i++) {
                System.out.print(" ");
            }   
        }
        System.out.print("|");
    }
}
