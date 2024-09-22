package Java8Programs.consumer;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class Consumer1 {
    public static void main(String[] args) {
        Customer manjul = new Customer("Manjul", "5689845");
        //Consumer functional interface
        Consumer<Customer> greetCustomer = customer ->
                System.out.println("Hello " + customer.customerName + " Your num: " + customer.customerPhone);
        greetCustomer.accept(manjul);

        //BiConsumer functional interface
        BiConsumer<Customer, Boolean> greetMaskCustomer = (customer, maskPhoneNum) ->
                System.out.println("Hello " + customer.customerName + "Your num: "
                        + (maskPhoneNum ? "****" : customer.customerPhone));
        greetMaskCustomer.accept(manjul,true);

        int[] areaOfRectangle = new int[4];
        BiConsumer<Integer,Integer> area = (length,breadth)-> areaOfRectangle[0] = length*breadth;
        area.accept(4,5);
        System.out.println(areaOfRectangle[0]);

        //forEach method of Map interface accepts Biconsumer
        Map<Integer,String> studentMap = new HashMap<>();
        studentMap.put(1,"Manjul");
        studentMap.put(2,"Sohan");
        studentMap.put(3,"Albert");

        studentMap.forEach((id, name)-> System.out.println(id+" - "+name));
    }


    static class Customer {
        private String customerName;
        private String customerPhone;

        public Customer(String customerName, String customerPhone) {
            this.customerName = customerName;
            this.customerPhone = customerPhone;
        }
    }
}
