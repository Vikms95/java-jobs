package com.example;

public class Boss extends Employee {
    
    Boss(){
        final int minimumSalary = 8000;
        baseSalary = raiseToMinimumSalary(baseSalary,minimumSalary);
        salaryToEarnGross = calculatePercentageOnSalary(baseSalary,50,true);
        salaryToEarnNet = calculatePercentageOnSalary(salaryToEarnGross, 32,false);
        calculateYearGross(salaryToEarnGross);
        calculateYearNet(salaryToEarnNet);
        salaryYearNet = calculatePercentageOnSalary(salaryYearNet, 10, true);
    }
    
}
