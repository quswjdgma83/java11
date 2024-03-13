package app;

import company.Employee;

public class App {
    public static void main(String[] args) {
        Employee emp = new Employee(0, "10001", "james1", 20000L);
        Employee emp2 = new Employee(0, "10002", "james2", 20000L);
        System.out.println(emp);
        System.out.println(emp2);
    }
}
