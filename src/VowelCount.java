import java.util.*;
public class VowelCount{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a String: ");
        String input =sc.nextLine();
        String inputTOL=input.toLowerCase();
        int consonantcount=0;
        int vowelscount=0;
        for(int i=0;i<inputTOL.length();i++){
            char currchar =inputTOL.charAt(i);
            if(currchar ==' '){
                continue;
            }
            if( currchar=='a'|| currchar=='e' || currchar =='i'|| currchar=='o'|| currchar=='u' ){
                vowelscount++;
            }
            else{
                consonantcount++;
            }
        }
        System.out.println("Number of VOWELS: "+vowelscount);
        System.out.println("Number of CONSONANTS: "+consonantcount);
    }
}
