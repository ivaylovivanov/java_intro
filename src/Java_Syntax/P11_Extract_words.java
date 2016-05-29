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
public class P11_Extract_words {
    public static void main(String[] args) {
        String REGEX1 = "[\\W+\\d+]";
        String REGEX3 = " +";
        String INPUT = "Az&76sym&&samo&cvqt&lilav";
        String INPUT2 = "Shoot18297the1231023dwarves!";
        String INPUT3 = "1798No(*&Girls)*(09Allowed";
        String REPLACE = " ";
        
        Pattern p = Pattern.compile(REGEX1);
        Matcher m = p.matcher(INPUT2);
        INPUT = m.replaceAll(REPLACE);
        
        p = Pattern.compile(REGEX3);
        m = p.matcher(INPUT);
        INPUT = m.replaceAll(REPLACE);
        
        System.out.println(INPUT.trim());
    }
}
