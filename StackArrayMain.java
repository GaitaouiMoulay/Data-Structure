/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */ 
package Array;

/**
 *
 * @author Ghaitaoui
 */
public class StackArrayMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        StackArray<Integer> Stack=new StackArray<Integer>(5);
        Stack.push(11);
        Stack.push(15);
        Stack.push(45);
        System.out.println(Stack.pop());
         System.out.println("Dymaic Array Stack ");
        //Dymaic Array Stack 
        StackArrayDymaic<Integer> Stack1=new StackArrayDymaic<Integer>(5);
        Stack1.push(11);
        Stack1.push(15);
        Stack1.push(45);
         Stack1.push(151);
        Stack1.push(175);
        Stack1.push(475);
        System.out.println(Stack1.pop());
        
    }
    
}
