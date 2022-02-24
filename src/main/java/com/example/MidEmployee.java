package com.example;

public class MidEmployee extends Employee {

    MidEmployee(){
        final int minimumSalary = 1800;
        baseSalary = raiseToMinimumSalary(baseSalary,minimumSalary);
        salaryToEarnGross = calculatePercentageOnSalary(baseSalary, 10,false);
        salaryToEarnNet = calculatePercentageOnSalary(salaryToEarnGross, 15,false);
        calculateYearGross(salaryToEarnGross);
        calculateYearNet(salaryToEarnNet);
        salaryYearNet = calculatePercentageOnSalary(salaryYearNet, 10, true);
    }
    
}
