// import java.util.ArrayList;
// import java.util.Collections;
// import java.util.LinkedList;

// public class Collections28 {
//   public static void main(String[] args) {
//     Library2 l = new Library2();
//     l.addBookN("How to learn python");
//     l.addBookN("the history of Africa");
//     l.borrowBook("How to learn python", "Yntymak");
//     l.borrowBook("the history of Africa", "Aibek");
//     System.out.println(l.getBooks());
//     System.out.println(l.getQueue());


//     ArrayList<Integer> arr3 = new ArrayList<>();
//     LinkedList<Integer> arr4 = new LinkedList<>();
//     arr3.add(3);
//     arr3.add(4);
//     arr4.add(5);
//     arr4.add(0);
//     System.out.println(arr3);
    
//     arr3.addFirst(56);
//     System.out.println(arr3);
//   }
// }

// class Library2{
//     ArrayList<String> books;
//     LinkedList<String> readers;

//     public Library2(){
//         books = new ArrayList<>();
//         readers = new LinkedList<>();

//     }

//     public void addBookN(String book){
//         books.add(book);
//         Collections.sort(books);
//         System.out.println("The book "+ book + " was added successfully");
//     }

//     public void borrowBook(String book, String reader){
//         books.remove(book);
//         readers.add(reader);
//     }

//     public ArrayList<String> getBooks(){
//         return books;
//     }

//     public LinkedList<String> getQueue(){
//         return readers;
//     }

// }

// import java.util.HashSet;
// import java.util.LinkedHashSet;
// import java.util.Set;
// import java.util.TreeSet;

// public class Collections28 {

//     public static void main(String[] args) {
//         // System.out.println("hello");
//         SetUsing su = new SetUsing();
//         System.out.println(su.getSetO());
//         System.out.println(su.getsize());

//     }
// }


// class SetUsing{
//     Set<Integer> nums;
//     public SetUsing(){
//         nums = new LinkedHashSet<>();
//         nums.add(58);
//         nums.add(58);
//         nums.add(456);
//         nums.add(4);
//         nums.add(5);
//         nums.add(4);
//         nums.add(4);
//         nums.add(455);
//         nums.add(0);

        
//     }
//     public Set<Integer> getSetO(){
//         return nums;
//     }
//     public int getsize(){
//         return nums.size();
//     }
// }xx


// import java.util.*;

// public class QueueExample {
//     public static void main(String[] args) {
//         Queue<String> queue = new LinkedList<>();

//         queue.offer("Aibek");
//         queue.offer("Yntymak");
//         queue.offer("Aizada");

//         System.out.println(queue.poll()); // Aibek (вошёл первым — ушёл первым)
//         // System.out.println(queue.poll()); // Yntymak
//         System.out.println(queue);//aizada

//         System.out.println(queue.peek());
//     }
// }



// import java.util.ArrayDeque;
// import java.util.Deque;

// public class DequeExample {
//     public static void main(String[] args) {
//         Deque<String> deque = new ArrayDeque<>();

//         // Добавляем элементы с разных сторон
//         deque.addFirst("First");  // добавим в начало
//         deque.addLast("Last");    // добавим в конец
//         deque.addFirst("New First"); // снова в начало

//         System.out.println("Deque: " + deque);

//         // Получим элементы с двух сторон
//         String front = deque.getFirst(); // первый элемент
//         String back = deque.getLast();   // последний элемент

//         System.out.println("Front: " + front); // New First
//         System.out.println("Back: " + back);   // Last

//         // Удалим элементы с обеих сторон
//         deque.removeFirst(); // удаляет New First
//         deque.removeLast();  // удаляет Last

//         System.out.println("Deque after removals: " + deque); // [First]
//     }
// }

// import java.util.LinkedList;
// import java.util.Queue;

// class Client5{
//     String name;
//     int timeServe;
//     public Client5(String name, int timeServe){
//         this.name = name;
//         this.timeServe = timeServe;
//     }

//     public String getName(){
//         return name;
//     }

//     public int getTime(){
//         return timeServe;
//     }


// }

// class Service5{
//     Queue<Client5> arr;
//     public Service5(){
//         arr = new LinkedList<>();
//     }

//     public void addToQueue(Client5 client){
//         arr.offer(client);
//         System.out.println(client.getName() + " was added to queue");
//     }

//     public void getQueue(){
//         for(Client5 i:arr){
//             System.out.println(i.getName());
//         }
//     }

//     public void serverClient(){
//         Client5 client = arr.poll();
//         System.out.println("it took " + client.getTime() + " to serve" + client.getName());
//     }
// }
// public class QueueExample {

//     public static void main(String[] args) {
//         Client5 c = new Client5("Aibek", 12);
//         Client5 cc  = new Client5("AKUSH", 30);
//         Client5 ccc = new Client5("Yntymak", 13);
//         Service5 s = new Service5();
//         s.addToQueue(c);
//         s.addToQueue(cc);
//         s.addToQueue(ccc);
//         s.getQueue();
//         s.serverClient();
//     }
// }