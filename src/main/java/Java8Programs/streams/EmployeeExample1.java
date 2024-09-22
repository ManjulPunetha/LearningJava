package Java8Programs.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeExample1 {
    public static void main(String[] args) {
        Employee e1 = new Employee(12, "Sohan", "Street", 18000, 2);
        Employee e2 = new Employee(44, "Albert", "Bangalore", 50268, 4);
        Employee e3 = new Employee(2, "Tran", "Ludhiana", 35987, 3);

        List<Employee> employees = new ArrayList<>(Arrays.asList(e1, e2, e3));

        List<Employee> filteredEmployee = employees.stream()
                .filter(i -> i.getExprience() >= 3 && i.getSalary() > 50000)
                .map(employee -> new Employee(employee.getId()
                        , employee.getName(), employee.getAddress()
                        , employee.getSalary() + 5000
                        , employee.getExprience()))
                .collect(Collectors.toList());

        System.out.println(filteredEmployee);


    }
}
