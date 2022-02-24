package com.example;

public class JuniorEmployee extends Employee{


    JuniorEmployee(){
        final int minimumSalary = 900;
        baseSalary = raiseToMinimumSalary(baseSalary,minimumSalary);
        salaryToEarnGross = calculatePercentageOnSalary(baseSalary, 15,false);
        salaryToEarnNet = calculatePercentageOnSalary(salaryToEarnGross, 2,false);
        calculateYearGross(salaryToEarnGross);
        calculateYearNet(salaryToEarnNet);
        salaryYearNet = calculatePercentageOnSalary(salaryYearNet, 10, true);
    }
    
}
