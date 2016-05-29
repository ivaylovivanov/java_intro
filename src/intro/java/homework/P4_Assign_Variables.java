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
public class P4_Assign_Variables {
    public static void main(String[] args){
        /*
            byte, short, int, long, char, boolean, float, double, and String
        false, “Palo Alto, CA”, 32767, 2000000000, 0.1234567891011, 0.5f, 919827112351L, 127, ‘c’.
        */
        
        boolean boolVar = false;
        String strVar = "Palo Alto, CA";
        byte byteVar = 127;
        short shortVar = 32767;
        int intVar = 2000000000;
        long longVar = 919827112351L;
        char charVar = 'c';
        float floatVar = 0.5f;
        double doubleVar = 0.1234567891011;

        System.out.println(boolVar);
        System.out.println(strVar);
        System.out.println(charVar);
        System.out.println(doubleVar);
        System.out.println(floatVar);
        System.out.println(intVar);
        System.out.println(longVar);
        System.out.println(byteVar);
        System.out.println(shortVar);
    }
}
