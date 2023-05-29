package io.codelex.oop.persons;

import java.time.LocalDate;

public class PersonsTest {
    public static void main(String[] args) {
        LocalDate startedWorkingDate = LocalDate.of(2020, 5, 6);

        Employee employee = new Employee("Edward", "Brown", "ID4553", 36, "Accountant", startedWorkingDate);
        System.out.println(employee.getInfo());
        System.out.println("Age: "+ employee.getAge());
        System.out.println("First name: " + employee.getFirstName());
        System.out.println("Last name: " + employee.getLastName());
        System.out.println("Work experience: " + employee.getWorkExperience());
        System.out.println();

        Customer customer = new Customer("Peter", "Brown", "CID1234", 25, "Customer", 7);
        System.out.println(customer.getInfo());
        System.out.println("Customers ID: " + customer.getId());
        System.out.println("Customers last name: " + customer.getLastName());
        System.out.println("Customers purchases: " + customer.getPurchaseCount());
    }
}
