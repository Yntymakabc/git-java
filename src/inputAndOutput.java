import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.Buffer;

public class inputAndOutput {
    public static void main(String[] args) {
        try{
        BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
            writer.write("this is the first time i am w");
        } catch(IOException e){
            e.getMessage();
        }
    }
}
