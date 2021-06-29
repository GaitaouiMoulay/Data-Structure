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
public class HeshTableArrayMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         HashTabeArray<String> hash=new HashTabeArray<String>(5);
        hash.put(2, "m");
        hash.put(15, "u");
        hash.put(25, "l");
        System.out.println(hash.Get(15));
    }
    
}
