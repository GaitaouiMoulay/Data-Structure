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
public class Entry<T> {
 int Key;
 T value;
 Entry next;
 public Entry(int Key,T value){
 this.Key=Key;
 this.value=value;
 next=null;
 }
  public Entry(){
   next=null;
  }
 public int GetKey(){
 return Key;
 }
 public T getValue(){
 return value; 
 }
 
}
