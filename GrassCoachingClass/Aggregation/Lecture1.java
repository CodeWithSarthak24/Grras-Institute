package GrassCoachingClass.Aggregation;

// Library HAS-A Book
class Library{

    String libraryName;
    String address;

    Library(String libraryName, String address){
        this.libraryName = libraryName;
        this.address = address;
    }

    void print(){
        System.out.println("Welcome to our library");
    }
}

class Book{

    String bookName;
    int bookPrice;
    Library library;

    Book(String bookName, int bookPrice, Library library){
        this.bookName = bookName;
        this.bookPrice = bookPrice;
        this.library = library;
    }

    void message(){
        System.out.println("Time is money and money is everything");
    }

    void access(){
        System.out.println(library.libraryName + "\n" + library.address);
        library.print();
    }
}

public class Lecture1 {
    public static void main(String[] args) {

        Library library = new Library("Oxford store", "Street no.121 near kyoto");
        Book book = new Book("Space-X", 4700, library);
        book.message();
        book.access();

    }
}
