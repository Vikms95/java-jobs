package com.example;

public class Volunteer extends Employee {
    Volunteer(){
        final int minimumSalary = 0;
        salaryToEarnGross = calculatePercentageOnSalary(0, 100,false);
        salaryToEarnNet = salaryToEarnGross+ 300;
        calculateYearGross(salaryToEarnGross);
        calculateYearNet(salaryToEarnNet);
    }
}
