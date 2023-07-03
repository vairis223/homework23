package io.codelex.classesandobjects.practice;

public class DateTest {

        public static void main(String[] args) {
            Date myDate = new Date(5, 15, 2023);
            System.out.print("The date is: ");
            myDate.displayDate();
            System.out.println();

            myDate.setMonth(6);
            myDate.setDay(15);
            myDate.setYear(2024);

            System.out.print("The new date is: ");
            myDate.displayDate();
            System.out.println();

        }
    }

