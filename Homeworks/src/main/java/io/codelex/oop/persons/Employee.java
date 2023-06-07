package io.codelex.oop.persons;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

class Employee extends Person {
    private final String position;
    private final LocalDate startedWorking;

    public Employee(String firstName, String lastName, String id, int age, String position, LocalDate startedWorking) {
        super(firstName, lastName, id, age);
        this.position = position;
        this.startedWorking = startedWorking;
    }

    public int getWorkExperience() {
        LocalDate currentDate = LocalDate.now();
        long years = ChronoUnit.YEARS.between(startedWorking, currentDate);
        return (int) years;
    }

    @Override
    public String getInfo() {
        int yearsOfWork = getWorkExperience();
        return position + " " + firstName + " " + lastName + " (" + yearsOfWork + " years)";
    }

    @Override
    public String toString() {
        return "Employee{" +
                "position='" + position + '\'' +
                ", startedWorking=" + startedWorking +
                '}';
    }
}