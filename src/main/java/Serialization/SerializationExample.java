package Serialization;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.*;


public class SerializationExample{
    public static void main(String[] args) throws IOException {
        Person p1 = new Person(1, "Lalit", "password@123");
        try {
            FileOutputStream fout = new FileOutputStream("file1.txt");
            ObjectOutputStream out = new ObjectOutputStream(fout);
            out.writeObject(p1);
            out.close();
            fout.close();
        } catch (IOException ioException) {
            System.out.println(ioException);
        }
    }
}
