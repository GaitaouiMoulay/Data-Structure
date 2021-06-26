/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

import java.util.Arrays;

/**
 *
 * @author Ghaitaoui
 */
public class StackArrayDymaic<T> {
  int Size;
    Object[] ArrayStack;  
    int top;
    public StackArrayDymaic(int Size){
    this.Size=Size;
    ArrayStack=new Object[this.Size];
    top=-1;
    }
   
    public void push(Object newItem){
    ensureCapacity(top+2);
     top=top+1;
     ArrayStack[top] =newItem;
    }
      public T pop(){
//    if(Isempty()){
//        System.out.println("Stack is empty");
//    return null;}//stack is empty 
    T item=(T)ArrayStack[top];
    top=top-1;
    return item;
    }
    
     public void ensureCapacity(int minCapacity){
     int oldCapacity=ArrayStack.length;
     if(minCapacity>oldCapacity){
     int newCapacity=oldCapacity*2;
     if(newCapacity<minCapacity)//
         newCapacity=minCapacity;
     ArrayStack=Arrays.copyOf(ArrayStack, newCapacity); 
     }
  
     }
//    public Boolean IsFull(){
//      return(top==Size-1);
//    }
//     public Boolean Isempty(){
//      return(top==-1);
//    }   

}
