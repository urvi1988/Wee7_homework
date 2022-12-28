package week7.Wap;
//  9. Write a java program input sales id, seller's name, sales amount, and salary basic and
//then fined this sales

import java.util.Scanner;

public class Commission {

    public static void main(String[] args) {
        int rate = 0;
        int sales = 0;
        double commission = 0.0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Input Sales ID:");
        int i = sc.nextInt();
        System.out.println("Input seller name:");
        String name = sc.next();
        System.out.println("Input sales amount:");
        int a = sc.nextInt();
        System.out.println("Input basic salary:");
        int b = sc.nextInt();
        System.out.println("Sales commission");
        int c = sc.nextInt();

        if (sales >= 50000) {
            rate = 35;
            commission = sales * 0.35;
        } else if (sales >= 30000) {
            rate = 20;
            commission = sales * 0.20;
        } else if (sales >= 20000) {
            rate = 10;
            commission = sales * 0.10;
        } else if (sales >= 10000) {
            rate = 5;
            commission = sales * 0.05;
        } else if (sales < 10000) {
            rate = 2;
            commission = sales *0.02;
        } else {
            System.out.println("Invalid");
        }
        System.out.println("Commission amount is:"+ commission);

    }
}