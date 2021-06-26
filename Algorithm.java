/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithm;

import java.awt.RenderingHints.Key;
import java.util.ArrayList;
import java.util.HashMap;
import jdk.nashorn.internal.objects.NativeArray;

/**
 *
 * @author Ghitaoui
 */
public class Algorithm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*******************************************************************
        The important words in the text are the words emphasized by the writer
        ********************************************************************/
     String text="Cloud computing is Internet based computing  whereby shared resources, software  and information are provided to computers and other devices on demand  like the electricity grid";
    ArrayList<String> wordsToExclude=new ArrayList<>();
    wordsToExclude.add("the");
    wordsToExclude.add("a");
    wordsToExclude.add("by");
    wordsToExclude.add("to");
    wordsToExclude.add("is");
    wordsToExclude.add("on");
    wordsToExclude.add("and");
    System.out.println(text);
     String[] textsp=text.split(" ");
     int maxfiqunci=0;
     HashMap<String ,Integer> wordFreq=new HashMap<>();
     for(String word:textsp){
     String kli=word.trim().toLowerCase();
     if(kli.trim().length()==0){continue;}//اهمال الفاصل بين الكلمات 
     
     if(wordsToExclude.contains(kli))continue; //اذا كانت هذه محتواى في العبارة تجاوزها   
     //حساب عدد تكرار الكلمات 
     if(wordFreq.get(kli)==null){
     wordFreq.put(kli,1);
     }else{
     int freqnecyOld=wordFreq.get(kli);
     wordFreq.put(kli, freqnecyOld+1);
     }
    int newfirqinci=wordFreq.get(kli);
   if(newfirqinci>maxfiqunci)maxfiqunci=newfirqinci;
           
     System.out.println(word.trim());
     }
        for (String key : wordFreq.keySet()) {
            if(wordFreq.get(key)==maxfiqunci)
            System.out.println(key +":" + wordFreq.get(key));
        }

    }
    
}
