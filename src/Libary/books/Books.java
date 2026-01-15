package libary.books;
import java.util.Scanner;
import libary.book.Book;

public class Books{
    Scanner input = new Scanner(System.in);
    Book[] theBooks = new Book[50];
    public static int countbook = 0;

    // Add book
    public void Addbook(Book b){
        for(int i=0;i<countbook;i++){
            if(b.SerialNumber.equalsIgnoreCase(theBooks[i].SerialNumber)){
                System.out.println("The book is exist in the libary");
                return;
            }
        }

        if(countbook<50){
            theBooks[countbook] = b;
            countbook++;
        }
    }
    // list of all the books
    public void getAllBooks(){
        for(int i=0;i<countbook;i++){
            System.out.println(theBooks[i].author+ "\t\t"+  theBooks[i].title+"\t\t"+theBooks[i].SerialNumber+"\t\t"+theBooks[i].BookcopyQty);
        }
    }
    // search for book by serial number
    public void searchBySerialnumber(){
        System.out.println("Enter the serial number of the book");
        String regnum = input.nextLine();
        int flag =0;
        for(int i=0;i<countbook;i++){
            if(regnum.equalsIgnoreCase(theBooks[i].SerialNumber)){
                System.out.println(theBooks[i].author+"\t\t"
                  + theBooks[i].title+"\t\t"+
                   theBooks[i].SerialNumber+"\t\t"+
                   theBooks[i].BookcopyQty
                );
                flag++;
            }
        }

        if(flag ==0){
            System.out.println("No Book with  Serial Number " + regnum+" is found");
        }
    }

    // search  by author name
    public void SearchbyAuthorName(){
        System.out.println("Enter the author of the book");

        String athname = input.nextLine();
  int flag =0;
        for(int i=0;i<countbook;i++){
            if(athname.equalsIgnoreCase(theBooks[i].author)){
                System.out.println(theBooks[i].author+"\t\t"+
                theBooks[i].title+"\t\t"+
                theBooks[i].SerialNumber+"\t\t"+
                theBooks[i].BookcopyQty
                );
                flag++;
            }
        }
        if(flag ==0){
            System.out.println("The book with the author name "+ athname+" is niot found");
        }
    }
   
     





}


