package week7;
// 21. Write a Java program to calculate the average value of array elements.

public class AverageValueArray {

    public static void main(String[] args) {
        int number[]= {10,20,30,40,50};
        int a ,sum, avg;
        sum=0;
        for (a=0; a<number.length;a++){
            sum+= number[a];
        }
        avg=sum/number.length;
        System.out.println("The average of given number:"+avg);
    }

}
