package io.codelex.polymorphism.practice.exercise3;

public class PersonsTest {
    public static void main(String[] args) {
        Student student = new Student("Andris", "Bests", "Vanagu 544",45, 3.5);
        Employee employee = new Employee("Juris", "Rozis", "Liepu 2", 7899, "Accountant");

        System.out.println("Information about student: ");
        student.display();
        System.out.println();

        System.out.println("Information about employee: ");
        employee.display();
        System.out.println();


        student.setFirstName("Mark");
        student.setLastName("Aldo");
        student.setId(3455);
        student.setGpa(3.9);
        employee.setJobTitle("Supervisor");
        employee.setAddress("Rigas 4555");

        System.out.println("Another information about student:");
        System.out.println("First Name: " + student.getFirstName());
        System.out.println("Last Name: " + student.getLastName());
        System.out.println("Address: " + student.getAddress());
        System.out.println("ID: " +student.getId());
        System.out.println("GPA: " + student.getGpa());
        System.out.println();



        System.out.println("Another information about employee:");
        System.out.println("First Name: " + employee.getFirstName());
        System.out.println("Last Name: " + employee.getLastName());
        System.out.println("Another address: " + employee.getAddress());
        System.out.println("Job Title: " + employee.getJobTitle());
    }
}
