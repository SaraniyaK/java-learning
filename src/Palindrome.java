import java.util.*;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String reversedString = new String("");
        System.out.println("Enter a String :");
        String input = sc.nextLine();
        input =input.toLowerCase();
        for (int i = input.length() - 1; i >= 0; i--) {
            reversedString += input.charAt(i);
        }
        System.out.println("Reversed String: "+reversedString);
        if (reversedString.equals(input)) {
            System.out.println(input + " is a Palindrome");
        } else {
            System.out.println(input + " not a Palindrome");
        }
    }
}
