/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

/**
 *  
 * @author Ghaitaoui Moulay 
 */
public class QueueArrayMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        QueueArray<String> queue=new QueueArray<String>(3);
        queue.Queue("m");
        queue.Queue("j");
        queue.Queue("i");
        System.out.println(queue.DeQueue());
    }
    
}
