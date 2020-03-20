package com.java.walmart;

public class Employee {

   private Integer empId;

    private String name;

    public Employee(Integer empId) {
        this.empId = empId;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object object){
        if (object == null || !object.getClass().equals(Employee.class)){
            return false;
        }
        return this.empId == ((Employee)object).empId;
    }

    public int hashCode(){
        return this.empId;
    }
}
