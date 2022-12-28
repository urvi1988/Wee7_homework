package week7;
// 14. Write a program that tells us input value is number or an alphabet or symbol.

import java.util.Scanner;

public class NumberAlphbetSymbole {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input value is number or alphabet or symbol:");
        char o = sc.next().charAt(0);
        if((o>='o'&& o<='p') || (o>='A'&& o<='Z')) {
            System.out.println("Is a alphabet");
        } else if (o>='0' && o<='5') {
            System.out.println("Is a number");
        } else {
            System.out.println("Is a symbol+");
        }
    }

}
