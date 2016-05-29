/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java_Syntax;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Ivailo
 */
public class P8_Randomize_N_to_M {
    public static void main(String[] args) {
        System.out.print("Please enter two digits, separated by space: ");
        Scanner sc = new Scanner(System.in);
        String[] temp = sc.nextLine().split(" ");
        int M = Integer.parseInt(temp[0]);
        int N = Integer.parseInt(temp[1]);
        
        if (M > N) {
            int swap = M;
            M = N;
            N = swap;
        }
        
        ArrayList<Integer> myArray = new ArrayList<Integer>();
        for (int i = 0; i <= N - M; i++) {
            myArray.add(i + M);
        }
        
        int[] finalArray = new int[myArray.size()];
        int i = 0;
        while(myArray.size() > 0){
            int index = (int)(Math.random() * myArray.size());
            finalArray[i] = myArray.get(index);
            i++;
            myArray.remove(index);
        }
        
        for (int j = 0; j < finalArray.length; j++) {
            System.out.print(String.valueOf(finalArray[j]) + " ");
        }
    }
}
