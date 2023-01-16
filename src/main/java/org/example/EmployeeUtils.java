package org.example;

import java.util.function.Function;

public class EmployeeUtils {
    public String getFullName(Employee employee) {
        Function<Employee, String> fullName = e -> e.getFirstName() + " " + e.getLastName();
        return fullName.apply(employee);
    }

    public String getManagerLastName(Employee employee) {
        Function<Employee, String> managerLastName = e -> e.getManager().getLastName();
        return managerLastName.apply((Employee) employee);
    }
}
