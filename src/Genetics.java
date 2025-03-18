import java.util.ArrayList;
import java.util.List;

public class Genetics<T> {
    List<T> arr;
    public Genetics(){
        arr = new ArrayList<>();
    }

    public void addItem(T item){
        arr.add(item);
    }

    public T getItem(int index){
        return arr.get(index);
    }

    public void removeElement(T element){
        arr.removeIf(i-> i.equals(element));
    }

    public void seeAll(){
        for(T i:arr){
            System.out.println(i);
        }
    }

    public int getSize(){
        return arr.size();
    }


}

 class Calculate{
     public static void main(String[] args) {
         Genetics<String> g = new Genetics<>();
         g.addItem("hello");
         g.addItem("world");
         g.removeElement("hello");

         g.seeAll();
         System.out.println(g.getSize());
     }
}
