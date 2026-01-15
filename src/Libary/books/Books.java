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
   
     // edit number of books
     public  void UgradeBookqty(){
        System.out.println("Enter the serial number of book");
        String regnum = input.nextLine();
       
        
        for(int i=0;i<countbook;i++){
            if(regnum.equalsIgnoreCase(theBooks[i].SerialNumber)){
                     
            System.out.println("Enter the number of new books copies");
            int num = input.nextInt();

            theBooks[i].BookcopyQty += num;

            System.out.println("The number in of copies haven been updated to "+theBooks[i].BookcopyQty);
            return ;

            }
        }
        System.out.println("The book with the given Serial number "+regnum+" is not found.");

     }
     // create the menu

      public void dispmenu(){
        System.out.println("*****************************************************************");
        System.out.println("Press 1 to Add new Book.");
        System.out.println("Press 0 to Exit Application.");
        System.out.println("Press 2 to upgarde the book quantity.");
        System.out.println("Press 3 to search for a book .");
        System.out.println("Press 4 to show all books.");
        System.out.println("Press 5 to register a new student.");
        System.out.println("Press 6 to check out book.");
        System.out.println("Press 7 to check in book.");
        System.out.println("*****************************************************************");
      }
      // check if book is avalibale;

      public int isAvailable(){
           
        System.out.println("Enter the serial number of the book");
        String regnum = input.nextLine();
         for(int i= 0;i<countbook;i++){
              if(regnum.equalsIgnoreCase(theBooks[i].SerialNumber)){
                  if(theBooks[i].BookcopyQty >0){
                    System.out.println("The Book is available");
                    return i;
                  }else{
                    System.out.println("The book is not available");
                    return -1;
                  }
              }
         }
         System.out.println("The book with the given Seria number "+regnum+" is not found");
         return -1;
      }


      // check in the book
      public void checkInBook(Book b){
         for(int i=0;i<countbook;i++){
            if(b.SerialNumber.equals(theBooks[i].SerialNumber)){
              theBooks[i].BookcopyQty++;      

            }
         }
      }

      // check out book
      public Book checkOutBook(){
        
          int bookIndex = isAvailable();
           if(bookIndex != 1){
             theBooks[bookIndex].BookcopyQty--;
             return theBooks[bookIndex];
           }
           return null;
        }

}


