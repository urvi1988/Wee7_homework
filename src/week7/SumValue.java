package week7;
// 20. Write a Java program to sum values of an array.
public class SumValue   {

    public static void main(String[] args) {

        int n[]= {2,4,6,8,5};
        int sum=0;

        for (int i=0; i<=n.length-1;i++)
        {
            sum=sum+n[i];
        }
        System.out.println("sum of array:"+ sum);

    }
}
