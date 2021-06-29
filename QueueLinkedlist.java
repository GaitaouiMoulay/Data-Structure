/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

/**
 *
 * @author Ghaitaoui
 Queue Implementation in Java using Array Table of Contents [ show] What is a Queue? Queue is a special type of data structure,
 which is designed to hold elements before processing and process elements in a FIFO (first-in-first-out) manner.
 */
public class QueueLinkedlist<T> {
     NodeDouble<T> Rear;
      NodeDouble<T> Front;
    public QueueLinkedlist(NodeDouble newNode){
        Rear=newNode;
        Front=newNode;
    }
    // add Virst position in Link List 
    public void Queue(NodeDouble NewNode){
     Rear.next=NewNode;
     NewNode.next=null;
     NewNode.prevons=Rear;
     Rear=NewNode;
    }
    //Delete Virst value in link list
    public T  DeQueue(){ //O(1)
     T value=Front.value;   
    Front=Front.next;
    Front.prevons=null;
    return value;
    
    }
    //print tout Value link List
    
     
}
