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
public class LinkedList {
    Node head;
    public LinkedList(Node head){
    this.head=head;
    }
    // add Virst position in Link List 
    public void add(Node NewNode){
    NewNode.next=head;
    head=NewNode;
    }
    //Delete Virst value in link list
    public void Delete(){ //O(1)
    head=head.next;
    }
    //print tout Value link List
    public void Display(){
    Node n=head;
    while(n!=null){
    System.out.println(n.Value);
    n=n.next;  
    }
    }  
}
