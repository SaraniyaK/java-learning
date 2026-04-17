import java.util.*;
public class ReverseString {
    public static void main(String [] ars) {
        Scanner sc = new Scanner(System.in);
        String reversedString=new String("");
        System.out.println("Enter a String: ");
        String input = sc.nextLine();

        for (int i= input.length()-1;i>=0;i--){
           reversedString += input.charAt(i);
        }
        System.out.println("Reversed String : ");
        System.out.println(reversedString);
    }
}
