package libary.main;
import java.util.Scanner;
import libary.book.Book;
import libary.books.Books;
import libary.student.Student;
import libary.students.Students;
public class Main{
    public static void  main(String[] args){
       Scanner input = new Scanner(System.in);

       System.out.println("******************Welcome to Prince's Libary System****************");
       System.out.println("Select From The Following Options");

       System.out.println("*************************************************************");

       Books ob = new Books();
       Students std = new Students();
       int choice;
       int searchChoice;

       do{
        ob.dispmenu();
        choice = input.nextInt();

         switch(choice){
            case 0:
                System.out.println("Thank you for using Prince's libary Sytem");
                break;
            case 1:
                Book b = new Book();
                ob.Addbook(b);
                break;
            case 2:
                ob.UgradeBookqty();
                break;
            case 3:
                System.out.println("Press 1 to Search with Book Serial number");
                System.out.println("Press 2 to Search with author name");
                searchChoice = input.nextInt();

                switch(searchChoice){
            case 1:
                ob.searchBySerialnumber();
                break;
            case 2:
                ob.SearchbyAuthorName();
                break;
                
              default:
                System.out.println("Invalid choice");
                break;
                }
                break;
            case 4:
                ob.getAllBooks();
                break;
            case 5:
                Student s = new Student();
                std.AddStudent(s);  
                break;
            case 6:
                std.ShowAllStudents();
                break;
            case 7:
                std.checkOutBook(ob);
                break;
            case 8:
                std.checkInBook(ob);
                break;
            default:
                System.out.println("Enter a valid choice 0-8");
                break;

         }
       }while(choice !=0);
       input.close();
    }
}
