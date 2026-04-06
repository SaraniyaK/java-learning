import java.util.*;
public class ReverseArray {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int arr[]=new int[5];
        System.out.println("Enter Five NUmbers to Reverse: ");
        for (int i=0;i<5;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("After Reversing: ");
        for(int j=4;j>=0;j--){
            System.out.println(arr[j]);
        }
    }
}
