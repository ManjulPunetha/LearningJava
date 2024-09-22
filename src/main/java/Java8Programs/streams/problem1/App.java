package Java8Programs.streams.problem1;

import java.util.*;
import java.util.stream.Collectors;


public class App
{

    static List<Employee> employeeList = new ArrayList<>();

    public static void main(String[] args) throws Exception {

        EmployeeFactory employeeFactory = new EmployeeFactory();
        employeeList = employeeFactory.getAllEmployee();

        //List all distinct project in non-ascending order.
        List<String> distinctProject = employeeList.stream()
                .flatMap(employee -> employee.getProjects().stream()).distinct()
                .sorted((p1, p2) -> p2.getName().compareTo(p1.getName()))
                .map(Project::getName)
                .collect(Collectors.toList());
        System.out.println(distinctProject);

        //Print full name of any employee whose firstName starts with ‘A’.
        List<String> firstNameA = employeeList.stream()
                .map(Employee::getFirstName)
                .filter(firstName -> firstName.startsWith("A"))
                .collect(Collectors.toList());
        System.out.println(firstNameA);

        //List of all employee who joined in year 2023
        // (year to be extracted from employee id i.e., 1st 4 characters)
        List<String> employeesJoined2023 = employeeList.stream()
                .filter(employee -> employee.getId().startsWith("2023"))
                .map(employee -> employee.getFirstName().concat(" ").concat(employee.getLastName()))
                .collect(Collectors.toList());
        System.out.println(employeesJoined2023);

        //TODO - Sort employees based on firstName, for same firstName sort by salary
        List<String> employeesFirstNameSalary = employeeList.stream()
                .sorted((e1, e2) -> e1.getFirstName().compareTo(e2.getFirstName()))
                .sorted((e1, e2) -> e1.getSalary() - e2.getSalary())
                .map(e -> e.getFirstName() + " " + e.getSalary() + "\n")
                .collect(Collectors.toList());
        System.out.println(employeesFirstNameSalary);

        //alternative
        employeeList.stream().sorted((e1, e2) -> {
            int comparison = e1.getFirstName().compareTo(e2.getFirstName());
            if (comparison == 0) {
                return e1.getSalary() - e2.getSalary();
            }
            return comparison;
        }).forEach(System.out::println);

        //Print min salary.
        int firstSalary = employeeList.stream().map(Employee::getSalary).findFirst().get();
        int minSalary = employeeList.stream()
                .map(Employee::getSalary)
                .reduce(firstSalary, (x, y) -> x < y ? x : y);
        System.out.println(minSalary);

        //Print list of all employee with min salary.
        List<String> employeesWithMinSalary = employeeList.stream()
                .filter(e -> e.getSalary() == minSalary)
                .map(Employee::getFirstName)
                .collect(Collectors.toList());
        System.out.println(employeesWithMinSalary);

        //List of people working on more than 2 projects.
        List<String> moreThan2Projects = employeeList.stream()
                .filter(e -> e.getProjects().size() > 2)
                .map(Employee::getFirstName)
                .collect(Collectors.toList());
        System.out.println(moreThan2Projects);

        //Count of total laptops assigned to the employees.
        int laptopCount = employeeList.stream()
                .map(Employee::getTotalLaptopsAssigned)
                .reduce(0, (x, y) -> x + y);
        System.out.println(laptopCount);
        //alter
        int sum = employeeList.stream()
                .mapToInt(each -> each.getTotalLaptopsAssigned()).sum();
        System.out.println(sum);

        //Count of all projects with Robert Downey Jr as PM.
        long countOfProjectsUnderPM = employeeList.stream()
                .flatMap(e->e.getProjects().stream())
                .filter(project -> project.getProjectManager().equals("Robert Downey Jr"))
                .distinct()
                .count();
        System.out.println("Count of all projects with Robert Downey Jr as PM.: " + countOfProjectsUnderPM);

        //List of all projects with Robert Downey Jr as PM.
        List<String> listOfProjectsUnderRobert= employeeList.stream()
                .flatMap(e->e.getProjects().stream())
                .filter(project -> project.getProjectManager().equals("Robert Downey Jr"))
                .map(Project::getName)
                .distinct()
                .collect(Collectors.toList());
        System.out.println("List of all projects with Robert Downey Jr as PM.: " + listOfProjectsUnderRobert);

        //List of all people working with Robert Downey Jr.
        List<String> workingWithRobert = employeeList.stream()
                .filter(employee -> employee.getProjects()
                        .stream()
                        .anyMatch(project -> project.getProjectManager().equals("Robert Downey Jr")))
                .map(Employee::getFirstName)
                .collect(Collectors.toList());
        System.out.println("List of all people working with Robert Downey Jr.: " + workingWithRobert);

        //Create a map based on this data, they key should be the year of joining,
        // and value should be list of all the employees who joined the particular year.
        Map<String,String> employeeMap = employeeList.stream()
                .collect(Collectors.toMap(Employee::getId,Employee::getFirstName));


    }
}
