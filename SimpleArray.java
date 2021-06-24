/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

import javax.swing.text.StyledEditorKit;

/**
 *
 * @author Ghaitaoui
 */
public class SimpleArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    //one Dimesion Array
        int[] number=new int[5];
        number[0]=11;
        number[1]=12;
        number[2]=13;
        number[3]=14;
        number[4]=15;
        System.out.println("Simple Array ");
        for(int i=0;i<number.length;i++)
            System.out.println(number[i]+"\t");
     //Array of object
     System.out.println("\n Object Array");
     Students[] str=new Students[3];
     str[0]=new Students("molay", 2);
     str[1]=new Students("si", 3);
     str[2]=new Students("Ghaitaoui", 4);  
       for(Students student:str){
           System.out.println("name:"+student.name+":"+"id="+student.id);
       } 
    //tow diemsion Array
    int[][]data=new int[2][2];
    data[0][0]=17;
    data[0][1]=14;
    data[1][0]=12;
    data[1][1]=11;
    System.out.println("tow diemsion Array");
    for(int i=0;i<2;i++)
        for(int j=0;j<2;j++)
            System.out.println(data[i][j]+"\t");
    System.out.println("\n");
    }
    
}
