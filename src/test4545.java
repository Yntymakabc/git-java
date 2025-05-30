// 

///////////////ARRAYS//////////////

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class array{
    public static void main(String[] args) {
        int[] arr = {3,4,5,6,6};
        int[] arr2 = new int[5];
        // System.out.println(arr2[2]);
        arr2[0] = 5;

        float a = 4;
        // System.out.println(a);
    }
}

//////////////Class Methods//////


class Myan{
    public static void main(String[] args) {
        Bnb5 b = new Bnb5();
        // b.calculate(4, 4);
    // System.out.println(b instanceof Bnb5);
    // System.out.println(b.getClass().getName());
    }
}


class Bnb5 implements Functionall{
    public Bnb5(){}

    public void calculate(int a, int b){
        System.out.println(a+b);
    }

    
}

interface Functionall {
    void calculate(int num, int num2);
}

///////////////////////EXEPTINons///////////////




class InvalidAgeException extends Exception{
    public InvalidAgeException(String message){
        super(message);
    }
}

class AgeCheaker4545{
    private int age;
    public AgeCheaker4545(int age){
        this.age = age;
    }

    public void checkAge() throws InvalidAgeException{
        if(this.age < 0 || age > 130){
            throw new InvalidAgeException("aldabay jur");
        }
    }
}

public class test4545 {
    public static void main(String[] args) {
        try{
        FileWriter fwr = new FileWriter("book.txt");
        BufferedWriter bfw = new BufferedWriter(fwr);
        
            bfw.write("hello world");
            bfw.write("\nthe secodn line");
            bfw.close();
        }catch(IOException e){
            System.out.println(e.getMessage());
        }

        try{
            FileReader fr = new FileReader("book.txt");
            BufferedReader br = new BufferedReader(fr);
            String line;
            // while ((line = br.readLine()) !=null){
            //     System.out.println(line);
            // }
            System.out.println(br.readLine());
            System.out.println(br.readLine());
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}