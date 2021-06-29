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
public class HashTabeArray<T> {
    Entry[] arrayHash;
    int Size;
  public HashTabeArray(int Size){
   this.Size=Size;
   arrayHash=new Entry[this.Size];
   for(int i=0;i<arrayHash.length;i++)
       arrayHash[i]=new Entry<T>();
  }  
}
