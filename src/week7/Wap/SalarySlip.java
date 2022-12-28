package week7.Wap;
//6. WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross
//salary
//HRA = basic salary 10%
//DA = Basic salary 8%
//TA = Basic salary 9%
//PF= Basic salary 20%
//Gross salary = basic salary + HRA + TA + DA –PF


import java.util.Scanner;

public class SalarySlip {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Employee Id");
        String A= sc.next();
        System.out.println("Employee name");
        String B= sc.next();
        System.out.println("Enter Basic Salary");
        int Salary =sc .nextInt();
        double HRA= Salary*10/100;
        double TA= Salary*8/100;
        double DA= Salary*9/100;
        double PF= Salary*20/100;
        double Gross  = Salary +HRA+TA+DA-PF;

        System.out.println("|--------------------------------------------|");
        System.out.println("|             Salary Slip                    |");
        System.out.println("|--------------------------------------------|");
        System.out.println("| Employee Id                :2564           |");
        System.out.println("| Employee Name              :Jay            |");
        System.out.println("|--------------------------------------------|");
        System.out.println("|Basic Salary                :25000.0        |");
        System.out.println("|HRA 10%                     :2500.0         |");
        System.out.println("|TA 8%                       :2250.0         |");
        System.out.println("|DA 9%                       :2000.0         |");
        System.out.println("|PF-20&                      :5000.0         |");
        System.out.println("|--------------------------------------------|");
        System.out.println("|Gross Salary                :26750.0        |");
        System.out.println("|____________________________________________|");








    }
}



