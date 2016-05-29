/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java_Syntax;

import java.util.ArrayList;

/**
 *
 * @author Ivailo
 */
public class P15_Magic_exchangeable_words {
    public static void main(String[] args) {
        doMagic("gosho", "hapka");
        doMagic("aabbaa", "ddeedd");
        doMagic("foo", "bar");
    }
    
    public static void doMagic(String str1, String str2){
        boolean isExchangable = true;
        
        String[] data1 = str1.split("");
        String[] data2 = str2.split("");
        ArrayList<String> map1 = new ArrayList<>();
        ArrayList<String> map2 = new ArrayList<>();
        
        for (int i = 0; i < data1.length; i++) {
            int index = findIndex(map1, data1[i]);
            if( index == -1){
                map1.add(data1[i]);
                map2.add(data2[i]);
            } else if(!map2.get(index).equals(data2[i])){
                isExchangable = false;
            }
        }
   
        System.out.println(isExchangable);
    }
    
    public static int findIndex(ArrayList<String> array, String element){
        int index = -1;
        
        for (int i = 0; i < array.size(); i++) {
            if(element.equals(array.get(i))){
                index = i;                
                break; 
            }
        }
        
        return index;
    }
}
