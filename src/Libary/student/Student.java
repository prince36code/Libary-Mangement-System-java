package libary.student;
import java.util.Scanner;
import libary.book.Book;

public class Student{
    public  String Stdname;
    public String RollNumber;
    public int count=0;

   public Book[] borrowedbooks = new Book[3];
  Scanner input =  new Scanner(System.in);
     public Student(){
           
        System.out.println("Enter the name of the Student");
        this.Stdname = input.nextLine();

        System.out.println("Enter the student rollnumber");
        this.RollNumber = input.nextLine();
     }
    
}


