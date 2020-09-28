package ua.zp.brainacad;

import java.util.Objects;

public class Employee extends Human {
    private String employmentDate;
    private double salary;
    private String presence;

    public Employee(String fullName, String telephone) {
        super(fullName, telephone);
    }

    public void goWork() {
        System.out.println("Go to Work");
    }
    public void lunch() {
        System.out.println("Go to Lunch");
    }
    public void work() {
        System.out.println("Work");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Employee employee = (Employee) o;
        return Double.compare(employee.salary, salary) == 0 &&
                Objects.equals(employmentDate, employee.employmentDate) &&
                Objects.equals(presence, employee.presence);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), employmentDate, salary, presence);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employmentDate='" + employmentDate + '\'' +
                ", salary=" + salary +
                ", presence='" + presence + '\'' +
                '}';
    }
}
