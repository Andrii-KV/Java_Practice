package com.test;

public class Employee extends Person {
    int salary;



    public Employee(String name, int age, char sex, int salary) {
        super(name, age, sex);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    boolean isSameName(Employee employee){
        return this.getBaseName().equals(employee.getBaseName());
    }

    @Override
    public String getName() {
        return getBaseName();
    }

    public  String getPersonName(){
        return super.getName();
    }
}
