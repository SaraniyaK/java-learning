import java.util.*;
public class OddEven {
    public static void main(String [] args){
        Scanner sc =new Scanner (System.in);
        int arr [] =new int[10];
        System.out.println("Enter 10 numbers: ");
        for(int i=0;i<=9;i++){
            arr[i]=sc.nextInt();
        }
        int oddcount=0;
        int evencount=0;
        for(int j=0;j<=9;j++){
            if(arr[j]%2==0){
                evencount+=1;
            }
            else{
                oddcount+=1;
            }
        }
        System.out.println("Total number of odd numbers: "+oddcount);
        System.out.println("Total number of Even numbers: "+evencount);
    }
}
