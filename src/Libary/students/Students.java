package libary.students;
import java.util.Scanner;
import libary.book.Book;
import libary.books.Books;
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
    public void checkOutBook(Books book){
        int  studentIndex = isStudent();
       
        
            if(studentIndex != -1){
                System.out.println("checking out");

                book.getAllBooks();
                Book b = book.checkOutBook();
                System.out.println("Checking out");
                if(theStudents[studentIndex].count<=3){
                     System.out.println("Adding book");
                     theStudents[studentIndex].borrowedbooks[theStudents[studentIndex].count] = b;
                     theStudents[studentIndex].count++;
                     return;
                }else{
                    System.out.println("Student Can not Borrow more than 3 Books");
                    return;
                }
            }
        

    }
    public void checkInBook(Books book){
      int studentIndex = this.isStudent();
      if(studentIndex != -1){
          System.out.println("RollNumber\t\t Book Name \t\t Author Name");

          Student s = theStudents[studentIndex];
          for(int i=0;i<s.count;i++){
            System.out.println(s.borrowedbooks[i].SerialNumber +"\t\t\t"+
                s.borrowedbooks[i].title + "\t\t\t"+
                s.borrowedbooks[i].author
            );
          }
          System.out.println("Enter Serial Number of Book to be Checked In:");

          String sNo = input.nextLine();
            for(int i=0;i<s.count;i++){
                if(sNo.equals(s.borrowedbooks[i].SerialNumber)){
                  book.checkInBook(s.borrowedbooks[i]);
                  s.borrowedbooks[i] = null;
                  return;
                }
            }
            System.out.println("Book of Serial Number"+ sNo+" not Found" );
      }
    }   

}
