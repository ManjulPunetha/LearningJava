package exceptionHandling;

import java.io.IOException;

class Test {
    public void method() throws IOException {
        throw new IOException("IO Error");
    }
}

public class Throw2 {
    public static void main(String[] args) {
        Test obj = new Test();
        try {
            obj.method();
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

}
