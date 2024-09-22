package Serialization;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@AllArgsConstructor
@Data
public class Person implements Serializable {
    private static final long serialversionUID = 30L;
    int id;
    String name;
    //static members and transient variables are not serialized
    static String category = "human";
    transient String password;
}