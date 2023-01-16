package org.example;

public class Employee {
    private String firstName;
    private String lastName;
    private int yearOfService;
    private Employee manager;
    private int numberOfDirectReport;

    public Employee() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getYearOfService() {
        return yearOfService;
    }

    public void setYearOfService(int yearOfService) {
        this.yearOfService = yearOfService;
    }

    public Employee getManager() {
        return manager;
    }

    public void setManager(Employee manager) {
        this.manager = manager;
    }

    public int getNumberOfDirectReport() {
        return numberOfDirectReport;
    }

    public void setNumberOfDirectReport(int numberOfDirectReport) {
        this.numberOfDirectReport = numberOfDirectReport;
    }
}
