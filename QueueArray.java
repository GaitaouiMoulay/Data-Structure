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
public class QueueArray <T>{
    Object[] ArrayQueue;
    int Rear; // last added item
    int Front;//first added item
    int Size;
    public QueueArray(int Size){
    this.Size=Size;
    ArrayQueue=new Object[this.Size];
    Front=-1;
    Rear=1; 
    }
    Boolean isFull(){
    return(Rear==Size-1);
    }
    Boolean isEmpty(){
    return(Front==-1 || Front>Rear);
    }
    public void Queue(Object newItem){
    if(isFull()){
       System.out.println("Queue is Full");
    return;}
    Rear =Rear+1;
    ArrayQueue[Rear]=newItem;
    if(Front==-1)///only execute one time
        Front=0;
    }
    public T DeQueue(){
        if(isEmpty()){
           System.out.println("Queue is empty");
        return null;}
     T objectOut=(T)ArrayQueue[Front];
     Front=Front+1; 
     return objectOut;
     
    }

   

}
