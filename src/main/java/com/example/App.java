package com.example;

public class App {
    
    public static void main( String[] args )
    {   
        Boss Lucia = new Boss();
        Manager Antonia = new Manager();
        SeniorEmployee Maria = new SeniorEmployee();
        MidEmployee Alex = new MidEmployee();
        JuniorEmployee Juan = new JuniorEmployee();
        Volunteer Ramon = new Volunteer();
        

        /*System.out.println(Lucia.salaryToEarnNet);
        System.out.println(Antonia.salaryToEarnNet);
        System.out.println(Maria.salaryToEarnNet);
        System.out.println(Alex.salaryToEarnNet);
        System.out.println(Juan.salaryToEarnNet);
        System.out.println(Ramon.salaryToEarnNet);*/
        System.out.println(Lucia.salaryYearNet);
    }
}