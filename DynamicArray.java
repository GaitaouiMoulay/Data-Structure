/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

import java.util.Arrays;
import static javafx.scene.input.KeyCode.T;

/**
 *
 * @author Ghaitaoui
 */


public class DynamicArray {
    Object []data;
    int size;
    public DynamicArray(){
    size=1;
    data=new Object[size];
    }
    public int getSize(){
    return data.length;
    }
    public T get(int index){
    return  (T)data[index];
    }
    public void put (int element){
     ensureCapacity(size+1);
     data[size++]=element;
    }
    public void ensureCapacity(int minCapacity){
     int oldCapacity=data.length;
     if(minCapacity>oldCapacity){
     int newCapacity=oldCapacity*2;
     if(newCapacity<minCapacity)//
         newCapacity=minCapacity;
     data=Arrays.copyOf(data, newCapacity); 
     }
    }
}
