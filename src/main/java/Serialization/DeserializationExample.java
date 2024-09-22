package Serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class DeserializationExample{
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Person p2 = null;
        try {
            FileInputStream fin = new FileInputStream("file1.txt");
            ObjectInputStream in = new ObjectInputStream(fin);
            p2 = (Person) in.readObject();
            System.out.println(p2);
            in.close();
        } catch (IOException ex) {
            System.out.println(ex);
        }

    }
}
