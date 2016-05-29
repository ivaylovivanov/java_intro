/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java_Syntax;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Ivailo
 */
public class P12_Starts_Ends_Capital_Letter {
    public static void main(String[] args) {
        String[] INPUT1 = {"GoshO", "blabla", "NqmaSm1saL", "KvoStaA"};
        String[] INPUT2 = {"AZ", "AK", "47", "RoBoT", "noWayouT"};
        String[] INPUT3 = {"DrakonI", "Navsekyde"};
        
        String REGEX = "^\\p{Upper}[a-zA-Z]+\\p{Upper}$";
        String REGEX2 = "^\\p{Upper}\\p{Upper}$";
        Pattern p = Pattern.compile(REGEX);
        Pattern p2 = Pattern.compile(REGEX2);
        Matcher m;
        
        for (int i = 0; i < INPUT3.length; i++) {
            if(INPUT3[i].length() == 2){
                m = p2.matcher(INPUT3[i]);                
            } else {
                m = p.matcher(INPUT3[i]);
            }
            
            if (m.matches()) {
                System.out.print(INPUT3[i]);
                if(i != INPUT2.length - 1){
                    System.out.print(" ");
                }
            }           
        }
    }   
}
