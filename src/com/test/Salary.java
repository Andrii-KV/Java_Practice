package com.test;

import HomeWork.Employee;

public class Salary {

    public static int getSum(Employee[] employees){
        int sum = 0;
        for (int i = 0; i < employees.length; i++) {
           sum += employees[i].getSalary();
        }
        return sum;
    }
}
