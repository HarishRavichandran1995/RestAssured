package B2_Serializable_DeSerializable;
import java.io.*;

public class DeserializeDemo {
    public static void main(String[] args) {
        try {
            FileInputStream fileIn = new FileInputStream("person.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            Person p = (Person)in.readObject(); // Deserialization
            in.close();
            fileIn.close();
            System.out.println("Name: " + p.name + ", Age: " + p.age);
        } catch (IOException | ClassNotFoundException i) {
            i.printStackTrace();
        }
    }
}