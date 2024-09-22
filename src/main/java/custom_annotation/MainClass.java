package custom_annotation;

import java.lang.annotation.Annotation;

public class MainClass
{
    public static void main(String[] args) {
        OnePlus onePlus = new OnePlus("Nord", 7);

        //Reflection concepts
        Class c = onePlus.getClass();
        Annotation annotation = c.getAnnotation(SmartPhone.class);
        SmartPhone smartPhone = (SmartPhone) annotation;
        System.out.println("Our phone " + onePlus.model + " is of OS: " + smartPhone.os());
    }
}
