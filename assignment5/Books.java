//FSUID: rah18b
//Class: CGS3416

import java.util.Scanner;

public class Books {

    private static int idCounter = 1;

    private String title;
    private String donatedBy;
    private int numChapters;
    private String bookLocation;
    private int id;

    public Books() {
        this.title = "Java Programming";
        this.donatedBy = "Deitel and Deitel";
        this.numChapters = 25;
        this.bookLocation = "A-007";
        this.id = idCounter++;
    }

    public Books(String title, String donatedBy, int numChapters, String bookLocation) {
        this.title = title;
        this.donatedBy = donatedBy;
        this.numChapters = numChapters > 0 ? numChapters : 25;
        this.bookLocation = bookLocation;
        this.id = idCounter++;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDonatedBy() {
        return donatedBy;
    }

    public void setDonatedBy(String donatedBy) {
        this.donatedBy = donatedBy;
    }

    public int getNumChapters() {
        return numChapters;
    }

    public void setNumChapters(int numChapters) {
        this.numChapters = numChapters;
    }

    public String getBookLocation() {
        return bookLocation;
    }

    public void setBookLocation(String bookLocation) {
        this.bookLocation = bookLocation;
    }
    public int getId() {
        return this.id;
    }

    public void printDetails() {
        System.out.println("\nBook " + this.id + ":\nTitle: " + this.title + "\nDonated By: " + this.donatedBy + "\nNumber of Chapters: " + this.numChapters + "\nBook Location: " + this.bookLocation);
    }

    public Books[] searchBook(Books[] books, String name) {
        Books[] foundBooks = new Books[books.length];
        int counter = 0;
        for(Books book : books) {
            if(book.donatedBy.equals(name)) {
                foundBooks[counter++] = book;
            }
        }
        return foundBooks;
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.print("Enter the number of books: ");
        int numBooks = scnr.nextInt();
        scnr.nextLine();
        Books[] library = new Books[numBooks];
        int counter = 0;
        for(int i = 0; i < numBooks; i++) {
            
            System.out.print("Enter the title: ");
            String title = scnr.nextLine();
            System.out.print("Enter the name of the donor: ");
            String donatedBy = scnr.nextLine();
            System.out.print("Enter the number of chapters: ");
            int numChapters = scnr.nextInt();
            scnr.nextLine();
            System.out.print("Enter the book location: ");
            String bookLocation = scnr.nextLine();
            Books thisBook = new Books(title, donatedBy, numChapters, bookLocation);
            library[counter++] = thisBook;

        }
        
        System.out.print("\nFor search enter the donor's name: ");
        String donorName = scnr.nextLine();
        Books dumbBook = new Books();
        Books[] foundBooks = dumbBook.searchBook(library, donorName);
        int numBooksFound = 0;
        for(Books thisBook : foundBooks) {

            if (thisBook != null) {
                thisBook.printDetails();
                numBooksFound++;
            }
        }

        if(numBooksFound != 0) {

            System.out.println("\nBook(s) found. Task complete");
        } 

        else {
            System.out.println("\nNo books found. Task complete.");
        }
    }

}
