package week7;
//12. Write a java program to input any two number and ask user to enter their symbol (+, -,/,*) find addition, Subtraction, multiplication and division
// according to their symbol (using if else)

import java.util.Scanner;

public class EnterSymbol {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input Number:");
        int x= sc.nextInt();   //  reading number from user
        System.out.println("Input Number");
        int y= sc.nextInt();
        System.out.println("Input any symbol from(+,-,/,*");
        char symbol = sc.next().charAt(0);

        if (symbol=='+')
        {
            System.out.println("Addition is :" +(x+y)); // print different methods
        } else if (symbol=='-') {
            System.out.println("Subtraction is:" + (x-y));
        } else if (symbol=='/') {
            System.out.println("Division is:"+ (x/y));
        } else if (symbol=='*') {
            System.out.println("Multiplication is:" + (x * y));
        } else {
            System.out.println("Invalid input");


        }

    }


    }



