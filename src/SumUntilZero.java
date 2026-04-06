import java.util.*;
public class SumUntilZero {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int num=-1;
        int sum=0;
        while(num!=0){
            System.out.println("Enter a Number: ");
            num=sc.nextInt();
            if(num!=0) {
                sum = sum + num;
            }
        }
        System.out.println("Total Sum: "+sum);
    }
}
