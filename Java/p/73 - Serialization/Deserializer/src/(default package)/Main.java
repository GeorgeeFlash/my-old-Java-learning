import java.io.*;

public class Main {
    
    public static void main(String[] args) throws IOException, ClassNotFoundException {

      /*
      * Deserialization: The reverse process of converting a byte stream into an object.
        *                (Think of this as if you're loading a saved file).
      */

      User user = null;
      FileInputStream fileIn = new FileInputStream("C:\\Users\\Georgee Flash\\Desktop\\p\\73 - Serialization\\Serializer\\src\\(default package)\\UserInfo.ser");
      ObjectInputStream in = new ObjectInputStream(fileIn);
      user = (User) in.readObject();
      in.close();
      fileIn.close();

      System.out.println(user.name);
      System.out.println(user.password);
      user.sayHello();

    } 
}
