package libary.students;
import java.util.Scanner;
import libary.student.Student;

public class Students{
    Scanner input = new Scanner(System.in);
    Student[]theStudents = new Student[50];

    public static int count = 0;

    // Add a Student
    public void AddStudent(Student s){
        for(int i=0;i<count;i++){
            if(s.RollNumber.equalsIgnoreCase(theStudents[i].RollNumber)){
                System.out.println("The Student with the given roll number is already registered");
                return;
            }

        }
        if(count<50){
            theStudents[count] = s;
            count++;
        }
    }

    // Show all the students
    public void ShowAllStudents(){
        for(int i=0;i<count;i++){
            System.out.println(theStudents[i].Stdname + "\t\t"+theStudents[i].RollNumber);
        }

    }
    // to check student
    public int isStudent(){
        System.out.println("Enter the RollNumber");
        String regname = input.nextLine();

        for(int i=0;i<count;i++){
              if(regname.equalsIgnoreCase(theStudents[i].RollNumber)){
                return i;
              }
        }
        System.out.println("The student with this rollnumber is not registered");
        System.out.println("Please registered");
        return -1;
    }
    //
    public void checkOutBook(){

    }
    public void checkInBook(){

    }


   

}
