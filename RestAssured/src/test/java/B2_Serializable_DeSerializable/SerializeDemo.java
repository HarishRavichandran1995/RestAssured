package B2_Serializable_DeSerializable;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeDemo {
	public static void main(String[] args) {
		try {
			Person p = new Person("John", 30);
			FileOutputStream fileOut = new FileOutputStream("person.ser");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(p); // Serialization
			out.close();
			fileOut.close();
			System.out.println("Serialized data saved in person.ser");
		} catch (IOException i) {
			i.printStackTrace();
		}
	}}
