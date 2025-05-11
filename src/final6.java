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