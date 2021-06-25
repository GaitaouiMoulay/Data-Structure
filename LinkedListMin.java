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
public class LinkedListMin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         LinkedList Ls=new LinkedList(new Node<Integer>(12,null));
        Ls.add(new Node<Integer>(11,null));
        Ls.add(new Node<Integer>(13,null));
        Ls.Display();
        Ls.Delete();
        System.out.println("After delet");
        Ls.Display();
    
    }
    
}
