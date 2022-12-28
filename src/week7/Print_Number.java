package week7;
//13. Write a java program to print the numbers between 1 to 100 which can be divided by 3 and 5 separately.

public class Print_Number { // Declare class
    public static void main(String[] args) { // Declare main method
        System.out.println("Divided by 3:"); // print statement
        for (int i=1; i<100; i++)  { // Declare loop method
            if (i%3==0); //  this represents when 3 number divide by another
            System.out.println( i +",");
        }

        System.out.println("Divided by 5:"); // print statment
        for (int a=1; a<100; a++)  { // Declare loop method
            if (a%5==0); // this represents when 5 number divide by another
            System.out.println(a+",");
        }

    }

}
