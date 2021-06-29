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
public class NodeDouble<T> {
   T value;
   NodeDouble next;
   NodeDouble prevons;
   public NodeDouble(T value,NodeDouble next,NodeDouble prevons){
   this.value=value;
   this.next=next;
   this.prevons=prevons;
   }  
}
