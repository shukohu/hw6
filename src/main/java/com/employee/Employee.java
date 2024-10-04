package com.employee;

import java.util.Objects;

public class Employee {
    private final String firsName;
    private final String lastName;

    public Employee(String firsName, String lastName) {
        this.firsName = firsName;
        this.lastName = lastName;
    }

    public String getFirsName() {
        return firsName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(firsName, employee.firsName) && Objects.equals(lastName, employee.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firsName, lastName);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firsName='" + firsName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
