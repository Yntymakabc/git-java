// import java.util.ArrayList;
// import java.util.List;

// public class Genetics<T> {
//     List<T> arr;
//     public Genetics(){
//         arr = new ArrayList<>();
//     }

//     public void addItem(T item){
//         arr.add(item);
//     }

//     public T getItem(int index){
//         return arr.get(index);
//     }

//     public void removeElement(T element){
//         arr.removeIf(i-> i.equals(element));
//     }

//     public void seeAll(){
//         for(T i:arr){
//             System.out.println(i);
//         }
//     }

//     public int getSize(){
//         return arr.size();
//     }


// }

//  class Calculate{
//      public static void main(String[] args) {
//          Genetics<String> g = new Genetics<>();
//          g.addItem("hello");
//          g.addItem("world");
//          g.removeElement("hello");

//          g.seeAll();
//          System.out.println(g.getSize());
//      }
// }

// import java.util.ArrayList;

// public class Genetics {
//     public static void main(String[] args) {
//         Storage<Integer> st = new Storage();
//         st.addItem(1);
//         st.addItem(4);
//         System.out.println(st.printAll());
//         System.out.println(st.getByIndex(0));
//     }
    
// }

// class Storage<T>{
//     ArrayList<T> arr;
//     public Storage(){
//         arr = new ArrayList<>();
//     }

//     public void addItem(T item){
//         arr.add(item);
//     }

//     public T getByIndex(int index){
//         return arr.get(index);
//     }

//     public ArrayList<T> printAll(){
//         return arr;
//     }
// }