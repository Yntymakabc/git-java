import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.List;
import java.util.Arrays;
import java.util.function.BiFunction;


class lambada {
    public static void main(String[] args) {
        MathOperations add = (a,b) -> a + b;
        MathOperations sub = (a,b) -> a - b;
        MathOperations mult = (a, b) -> a * b;
        MathOperations div = (a, b) -> a / b;
        System.out.println(add.operations(2, 4));
        System.out.println(sub.operations(5, 1));
        System.out.println(mult.operations(5, 2));
        System.out.println(div.operations(4, 2));
    }
}


interface MathOperations{
    int operations(int a, int b);
}


class SecondTask{
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 15, 22, 33, 40, 55);
        List<Integer> oddNumber = new ArrayList<>();

        Predicate<Integer> isOdd = number -> number % 2 != 0;

    
        for (Integer num : numbers) {
            if (isOdd.test(num)) {
                oddNumber.add(num);
            }
        }
        System.out.println(oddNumber);
    }
}

class ThirdTask{
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");
        names.sort((a, b) -> b.compareTo(a));

        System.out.println("Sorted Names: " + names);
    }
}


class Four{
    public static void main(String[] args) {
        List<String> words = Arrays.asList("hello", "java", "lambda");
        List<String> newWords = new ArrayList<>();
        
        UpperReverse UR = word -> new StringBuilder(word.toUpperCase()).reverse().toString();

        for(String word2: words){
            newWords.add(UR.reversedandSmt(word2));
        } 
        System.out.println(newWords);   
    }
}

interface UpperReverse{
    String reversedandSmt(String word);
}


class Five{
    public static void main(String[] args) {
        List<String> cities = Arrays.asList("New York", "London", "Tokyo", "Berlin");
        Consumer<String> printCity = city -> System.out.println(city);
        cities.forEach(printCity);
    }
  

}

class Six{
    public static void main(String[] args) {
        List<String> namess = Arrays.asList("Alice", "Bob", "Charlie", "David");
        namess.forEach(name -> System.out.println(name));
        namess.forEach(System.out::println);
    }
}

class Severn{
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        System.out.println(arr.get(arr.size()-1));
    }
}