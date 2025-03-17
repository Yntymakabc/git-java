
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
}

class Main{
    public static void main(String[] args) {

    }
}