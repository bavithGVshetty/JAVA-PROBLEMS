package DAY4.Collections;

import java.util.HashMap;
import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a string: ");
        String input=sc.nextLine();

        // Eliminate the punctuation

        input =input.toLowerCase();
        input=input.replaceAll("[^a-z]", " ");

        String[] words=input.trim().split("\\s+");

        HashMap<String,Integer> map=new HashMap<>();


        for(String word: words){
            map.put(word,map.getOrDefault(word, 0)+1);
        }

        // Lets print this
        System.out.println("Word Occurrence");
        for(String i: map.keySet()){
            System.out.println(i+":"+map.get(i));
        }







      

        
    }
}
