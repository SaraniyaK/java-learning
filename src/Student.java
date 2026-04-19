import java.util.*;
public class Student {
    String name;
    int age;
    double mark;

    void display() {
        System.out.println(name + " is " + age + " years old. Student's Mark  is " + mark);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How Many Students You want to add? ");
        int noofstu = sc.nextInt();
        sc.nextLine();
        for (int i = 1; i <= noofstu; i++) {
            Student stu =new Student();//creates a new object for every student (that's why in the loop)
            System.out.println("Enter Student Name:");
            stu.name = sc.nextLine();
            System.out.println("Enter Student Age:");
            stu.age = sc.nextInt();
            System.out.println("Enter Student Mark:");
            stu.mark = sc.nextDouble();
            sc.nextLine();
            stu.display();
        }

    }
}
