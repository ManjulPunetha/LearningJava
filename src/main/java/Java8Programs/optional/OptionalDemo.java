package Java8Programs.optional;

import Java8Programs.streams.Employee;

import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {
        Employee emp = new Employee(12, "Rohan", null, 50000, 3);
        Optional<Object> empty = Optional.empty();
        System.out.println(empty);
        Optional<Employee> empObject = Optional.of(emp);
        String optAddress = Optional.ofNullable(empObject.get().getAddress())
                .orElse("USA");
        System.out.println(optAddress);
//
//        Optional<String> address = Optional.ofNullable(emp.getAddress());
//        System.out.println(address);
//        System.out.println("Address: "+address.orElse("USA"));
//
//        if(address.isPresent()){
//            System.out.println("Inside is present: "+address.get());
//        }
    }
}
