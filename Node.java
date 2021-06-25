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
public class Node<T>{
    T Value;
    Node next;
    // class node 
    public Node(T Value,Node next){
    this.Value=Value;
    this.next=next;    
    
    }
}
