package ru.mck.cw1;

import java.util.Objects;

public class Employee {
    private String firstName;
    private String middleName;
    private String lastName;

    private int department;
    private int salary;
    private int id;
    private static int count = 0;

    public Employee(String firstName, String middleName, String lastName, int department, int salary) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.department = department;
        this.salary = salary;
        this.id = count++;
    }


    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Сотрудник: " +
                " №: " + (id + 1) + "; " +
                " Имя: " + firstName + "; \t" +
                " Отчество: " + middleName + "; \t" +
                " Фамилия: " + lastName + "; \t" +
                " Отдел: " + department + "; \t" +
                " Заработная плата: " + salary + " рублей";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return department == employee.department &&
                salary == employee.salary &&
                id == employee.id &&
                Objects.equals(firstName, employee.firstName)
                && Objects.equals(middleName, employee.middleName)
                && Objects.equals(lastName, employee.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, middleName, lastName, department, salary, id);
    }
}

