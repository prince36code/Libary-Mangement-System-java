package libary.book;
import java.util.Scanner;
public class Book{
    public String title;
    public String author;  
    public String SerialNumber;
    public int BookcopyQty;

    Scanner input = new Scanner(System.in);

    public Book(){
       
        System.out.println("Enter the serial number");
        this.SerialNumber = input.nextLine();

        System.out.println("Enter the title of the book");
        this.title = input.nextLine();

        System.out.println("Enter the author name ");
        this.author = input.nextLine();

        System.out.println("Enter the number of copies of the book");
        this.BookcopyQty = input.nextInt();

    }
}