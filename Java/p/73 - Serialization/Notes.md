# Steps to Serialize
******************************************
1. Your object class should implement *Serializable* interface
2. Add import java.io.Serializable;
3. FileOutputStream fileOut = new FileOutputStram(file path)
4. ObjectOutputStream out = new ObjectOutputStram(fileOut);
5. out.writeObject(objectName);
6. out.close(); fileOut.close();

******************************************

# Steps to Deserialize
******************************************
1. Declare your object (don't instantiate)
2. Your class should implement *Serializable* interface
3. Add import java.io.Serializable;
4. FileInputStream fileIn = new FileInputStram(file path)
5. ObjectInputStream in = new ObjectInputStram(fileIn);
6. objectName = (Class) in.readObject();
7. in.close(); fileIn.close();

******************************************

# Important Notes
1. Children classes of a parent class that implements Serializable will do so as well
2. Static fields are not serialized (they belong to the class, not an individual object)
3. The class's definition ("class file") itself is not recorded, cast it as the object type
4. Fields declared as "transient" aren't serialized, they're ignored
5. serialVersionUID is a unique version ID

## serialVersionUID
- serialVersionUID is a unique ID that functions like a version number
- It verifies that the sender and reciever of a serialized object have loaded classes for that object that match
- Ensures object will be compatible between machines.
- Number must match. Otherwise this will cause an InvalidClassException
- A SerialVersionUID will be calculated based on class properties, memt
- A *serializable* class can declare its own serialVersionUID explicitly