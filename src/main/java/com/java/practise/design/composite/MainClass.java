package com.java.practise.design.composite;

public class MainClass {

    public static void main(String[] args) {
        Employee developer = new Developer("1", "Mnt");
        Employee manager = new Manager("2", "Snt");
        CompanyDirectory companyDirectory = new CompanyDirectory();
        companyDirectory.addEmployee(developer);
        companyDirectory.addEmployee(manager);
        companyDirectory.showDetails();
    }
}
