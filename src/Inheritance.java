import java.util.*;
class Person{
    String name;
    int age;
    void display(){
        System.out.println(name +" is "+age+" years old.");
    }
}
class Students extends Person{
    double mark;
    void showMark(){
        System.out.println(name+" Scored "+mark);
    }
}
class Teachers extends Person{
    String subject;
    void showSubject(){
        System.out.println(name+" is Teaching "+subject);
    }
}
public class Inheritance {
    public static void main(String[] args){                             
        Scanner sc= new Scanner(System.in);

        Students s1 =new Students();
        System.out.println("Enter Student Name: ");
        s1.name=sc.nextLine();
        System.out.println("Enter Student Age: ");
        s1.age=sc.nextInt();
        System.out.println("Enter Student Mark: ");
        s1.mark=sc.nextDouble();
        sc.nextLine();
        System.out.println("Student Details: ");
        s1.display();
        s1.showMark();

        Teachers t1 =new Teachers();
        System.out.println("Enter Teacher Name: ");
        t1.name=sc.nextLine();
        System.out.println("Enter Teacher Age: ");
        t1.age=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the Subject the Teacher Teaching: ");
        t1.subject=sc.nextLine();
        System.out.println("Teacher Details: ");
        t1.display();
        t1.showSubject();
    }
}
