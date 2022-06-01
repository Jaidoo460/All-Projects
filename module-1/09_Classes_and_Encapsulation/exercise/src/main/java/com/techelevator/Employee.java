package com.techelevator;

public class Employee {
    private int employeeId;
    private String firstName;
    private String lastName;
    private String department;
    private double annualSalary;

    public String getFullName(){
        return lastName + ", " + firstName;

    }

    public Employee (int employeeId, String firstName, String lastName, double annualSalary){
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.annualSalary = annualSalary;
    }

    public int getEmployeeId(){
        return this.employeeId;
    }

    public  String getFirstName(){
        return this.firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public String getDepartment(){
        return this.department;
    }

    public double getAnnualSalary(){
        return this.annualSalary;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void setDepartment(String department){
        this.department = department;
    }

    public void raiseSalary(double percent){
        this.annualSalary = ((percent/100) * this.annualSalary) + this.annualSalary;
    }
}
