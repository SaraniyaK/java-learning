import java.util.*;
public class Student {
    private String name;
    private int age;
    private double mark;

    //CONSTRUCTOR
    Student(String name,int age,double mark){
        this.name =name;
        setAge(age);
        setMark(mark);
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

    public int getAge(){
        return age;
    }
    public void setAge(int age){
        if(age>0) {
            this.age = age;
        }
        else{
            System.out.println("Invalid Age");
        }
    }

    public double getMark(){
        return mark;
    }
    public void setMark(double mark){
        if(mark>0 && mark<=100) {
            this.mark = mark;
        }
        else{
            System.out.println("Invalid Mark .Mark should be 0-100");
        }
    }

    void display() {
        System.out.println(getName() + " is " + getAge() + " years old. Student's Mark  is " + getMark());
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