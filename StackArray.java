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
public class StackArray<T> {
    /*******************************************************************************************************
     * Java Stack. The stack is a linear data structure that is used to store the collection of objects. 
     * It is based on Last-In-First-Out (LIFO). Java collection framework provides many interfaces 
     * and classes to store the collection of objects. 
     * One of them is the Stack class that provides different operations such as push, pop, search, etc.
     ******************************************************************************************************/
    
    
    int Size;
    Object[] ArrayStack;  
    int top;
    public StackArray(int Size){
    this.Size=Size;
    ArrayStack=new Object[this.Size];
    top=-1;
    }
    public void push(Object newItem){
        if(IsFull()){ 
            System.out.println("Stack is Full");
            return;}//stack is full
     top=top+1;
     ArrayStack[top] =newItem;
     
    }
    public T pop(){
    if(Isempty()){
        System.out.println("Stack is empty");
    return null;}//stack is empty 
    T item=(T)ArrayStack[top];
    top=top-1;
    return item;
    }
    
    
    public Boolean IsFull(){
      return(top==Size-1);
    }
     public Boolean Isempty(){
      return(top==-1);
    }
}
