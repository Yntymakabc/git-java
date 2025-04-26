import java.util.ArrayList;
import java.util.Arrays;

public class final1 {
    public static void main(String[] args) {
       
    Book b = new Book("harry", 12, true);
    b.setName("yntymak");
    System.out.println(b.getName());
        
        
    }
}

class Nothing{
    ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1,2,3,4,5,67,8));
    public void csess(){
    for(int i:arr){
        switch (i) {
            case 1:
                System.out.println("this number is one ");
                break;
            case 2:
                System.out.println("this is two");
                break;
                
            default:
                System.out.println("this is the mans world");
                break;
        }
    }

}
}

class Book{
    private String name;
    private int pages;
    private boolean isAble;
    
    public Book(String name, int pages, boolean isAble){
        this. name = name;
        this. pages = pages; 
        this.isAble = isAble;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
}