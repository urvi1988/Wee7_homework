package week7;

import java.util.Scanner;

//10. Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
//any other alphabet should be invalid entry
public class AtoF_Cityname {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any alphabet from A to F:");
        String City = sc.nextLine();

        if (City.equals("a")) {
        System.out.println("Ajmer");
        } else if (City.equals("b")) {
            System.out.println("Bristol");
        } else if (City.equals("c")){
            System.out.println("Chennai");
        } else if (City.equals("d")) {
            System.out.println("Durham");
        } else if (City.equals("e")) {
            System.out.println(" Erzuram");
        } else if (City.equals("f")) {
            System.out.println("Fulham");
        }else {
            System.out.println(" Invalid Input");

        }



    }
}
