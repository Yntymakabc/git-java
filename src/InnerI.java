// // 1.	Создайте класс Pair<T, V>, который принимает два значения разных типов.
// // 	2.	Реализуйте в Pair<T, V>:
// // 	•	Конструктор для инициализации значений.
// // 	•	Геттеры getFirst() и getSecond().
// // 	•	Метод swap(), который меняет местами T и V.
// class Generics <T,V> {
//     T first;
//     V second;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.*;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;

//     public Generics(T first, V second){
//         this.first = first;
//         this.second = second;
//     }

//     public T getFirst(){
//         return first;
//     }

//     public V getSecond(){
//         return second;
//     }


// }

// public class Innergenerics {
//     public static void main(String[] args) {
//         Generics<Integer, Integer> g = new Generics<>(12,34);
//         System.out.println(g.getFirst());
//     }
// }




//Box<Integer> box1 = new Box<>(10);
//Box<Integer> box2 = new Box<>(10);
//System.out.println(box1.isEqual(box2));




// public class Innergenerics <T> {
//     private T thing;
//     public Innergenerics(T thing){
//         this.thing = thing;
//     }
//     public T getThing(){
//         return thing;
//     }

//     public boolean comparethings(T thing, T second){
//         return second.equals(thing);
//     }
// }

// class Mainb{
//     public static void main(String[] args) {
//         Innergenerics<String> in = new Innergenerics<>("Yntymak");
//         Innergenerics<String> inn = new Innergenerics<>("Yntymak");
//         System.out.println(in.getThing());
//         System.out.println(inn.comparethings(in.getThing(), inn.getThing()));
//     }
// }


// Цель:

// Реализовать универсальный класс Storage<T>, который может:
// 	1.	Хранить объекты типа T в List<T>.
// 	2.	Добавлять (addItem()) и удалять (removeItem()) элементы.
// 	3.	Находить (findItem()) элементы по предикату (Predicate<T>).
// 	4.	Получать все элементы (getAll()).

// import java.util.ArrayList;

// class Storage7<T>{
//     public Storage7(){};
//     List<T> arr = new ArrayList<>();


//     void addItem(T thing){
//         arr.add(thing);
//     }

//     void removeItem(T thing){
//         arr.remove(thing);
//     }

//     List<T> getAll(){
//         return arr;
//     }

// }

// class muin{
//     public static void main(String[] args) {
//         Storage7<String> st = new Storage7<>();
//         st.addItem("null");
//         st.addItem("Yntymak");
//         System.out.println(st.getAll());

//     }
// }




//  class I {
//     public static void main(String[] args) {
//         ArrayList<Integer> arr = new ArrayList<>();
//         arr.add(100);
//         arr.add(2);
//         arr.add(3);
//         arr.add(9);
//         arr.add(5);
//         int max = Collections.max(arr);
//         //System.out.println(max);
//         //Collections.sort(arr);
//         System.out.println(arr);
        
//         int sum =0;
//         for(int i:arr){
//             sum+=i;
//         }
//         //System.out.println(sum);

//         List<String> arsr = new ArrayList<>(Arrays.asList("Yntymak", "asdf"));
//         Qwe<String> af = new Qwe(arsr);
//         //System.out.println(af.getLast());
        
//     }
// }


// class Qwe<T>{
//     List<T> arr;
//     public Qwe(List<T> arr){
//         this.arr = arr;
//     };
//     public T getLast(){
//         return arr.get(arr.size()-1);
//     }
// }

// class Karte{
//     public static void main(String[] args) {
//         Map<Integer,Integer> map = new TreeMap<>();
//         ArrayList<Integer> arrrrr = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,56,5,4,3,2,1,2));
//         for(int i: arrrrr){
//             map.put(i, map.getOrDefault(i, 0)+1);
            
//         }
        
//        System.out.println();
// }
// }


// Требования:
// 	1.	Создайте класс LimitedCache<K, V>, который хранит не более N элементов.
// 	2.	Если элементов больше N, удаляется самый старый.
// 	3.	Используйте LinkedHashMap<K, V> для хранения данных (он сохраняет порядок).
// 	4.	Реализуйте методы:
// 	•	void put(K key, V value) — добавить элемент.
// 	•	V get(K key) — получить элемент.
// 	•	boolean contains(K key) — проверить, есть ли ключ.
// 	•	int size() — текущий размер.
// 	5.	Класс должен поддерживать любые типы данных для ключей и значений.



// Создайте класс MyDeque<T>, реализующий двустороннюю очередь (Deque) с возможностью:
// 	•	Добавлять элементы в начало и в конец.
// 	•	Удалять элементы с начала и с конца.
// 	•	Получать первый и последний элемент.
// 	•	Проверять, пуст ли Deque.

