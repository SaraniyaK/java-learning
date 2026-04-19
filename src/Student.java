import java.util.*;
public class Student {
    String name;
    int age;
    double mark;

    //CONSTRUCTOR
    Student(String name,int age,double mark){
        this.name =name;
        this.age=age;
        this.mark=mark;
    }

    void display() {
        System.out.println(name + " is " + age + " years old. Student's Mark  is " + mark);
    }

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("How Many Students you Wanna Add? ");
       int noofstu=sc.nextInt();
       sc.nextLine();
       for(int i=1;i<=noofstu;i++){
           System.out.println("Enter Student Name: ");
           String stuname=sc.nextLine();
           System.out.println("Enter Student age: ");
           int stuage=sc.nextInt();
           System.out.println("Enter Student Mark: ");
           double stumark =sc.nextDouble();
           sc.nextLine();
           Student stu =new Student(stuname,stuage,stumark);
           stu.display();
       }
        }

    }