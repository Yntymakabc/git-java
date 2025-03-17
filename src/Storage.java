
import java.util.List;
import java.util.ArrayList;

class Storage<T>{
    List<T> arr;

    public Storage(){
        arr = new ArrayList<>();
    }

    public void addItem(T item){
        arr.add(item);
    }

    public int size(){
        return arr.size();
    }

    public void seeAll(){
        for(T i: arr){
            System.out.println(i);
        }
    }
}

class Main{
    public static void main(String[] args) {
    Storage<Integer> s = new Storage<>();
    s.addItem(3);
    s.addItem(4);
        System.out.println(s.size());
    s.seeAll();
    }
}