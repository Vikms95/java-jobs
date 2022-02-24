package com.example;

public class Employee {

    int baseSalary = 1500;
    int salaryToEarnGross;
    int salaryToEarnNet;
    int salaryYearGross;
    int salaryYearNet;
    

    Employee(){
    }
    
    /* 
    
    Gets the salary and applies the percentage to sum or substract

    */
    public static int calculatePercentageOnSalary(int salary, int percentage, boolean operationToDo) {
        
        int amountToApply = (salary * percentage) / 100;
        int salaryAfterPercentage;
        
        if(operationToDo == true){
            salaryAfterPercentage = salary + amountToApply;
        }else{
            salaryAfterPercentage = salary - amountToApply;
        }
        
        return salaryAfterPercentage;
    }

    /* 

    Establishes minimum salary per position

    */
    public static int raiseToMinimumSalary(int baseSalary,int minimumSalary) {

        if( baseSalary < minimumSalary){
            baseSalary = minimumSalary;
        }
        return baseSalary;
    }
    
    public void calculateYearGross(int salaryToEarnGross){
        this.salaryYearGross = salaryToEarnGross * 12;
    }

    public void calculateYearNet(int salaryToEarnNet){
        this.salaryToEarnNet = salaryToEarnNet * 12;
    }

}