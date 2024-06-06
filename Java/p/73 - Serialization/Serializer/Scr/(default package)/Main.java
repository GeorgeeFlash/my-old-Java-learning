import java.io.*;

public class Main {
    
    public static void main(String[] args) throws IOException {

      /*
      * Serialization: The process of converting an object into a byte stream.
      *                Persists (saves the state) the object after program exits
      *                This byte stream can be saced as a file or sent over a network
      *                Can be sent to a different machine
      *                Byte stream can be saved as a file (.ser) which is platform independent
      *                (Think of this as if you're saving a file with the object's information)
      */

      User user = new User();

      user.name = "Flash";
      user.password = "mySecurePass";

      FileOutputStream fileOut = new FileOutputStream("UserInfo.ser");
      ObjectOutputStream out = new ObjectOutputStream(fileOut);
      out.writeObject(user);
      out.close();
      fileOut.close();

      System.out.println("Object Info Saved");

      long serialVersionUID = ObjectStreamClass.lookup(user.getClass()).getSerialVersionUID();

      System.out.println(serialVersionUID);

    } 
}
