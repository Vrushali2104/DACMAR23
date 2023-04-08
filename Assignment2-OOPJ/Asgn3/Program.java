import java.util.Scanner;
class Book{
    String title;
    String author;
    String publisher;
    String isbn;
    int year;
    double price;
    int quantity;

    Book()
    {
        this.title="";
        this.author="";
        this.publisher="";
        this.isbn="";
        this.year=0;
        this.price=0;
        this.quantity=0;
    }
    public void setTitle(String title)
    {
        this.title=title;
    }
    public void setAuthor(String author)
    {
        this.author=author;
    }
    public void setPublisher(String publisher)
    {
        this.publisher=publisher;
    }
    public void setIsbn(String isbn)
    {
        this.isbn=isbn;
    }
    public void setYear(int year)
    {
        this.year=year;
    }
    public void setPrice(double price)
    {
        this.price=price;
    }
    public void setQuantity(int quantity)
    {
        this.quantity=quantity;
    }
    public String getTitle()
    {
        return this.title;
    }
     public String getAuthor()
    {
        return this.author;
    }
     public String getPublisher()
    {
        return this.publisher;
    }
     public String getIsbn()
    {
        return this.isbn;
    }
     public int getYear()
    {
        return this.year;
    }
     public double getPrice()
    {
        return this.price;
    }
     public int getQuantity()
    {
        return this.quantity;
    }
    public void increaseQuantity(int quantity)
    {
        this.quantity= quantity+200;
    }
      public void decreaseQuantity(int quantity)
    {
        this.quantity= quantity-100;
    }
    public double getInventoryValue()
    {
        double inventory;
        return inventory= (this.price * this.quantity);
    }
}
class Program{
    public static void main(String [] args)
    {
    Book b1 = new Book();
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the title");
    String title = sc.nextLine();
    b1.setTitle(title);

    System.out.println("Enter the author");
    String author = sc.nextLine();
    b1.setAuthor(author);

    System.out.println("Enter the publisher");
    String publisher = sc.nextLine();
    b1.setPublisher(publisher);

    System.out.println("Enter the ISBN number");
    String isbn = sc.nextLine();
    b1.setIsbn(isbn);

    System.out.println("Enter the year");
    int year = sc.nextInt();
    b1.setYear(year);

    System.out.println("Enter the price");
    double price = sc.nextDouble();
    b1.setPrice(price);

    System.out.println("Enter the quantity");
    int quantity = sc.nextInt();
    b1.setQuantity(quantity);

    b1.increaseQuantity(quantity);

    b1.decreaseQuantity(quantity);

   double inventory= b1.getInventoryValue();
   System.out.println("Inventory : "+inventory);
}
}