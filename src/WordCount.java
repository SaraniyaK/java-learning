import java.util.*;
public class WordCount {
    public static void main(String[] args){
        Scanner sc =new  Scanner(System.in);
        System.out.println("Enter a Sentence: ");
        String sentence =sc.nextLine();
        sentence =sentence.trim();
        int wordCount =0;
        //array for storing words
        String [] words= sentence.split("\\s+");
        wordCount =words.length;
        System.out.println("Word Count: "+wordCount);
    }
}

