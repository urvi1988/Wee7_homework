package week7;
//19. Write a Java program to sort a numeric array and a string array.

import java.util.Arrays;

public class NumericArray_StringArray {
    public static void main(String[] args) {

        String[] name = {"Apple", "Orange", "Mango", "Banana", "Grapes"};
        int[] number = {15, 30, 10, 25, 20};

        System.out.println("Original value:" + Arrays.toString(number));
        Arrays.sort(number);
        System.out.println("Shorted value:" + Arrays.toString(number));
        Arrays.sort(number);
        System.out.println("Original value:"+ Arrays.toString(name));
        Arrays.sort(name);
        System.out.println("Shorted value:"+ Arrays.toString(name));
        Arrays.sort(name);


    }

}