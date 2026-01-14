package libary.book;
import java.util.Scanner;
public class Book{
    private String title;
    private String author;  
    private int SerialNumber;
    private int BookcopyQty;

    Scanner input = new Scanner(System.in);

    public Book(){
       
        System.out.println("Enter the serial number");
        this.SerialNumber = input.nextInt();

        System.out.println("Enter the title of the book");
        this.title = input.nextLine();

        System.out.println("Enter the author name ");
        this.author = input.nextLine();

        System.out.println("Enter the number of copies of the book");
        this.BookcopyQty = input.nextInt();

    }
}