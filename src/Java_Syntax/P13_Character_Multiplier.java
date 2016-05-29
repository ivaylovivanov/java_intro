/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java_Syntax;

/**
 *
 * @author Ivailo
 */
public class P13_Character_Multiplier {
    public static void main(String[] args) {
        System.out.println(calcString("Gosho", "Pesho"));
        System.out.println(calcString("123", "522"));
        System.out.println(calcString("a", "aaaa"));
    }
    
    public static int calcString(String str1, String str2){
        int sum = 0;
        
        if(str1.length() > str2.length()){
            String bufStr = str1;
            str1 = str2;
            str2 = bufStr;
        }
        
        for (int i = 0; i < str1.length(); i++) {
            sum += str1.charAt(i) * str2.charAt(i);
        }
        
        for (int i = str1.length(); i < str2.length(); i++) {
            sum += str2.charAt(i);
        }
        
        return sum;
    }
}
