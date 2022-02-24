package com.example;

public class SeniorEmployee extends Employee {


    public SeniorEmployee(){
        final int minimumSalary = 2700;
        baseSalary = raiseToMinimumSalary(baseSalary,minimumSalary);
        salaryToEarnGross = calculatePercentageOnSalary(baseSalary, 10,false);
        salaryToEarnNet = calculatePercentageOnSalary(salaryToEarnGross, 5,false);
        calculateYearGross(salaryToEarnGross);
        calculateYearNet(salaryToEarnNet);
        salaryYearNet = calculatePercentageOnSalary(salaryYearNet, 10, true);
    }
  
}