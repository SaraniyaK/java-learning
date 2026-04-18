import java.util.*;
public class StudentList {
    public static void main(String [] args){
        System.out.println("STUDENT LIST MANAGER");
        Scanner sc =new Scanner(System.in);
        ArrayList <String> students =new ArrayList<>();
        int choice =0;
        while(choice !=5) {
            System.out.println("What you wanna do? ");
            System.out.println("1. Add a Student");
            System.out.println("2. Remove a Student");
            System.out.println("3. View All Student");
            System.out.println("4. Total Number of Students" );
            System.out.println("5. Exit");
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch(choice){
                case 1:
                    System.out.println("Enter a Student name to add: ");
                    String newstudent =sc.nextLine();
                    //PREVENTION FROM DUPLICATE NAME
                    Boolean alreadyexits =false;
                    for(int d=0;d<students.size();d++){
                        if(students.get(d).equalsIgnoreCase(newstudent)){
                            alreadyexits=true;
                            break;
                        }
                    }
                    if(alreadyexits==true){
                        System.out.println("Student Already Exits");
                    }
                    else {
                        students.add(newstudent);
                        System.out.println(newstudent + " is Added...");
                    }
                    break;
                case 2:
                    System.out.println("Enter a Student name to remove: ");
                    String removestudent =sc.nextLine();
                    //CHECKING FOR "NOT DELETING" A STUDENT BECAUSE OF WRONG CASE
                    //.contains can be used but it will check exactly (case sensitive)
                    String foundName ="";//name to remove with perfect case as it is in arraylist
                    Boolean match=false;
                    for(int k=0;k<students.size();k++){
                        if(students.get(k).equalsIgnoreCase(removestudent)){
                            foundName=students.get(k);
                            match=true;
                            break;
                        }
                        else{
                            match=false;
                        }
                    }
                    if(match==true){
                        students.remove(foundName);//not removestudent beacuse remove checks from arraylist
                        System.out.println(foundName+" is Removed...");
                    }
                    else{
                        System.out.println(removestudent+" is Not Found");
                    }
                    break;
                case 3:
                    System.out.println("ALL STUDENTS LIST: ");
                    for(int j=0;j<students.size();j++){
                        System.out.println(j+1+". " +students.get(j));
                        //j+1 for numbering 0+1...
                    }
                    break;
                case 4:
                    int totalStudents=students.size();
                    System.out.println("Total Number of Students at Current: "+totalStudents);
                    break;
            }
        }

    }
}