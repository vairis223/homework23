package io.codelex.oop.exercise3;

import java.util.Objects;

public class Manufacturer {
    String name;
    int yearOfEst;

    String country;

    public Manufacturer(String name, int yearOfEst, String country) {
        this.name = name;
        this.yearOfEst = yearOfEst;
        this.country = country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setYearOfEst(int yearOfEst) {
        this.yearOfEst = yearOfEst;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getYearOfEst() {
        return yearOfEst;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Manufacturer that = (Manufacturer) o;
        return yearOfEst == that.yearOfEst && Objects.equals(name, that.name) && Objects.equals(country, that.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, yearOfEst, country);
    }
}

