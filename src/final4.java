// import java.util.ArrayList;
// import java.util.Arrays;

// public class final4 {
//     public static void main(String[] args) {
//         ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1,2,3,45));
        
//         int a,b;
//         a = 0;
//         b = 10;
//         try{
//             System.out.println(b/a);
//         }catch(Exception e){
//             System.out.println(e.getMessage());
//         }
//     }
// }


class LessZero extends Exception{
    public LessZero(String message) {
        super(message);
    }
}


class Cheaker{
    public static void NumberCheaker(int number) throws LessZero{
        if(number < 0){
            throw new LessZero("this number is less than 0");
        }
    }

    public static void main(String[] args) {
        int number = -9;
        try{
            NumberCheaker(number);
        }catch(LessZero e){
            System.out.println(e.getMessage());
        }
        }
        
    }
