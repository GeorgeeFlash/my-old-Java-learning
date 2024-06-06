import java.io.FileWriter;
import java.io.IOException;

public class Main {
    
    public static void main(String[] args) {
        
        // file = An abstract representation of a file and directory pathnames
        try{
            FileWriter writer = new FileWriter("poem.txt");
            writer.write("Roses are Red\nViolets are blue\nGo get the water\nTo put on the fire");
            writer.append("\n(A poem by Flash)");
            writer.close();
        }
        catch(IOException e) {
            e.printStackTrace();
        }

    } 
}