//4) Book Class with Constructor
//➤ Write a Book class that takes title, author, and price via constructor. Display all values.

package Task9thjune_constructorprgrs;


class Book{
    String title;
    String author;
    int price;
    Book(){
        System.out.println("dc");
    }
    Book(String tl,String auth,int pr){
        title=tl;
        author=auth;
        price=pr;
    }
    public void display(){
        System.out.println("Book Details");
        System.out.println("Title of the Book is:"+title);
        System.out.println("Author of the book is:"+author);
        System.out.println("Price of the book is:"+price);
    }

}

public class Bookclass {
    public static void main(String[] args) {
        Book b1=new Book("The power of the mind","Vivekananda",50);
        b1.display();

    }
}
