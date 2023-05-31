package io.codelex.collections.practice.phonebook;

public class PhoneEntry {
    String name;
    String number;


    public static void main(String[] args) {
      PhoneDirectory phoneDirectory = new PhoneDirectory();

      phoneDirectory.putNumber("Otto", "26489955");
        phoneDirectory.putNumber("Mirdza", "26487518");
        phoneDirectory.putNumber("Laura", "261255443");
        phoneDirectory.putNumber("Vairis", "26456778");
        phoneDirectory.putNumber("Anna", "26779344");
        phoneDirectory.putNumber("Jesper", "26086554");


        System.out.println("Otto's number is: " + phoneDirectory.getNumber("Otto"));
        System.out.println("Mirdzas number is: " + phoneDirectory.getNumber("Mirdza"));
        System.out.println("Lauras number is: " + phoneDirectory.getNumber("Laura"));
        System.out.println("Vairis number is: " + phoneDirectory.getNumber("Vairis"));
        System.out.println("Annas number is: " + phoneDirectory.getNumber("Anna"));
        System.out.println("Jesper number is: " + phoneDirectory.getNumber("Jesper"));

    }
}