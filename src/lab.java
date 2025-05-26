// // import java.util.ArrayList;
// // import java.util.Arrays;
// // import java.util.function.Consumer;
// // import java.util.function.Predicate;
// // import java.util.List;
// // import java.util.Arrays;
// // import java.util.function.BiFunction;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.Collections;

// // class lambada {
// //     public static void main(String[] args) {
// //         MathOperations add = (a,b) -> a + b;
// //         MathOperations sub = (a,b) -> a - b;
// //         MathOperations mult = (a, b) -> a * b;
// //         MathOperations div = (a, b) -> a / b;
// //         System.out.println(add.operations(2, 4));
// //         System.out.println(sub.operations(5, 1));
// //         System.out.println(mult.operations(5, 2));
// //         System.out.println(div.operations(4, 2));
// //     }
// // }


// // interface MathOperations{
// //     int operations(int a, int b);
// // }


// // class SecondTask{
// //     public static void main(String[] args) {
// //         List<Integer> numbers = Arrays.asList(10, 15, 22, 33, 40, 55);
// //         List<Integer> oddNumber = new ArrayList<>();

// //         Predicate<Integer> isOdd = number -> number % 2 != 0;

    
// //         for (Integer num : numbers) {
// //             if (isOdd.test(num)) {
// //                 oddNumber.add(num);
// //             }
// //         }
// //         System.out.println(oddNumber);
// //     }
// // }

// // class ThirdTask{
// //     public static void main(String[] args) {
// //         List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");
// //         names.sort((a, b) -> b.compareTo(a));

// //         System.out.println("Sorted Names: " + names);
// //     }
// // }


// // class Four{
// //     public static void main(String[] args) {
// //         List<String> words = Arrays.asList("hello", "java", "lambda");
// //         List<String> newWords = new ArrayList<>();
        
// //         UpperReverse UR = word -> new StringBuilder(word.toUpperCase()).reverse().toString();

// //         for(String word2: words){
// //             newWords.add(UR.reversedandSmt(word2));
// //         } 
// //         System.out.println(newWords);   
// //     }
// // }

// // interface UpperReverse{
// //     String reversedandSmt(String word);
// // }


// // class Five{
// //     public static void main(String[] args) {
// //         List<String> cities = Arrays.asList("New York", "London", "Tokyo", "Berlin");
// //         Consumer<String> printCity = city -> System.out.println(city);
// //         cities.forEach(printCity);
// //     }
  

// // }

// // class Six{
// //     public static void main(String[] args) {
// //         List<String> namess = Arrays.asList("Alice", "Bob", "Charlie", "David");
// //         namess.forEach(name -> System.out.println(name));
// //         namess.forEach(System.out::println);
// //     }
// // }

// // class Severn{
// //     public static void main(String[] args) {
// //         ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1,2,3,4,5));
// //         System.out.println(arr.get(arr.size()-1));
// //     }
// // }






// //This is anonymous class with interface 
// class YesAnonymouse{
//     public static void main(String[] args) {
//         Greeting greet = new Greeting() {
//             public void sayHello(){
//                 System.out.println("hello wolrd");
//             }
//         };
//         greet.sayHello();
//     }
// }

// interface Greeting{
//     void sayHello();
// }
// //////// this is the way how to write it without anonymous function 

// class NoYesAnonymous{
//     public static void main(String[] args) {
//         SimpleGreeting h = new SimpleGreeting();
//         h.sayHello();
//     }
// }

// interface greeting2{
//      void sayHello2();
// }

// class SimpleGreeting implements greeting2{
//     public void sayHello(){
//         System.out.println("hellod world");
//     }
// }

// ////////////// the way using anonymous class with lambda expression



// class WithLamdaClass{
//     public static void main(String[] args) {
//         Greeting3 greet3 =()-> {
//             System.out.println("hell world lamda world");
//         };
//         greet3.greate();
//     }
// }


//  interface  Greeting3{
//     void greate();
    
// }

// import java.util.function.Predicate;

// public class lambda {
//     public static void main(String[] args) {
//         Predicate<Integer> pr = (Integer number)->{
//             if (number > 10){
//                 return true;
//             }else{
//                 return false;
//             }
//             };
//         int a = 3;
//         System.out.println(pr.test(a));
//     }
// }
    


// public class lambda {
//     public static void main(String[] args) {
//         ForSort fs = (ArrayList<String> list) -> {
//             Collections.sort(list);
//             return list;
//         };
//         ArrayList<String> arr = new ArrayList<>();
//         arr.add("zzzz");
//         arr.add("yyyy");
//         arr.add("xxxx");

//         System.out.println(fs.sortArr(arr));
//     }
// }

// interface ForSort{
//     ArrayList<String> sortArr(ArrayList<String> list);
// }

// public class lambda {
//     public static void main(String[] args) {
//         ArrayList<String> arr = new ArrayList<>();
//         arr.add("z");
//         arr.add("y");
//         arr.add("x");
//         Collections.sort(arr);
//         System.out.println(arr);
//     }
// }





// public class lambda {
//     public static void main(String[] args) {
//         ForSort fs = (ArrayList<String> arr) ->{
//             Collections.sort(arr, (n1, n2) -> Integer.compare(n1.length(), n2.length()));
//             return arr;
//         };
//         ArrayList<String> arr = new ArrayList<>();

//         arr.add( "hello");
//         arr.add("null");
//         System.out.println(fs.sortArr(arr));
//     }
// }
// interface ForSort{
//     ArrayList<String> sortArr(ArrayList<String> arr);
// }


// public class lambda {
//     public static void main(String[] args) {
//         Predicate<String> big = (String word)->{
//             if (word.charAt(0) == (word.toUpperCase()).charAt(0)){
//                 return true;
//             }else{
//                 return false;
//             }
//         };
//         System.out.println(big.test("gello"));
//     }
// }


// public class lambda {
//     public static void main(String[] args) {
//         Predicate<Integer> pr = (Integer number) -> number % 2 == 0;
//         System.out.println(pr.test(2));
//     }
// }

// public class lambda {
//     public static void main(String[] args) {
//         Function<String, Integer> fun = (String word)-> word.length();
            
        
//         System.out.println(fun.apply("Hello"));
//     }
// }


// public class lambda {

//     public static void main(String[] args) {
//         Consumer<String> con = (String word)->System.out.println(word.toUpperCase());
//         con.accept("hello");
//     }

// }


// public class lab {

//     public static void main(String[] args) {
//         Supplier<Double> sup = ()-> (Math.random())*1000;
//         System.out.println(sup.get());
//     }
// }\


