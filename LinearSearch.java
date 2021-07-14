/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package search;

/**
 *
 * @author Ghaitaoui
 */
public class LinearSearch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //define array with million order number 
        int size=1000000;
        int[]number=new int[size];
        for(int i=0;i<size;i++){
        number[i]=i+1;
        }
         //linear search 
         int searchNumber=1111;
            for(int i=0;i<size;i++){//n time
           if (number[i]==searchNumber){// c1 time
           System.out.println("number is found");// c2 time  
           break;//c3 time
           } 
            }
    }
    
}
