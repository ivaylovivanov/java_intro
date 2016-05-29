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
public class P14_Get_First_Odd_Even_Elements {
    public static void main(String[] args) {
        checkNumbers("1 2 3 4 5", "Get 3 odd");
        checkNumbers("11 6 2 8 1 0", "Get 8 even");
    }
    
    public static void checkNumbers(String array, String instruction){
        String[] myArray = array.split(" ");
        String[] ins = instruction.split(" ");
        int count = 0;
        int index = 0;
        
        while (count < Integer.parseInt(ins[1]) && index < myArray.length){
            
            if (Integer.parseInt(myArray[index]) % 2 == 0 && "even".equals(ins[2])) {
                System.out.print( " " + myArray[index] );
                count++;
            }
            if (Integer.parseInt(myArray[index]) % 2 != 0 && "odd".equals(ins[2])) {
                System.out.print( " " + myArray[index] );
                count++;
            }
            
            index++;
        }
    } 
}
