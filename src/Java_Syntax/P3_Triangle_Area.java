/*
area = (Ax*(By - Cy) + Bx*(Cy - Ay) + Cx*(Ay - By))/2
*/
package Java_Syntax;

import java.util.Scanner;
/**
 *
 * @author Ivailo
 */
public class P3_Triangle_Area {
    
    public static void main(String[] args) {        
        
        int[] a = convertInput("A");
        int[] b = convertInput("B");
        int[] c = convertInput("C");
        
        double trArea = (a[0]*(b[1] - c[1]) + b[0]*(c[1] - a[1]) + c[0]*(a[1] - b[1]))/2 ;
        int finalVal = (int)trArea;

        System.out.println(Math.abs(finalVal));
    }
    
    public static int[] convertInput(String name){
        System.out.print("Please enter coordinates for " + name + ", separated by space: ");
        Scanner sc = new Scanner(System.in);
        String[] temp = sc.nextLine().split(" ");
        int[] coords = new int[2];
        for (int i = 0; i < temp.length; i++) {
            coords[i] = Integer.parseInt(temp[i]);
        }
        return coords;
    }
    
}