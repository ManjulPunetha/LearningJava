package Java8Programs.streams;

public class Employee {
    private int id;
    private String name;
    private String address;
    private int salary;
    private int exprience;

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", exprience=" + exprience +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getExprience() {
        return exprience;
    }

    public void setExprience(int exprience) {
        this.exprience = exprience;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Employee(int id, String name, String address, int salary, int exprience) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.exprience = exprience;
    }
}
