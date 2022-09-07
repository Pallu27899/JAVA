package com.evolution.c2.problem5;


import java.util.Scanner;
public class Main {




    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner input = new Scanner(System.in);
        Employee empoye = new Employee();

        System.out.println("Enter Id :");
        int employeeId = input.nextInt();

        System.out.println("Enter Name :");
        input.nextLine();
        String employeeName = input.nextLine();

        System.out.println("Enter Salary :");
        double salary = input.nextDouble();

        System.out.println("Enter PF percentage :");
        int pfpercentage = input.nextInt();

        empoye.setEmployeeId(employeeId);
        empoye.setEmployeeName(employeeName);
        empoye.setSalary(salary);
        empoye.calculateNetSalary(pfpercentage);

// output

        System.out.println("id :" + " " + empoye.getEmployeeId());
        System.out.println("Name :" + " " + empoye.getEmployeeName());
        System.out.println("Salary :" + " " + empoye.getSalary());
        System.out.println("Net Salary :" + " " + empoye.getNetSalary());


    }
}

    