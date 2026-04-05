import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int arr []=new int[5];
        int sum=0;
        System.out.println("Enter Five Numbers: ");
        for(int i=0;i<5;i++) {
            arr[i] = sc.nextInt();
            sum = sum + arr[i];
        }
        int large=arr[0];
        int small=arr[0];
        for (int j=0;j<5;j++){
            if(large<arr[j]){
                large=arr[j];
            }
            if(arr[j]<small){
                small=arr[j];
            }
        }
        System.out.println("The Largest number is: "+large);
        System.out.println("The Smallest number is: "+small);
        System.out.println(sum);
        }
}