// ⸻

// 🎯 Требования:
// 	1.	Используйте LinkedList<T> для хранения элементов.
// 	2.	Реализуйте методы:
// 	•	void addFirst(T value) – добавить элемент в начало.
// 	•	void addLast(T value) – добавить элемент в конец.
// 	•	T removeFirst() – удалить и вернуть первый элемент.
// 	•	T removeLast() – удалить и вернуть последний элемент.
// 	•	T getFirst() – вернуть первый элемент без удаления.
// 	•	T getLast() – вернуть последний элемент без удаления.
// 	•	boolean isEmpty() – проверить, пуст ли Deque.


// class MyDeque<T>{
//     Deque<T> arr;
//     public MyDeque(){
//         arr = new LinkedList<>();

//     };
//     void addFirst(T value){
//         arr.addFirst(value);
//     }

//     void addLast(T value){
//         arr.addLast(value);
//     }

//     void removeLast(T value){
//         arr.removeLast();

//     }

//     void removeFirst(T value){
//         arr.removeFirst();
//     }
//     boolean isEmpty(){
//         return arr.isEmpty();
//     }

// }


// public class InnerI {
//     public static void main(String[] args) {
//         MyDeque<String> arr = new MyDeque();
//         arr.addFirst("yntymak");
//     }

    
// }




// class Writer{
//     public static void main(String[] args) {
//         ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8));


//         try{
//             FileOutputStream fo = new FileOutputStream("akdk.txt");
//             BufferedOutputStream bo = new BufferedOutputStream(fo);

//                 for(int i:arr){
//                     bo.write(i);}
                
//             }catch (IOException e) {
//                 e.getMessage();      
//     }}}




// // class Reader{
// //     public static void main(String[] args) {
// //         try{
// //             FileInputStream fi = new FileInputStream("akk.data");
// //             BufferedInputStream bi = new BufferedInputStream(fi);
// //         int data;
// //         while ((data = bi.read())!= -1){
// //             System.out.println(data);
// //         }

        
// //     }catch(IOException e){
// //         System.out.println(e.getMessage());
// //     }
    
// // }
// // }



// class Abc{
//     Map<String, Integer> arr;
//     public Abc(){
//         arr = new HashMap<>();
//         arr.put("null", 3);
//         arr.put("Aibek", 4);
//         arr.put("Hello", 4);
//         arr.put("abk", 3);    
//     };   

//     void abcd(){
//         System.out.println(arr);
//     }


//     void abcdef(){
//         for(Map.Entry entry: arr.entrySet()){
//             System.out.println("key is:" + entry.getKey() + "value is: " + entry.getValue());
//     }
    
// }
// }


// class Mn{
//     public static void main(String[] args) {
//         Abc ab = new Abc();
//         ab.abcd();
//         ab.abcdef();
//     }
//  }

// // class Sorrr{
// //     public static void main(String[] args) {
// //         ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1,2,3,4,3,2,1));
// //         Collections.sort(arr);
// //         System.out.println(arr);
// //     }
// // }
// class Helllll{
//     ArrayList<Integer> ar;
//     public Helllll(){
//         ar = new ArrayList<>();
//         ar.add(4);
//         ar.add(9);
//         ar.add(0);
    
//         try{FileOutputStream os = new FileOutputStream("newFile.data");
//         for(int i:ar){
//             os.write(i);
//         }
//     }catch(IOException e){
//         System.out.println(e.getMessage());
//     }
//     }

// }



// Создайте класс Triple<T, U, V>, который представляет три связанных значения разных типов.

// Требования:
// 	1.	Реализуйте конструктор для инициализации значений.
// 	2.	Реализуйте геттеры: getFirst(), getSecond(), getThird().
// 	3.	Реализуйте метод swap(), который меняет местами T и V.
// 	4.	Реализуйте метод toString() для красивого вывода.
// 	5.	Создайте main() и протестируйте с разными типами.


// class Triple <T, V, U>{
//     T first;
//     V second;
//     U third;
//    public Triple(T first, V second, U third){
//         this.first = first;
//         this.second = second;
//         this.third = third;
//    }

  
// }




// import java.util.*;

// class Two {
//     HashMap<String, Integer> dic;

//     public Two() {
//         dic = new HashMap<>();
//         dic.put("hello", 3);
//         dic.put("world", 6);

//         for (Map.Entry<String, Integer> entry : dic.entrySet()) {
//             System.out.println(entry.getKey() + " -> " + entry.getValue());
//         }
//     }

//     public static void main(String[] args) {
//         new Two(); // Создаем объект, чтобы запустился конструктор
//     }
// }