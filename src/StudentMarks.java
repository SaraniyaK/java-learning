import java.util.*;
public class StudentMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Double> studentMark = new HashMap<>();
        //input student ,mark
        System.out.println("How Many do You Wanna Add? ");
        int total =sc.nextInt();
        sc.nextLine();
        String name="";
        Double mark=0.0;
        for(int i=1;i<=total;i++){
            System.out.println("Enter the Student Name: ");
            name=sc.nextLine();
            System.out.println("Enter the mark of the Student: ");
            mark=sc.nextDouble();
            sc.nextLine();
            studentMark.put(name,mark);
        }
        //display
        System.out.println("All Students with their Marks: ");
        for(String key:studentMark.keySet()){
            System.out.println(key+ " "+studentMark.get(key));
        }
        //serach the student mark
        System.out.println("Enter a Student Name to Search their Mark: ");
        String searchStudent =sc.nextLine();
        if(studentMark.containsKey(searchStudent)){
            System.out.println(searchStudent+" mark is : "+studentMark.get(searchStudent));
        }
        else{
            System.out.println("Student Not Found.");
        }
    }
}