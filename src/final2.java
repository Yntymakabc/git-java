import java.util.ArrayList;

public class final2 {
    public static void main(String[] args) {
        Preparation pr = new Preparation();
        //pr.checkIf(101010);
        int[] arr = {1,23,4,5,4,3,2};
        // for(int i=0; i<arr.length; i++){
        //     System.out.println(arr[i]);
            
        // }
        Library l = new Library();
        Book b = new Book("Subtle art of not giving a f*ck", 156, "aibek shyshybaev");
        l.addBook(b);
        l.showBooks();
        
    }
    
}


class Preparation{
    public void checkIf(int number){
        if(number < 0 ){
            System.out.println("that's less than 0");
        }else if(number > 0 && number < 100 ){
            System.out.println("this number is less tham 100");
        }else{
            System.out.println("this number is more that 100");
        }
        
    }
}

class Book{
    String name;
    int pages; 
    String author;

    public Book(String name, int pages, String author){
        this.name = name;
        this.pages = pages;
        this.author = author;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

}

class Library{
    ArrayList<Book> arr;
    public Library(){
        arr = new ArrayList<>();
    }

    public void addBook(Book book){
        arr.add(book);
        System.out.println( book.getName() + " was successfully added ");
    }
    public void showBooks(){
        for(Book i:arr){
            System.out.println(i.getName());
        }
    }
}