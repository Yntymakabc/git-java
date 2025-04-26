// import java.io.*;;
// public class Final {
//     public static void main(String[] args) {
//         int[] data  = {2, 3};
//         try{
//             FileOutputStream f = new FileOutputStream("Aibek");
//             for(int i:data){
//                 f.write(i);
//             }
//             f.close();
//         }
//         catch(Exception e ){
//             System.out.println(e.toString());
//         }
//     }
// }



// class ReadFile {
//     public static void main(String[] args) { 
//         try {
//             FileInputStream f = new FileInputStream("Aibek");
//             int i;
//             while ((i = f.read()) != -1) {
//                 System.out.print(i + " "); // выводим каждый байт
//             }
//             f.close();
//         } catch (Exception e) {
//             System.out.println(e.toString());
//         }
//     }
// }