package com.example;

public class Manager extends Employee{
    
    Manager(){
        final int minimumSalary = 3000;
        this.baseSalary = raiseToMinimumSalary(baseSalary,minimumSalary);
        this.salaryToEarnGross = calculatePercentageOnSalary(baseSalary, 10,true);
        this.salaryToEarnNet = calculatePercentageOnSalary(salaryToEarnGross, 26,false);
        calculateYearGross(salaryToEarnGross);
        calculateYearNet(salaryToEarnNet);
        salaryYearNet = calculatePercentageOnSalary(salaryYearNet, 10, true);
    }   

}
