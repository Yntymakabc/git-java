import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.Buffer;
import java.nio.FloatBuffer;

public class inputAndOutput {
    public static void main(String[] args) {
        String[] arr = {"Yntymak", "akush", "aibek"};
        try{
        FileWriter fw = new FileWriter("one.txt");
        BufferedWriter writer = new BufferedWriter(fw);
            writer.write("this is the first time i am using IO");
            writer.write( "\n"+ "this tume for africa");
            for(String i:arr){
                writer.write("\n" + i);
            }
            writer.close();
        } catch(IOException e){
            e.getMessage();
        }

      
        try{
              FileReader fr = new FileReader("one.txt");
        BufferedReader reader = new BufferedReader(fr);
        //System.out.println(reader.readLine()); only one line
        String line;
        while((line = reader.readLine())!=null){
            System.out.println(line);
        }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
         
    }
}
