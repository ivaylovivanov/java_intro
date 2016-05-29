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
public class P9_Get_Average {
    public static void main(String[] args) {
       System.out.println(calcAverage(2.0, 3.0, 4.0));
    }
    
    public static double calcAverage(double a, double b, double c){
        double average = a + b + c;
        average = average / 3;
        return average;
    }
}
