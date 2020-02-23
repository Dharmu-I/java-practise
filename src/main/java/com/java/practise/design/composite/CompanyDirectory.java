package com.java.practise.design.composite;

import java.util.ArrayList;
import java.util.List;

public class CompanyDirectory implements Employee {

    private List<Employee> employees = new ArrayList<>();

    @Override
    public void showDetails() {
        for (Employee employee : employees){
            employee.showDetails();
        }
    }

    public void addEmployee(Employee employee){
        employees.add(employee);
    }

    public void removeEmployee(Employee employee){
        employees.remove(employee);
    }
}
