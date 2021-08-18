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
public class BinarySearch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         //define array with million order number 
        int size=100;
        int[]number=new int[size];
        for(int i=0;i<size;i++)
            number[i]=i+1; 
        //Binary Searh 
         int searchNumber=11;
         int low=0;
         int high=number.length-1;
         int mid=0;
         int NumberTry=0;
         
        Boolean isFound=false;
        while(!isFound){
            if(low>high){
            System.out.println("Number not found");
            break;  
            }
          mid=low+((high+low)/2); 
          NumberTry++; 
          if(number[mid]==searchNumber){
          System.out.println("number is found");
          System.out.println("number is try: "+NumberTry);
          break;
          }
          if(number[mid]<searchNumber){
               low=mid+1;
         }
          if(number[mid]>searchNumber){
               high =mid-1;
         }
        }
    } 
}
