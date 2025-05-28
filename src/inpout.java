import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class inpout {
    public static void main(String[] args) {
        try{
        FileWriter fw = new FileWriter("newFile.txt");
        BufferedWriter bf = new BufferedWriter(fw);
        bf.write("hello world");
        bf.write("\nthis time for africa");
        bf.close();
    }catch (IOException e){
        System.out.println(e.getMessage());
    }

    try{
        FileReader fr = new FileReader("newFile.txt");
        BufferedReader br = new BufferedReader(fr);
        String line;
        while((line = br.readLine()) !=null){
            System.out.println(line);
        }

    }catch (IOException e){
        System.out.println(e.getMessage());
    }
}
}

