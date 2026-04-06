import java.util.*;
public class GuessNumber {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int secret = 37;
        System.out.println("Lets play a Game");
        System.out.println("Guess the number I have...");
        System.out.println("Your Guess: ");
        int guess = sc.nextInt();
        while (guess != secret) {
            if(guess<secret){
                System.out.println("TOO LOW!!");
            }
            else if(guess>secret){
                System.out.println("TOO HIGH!!");
            }
            System.out.println("TRY AGAIN: ");
            guess = sc.nextInt();
        }
        System.out.println("CORRECT !!! \nYOU GOT IT!!");
    }
    }
