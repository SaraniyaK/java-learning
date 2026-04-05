import java.util.*;
public class Multiplication {
    static void printTable(int num){
        for (int i=1;i<=10;i++){
            int mulans =num*i;
             System.out.println(num+"x"+i+"="+ mulans);
      }
    }
    public static void main(String [] args){
        Scanner sc=new Scanner (System.in);
        System.out.println("What Table you want?");
        int table=sc.nextInt();
        printTable(table);
    }
}
