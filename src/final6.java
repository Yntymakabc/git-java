// // public class final6 {
// //     public static void main(String[] args) {
    
// //         FindMaxV fm = new FindMaxV() {
// //             public int CompareNum(int a, int b){
// //                 if(a>b){
// //                     return a;
// //                 }
// //                 else{
// //                     return b;
// //                 }
// //             };
// //         };
// //     System.out.println(fm.CompareNum(5, 6));
// // }};



// // interface FindMaxV {
// // public int CompareNum(int a, int b);
    
// // }




// // public class final6{
// //     public static void main(String[] args) {
// //         Innerfinal6 inn = (int a, int b)->{
// //         if(a>b){
// //             return a;
// //         }else{
// //             return b;
// //         }    
// //     };
// //     System.out.println(inn.findMax(5, 69));
// // };
// // };

// // interface Innerfinal6 {
// // public int findMax(int a, int b);
    
// // }

// import java.util.function.Predicate;

// public class final6{
//     public static void main(String[] args) {
//         // Abc a = (String word)->{
//         //     if(word.contains("java")){
//         //         return true;
//         //     }
//         //     else{
//         //         return false;
//         //     }
//         // };
//         // System.out.println(a.Check("this is good java "));
//         Predicate<String> p =(String sentence)->{
//             if(sentence.contains("java")){
//                 return true;
//             }else{
//                 return false;
//             }
//         };
//         System.out.println(p.test("is this good java"));
//     }
// }
// // interface Abc{
// //     public boolean Check(String word);
// // }

// import java.util.function.Function;

// public class final6{
//     public static void main(String[] args) {
//         Function<String, Integer> f = (String sentence)->{
//             String[] word = sentence.split(",");
//             return word.length;
//         };
//         System.out.println(f.apply("this, time for"));
//     }
// }

// import java.util.ArrayList;
// import java.util.Arrays;

// public class final6 {
//     public static void main(String[] args) {
//         ArrayList<String> arr = new ArrayList<>(Arrays.asList("yntymak", "akush", "aibek"));
        
//         Big b =(a)->{
//             for(String i:arr){
//                 System.out.println(i.toUpperCase());
//             }
//         };
//         b.makeBig(arr);
//     }
// }
// interface Big  {
// void makeBig(ArrayList<String> arr);
    
// };

import java.util.ArrayList;
import java.util.Arrays;

public class final6 {
    public static void main(String[] args) {
        ArrayList arr = new ArrayList<>(Arrays.asList(3,4,2,4,5,6,7,8));
        Akmat A =(list)->{
            ArrayList <Integer> arrNew = new ArrayList<>();
            for(int i:list){
                if(i%2==0){
                    arrNew.add(i);

                }
            }
            return arrNew;
        };
        System.out.println(A.evens(arr));
    }
}
interface Akmat{
    public ArrayList<Integer> evens(ArrayList<Integer> arr);
}