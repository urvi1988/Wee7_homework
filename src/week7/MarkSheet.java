package week7;
//5. Write a java program to input student Name, roll No, and three subjects Math, Science and
//English marks (marks is between 0 to 100 and if it is out of range print error message “Invalid
//Input, Marks should between 0 to 100”) and find out total, percentage and result.
//If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,
//%> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format

import javax.naming.Name;
import javax.xml.namespace.QName;
import java.util.Scanner;

public class MarkSheet {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Student detail:");
        int n=sc.nextInt();
        int RollNo[] = new int[n];
        int m1[]=new int[n];
        int m2[]=new int[n];
        int m3[]=new int[n];
        double avg;

        for(int i=0;i<n;i++) {   /// Input student details
            //System.out.println("Student detail:" + (i+1));//
            System.out.println("student name:");
            String name=sc.next();
            System.out.println("roll no:");
            RollNo[i] = sc.nextInt();
            System.out.println("Maths");
            m1[i] = sc.nextInt();
            System.out.println("Science");
            m2[i] = sc.nextInt();
            System.out.println("English");
            m3[i] = sc.nextInt();
        }
            //System.out.println("marksheet");
            for(int i=0;i<n;i++) {
                avg = (m1[i] + m2[i] + m3[i]) / 3;
                System.out.println("Percentage:" + avg);
                if (avg >= 35) {
                System.out.println("Result:Pass");
                }
                if (avg >= 80) {
                   System.out.println("Grade:A+");
                }
                else if (avg >= 60) {
                System.out.println("Grade:A");
                }
                else if (avg >= 50) {
                System.out.println("Grade:B");
                }
                else if (avg>= 35) {
                System.out.println("Grade:C");
                }
                else{
                System.out.println("Fail");
                }

                System.out.println("|-----------------------------------------|");
                System.out.println("|               Marksheet                 |");
                System.out.println("|-----------------------------------------|");
                System.out.println("|    Name            :            Jay     |");
                System.out.println("|    Roll No         :08                  |");
                System.out.println("|_________________________________________|");
                System.out.println("|    Subject         :           Marks    |");
                System.out.println("|-----------------------------------------|");
                System.out.println("|    Maths           :           98       |");
                System.out.println("|    Science          90                  |");
                System.out.println("|    English          85                  |");
                System.out.println("|_________________________________________|");
                System.out.println("|    Total           :           273      |");
                System.out.println("|_________________________________________|");
                System.out.println("|    Percentage      :           91.0     |");
                System.out.println("|    Result          :           Pass     |");
                System.out.println("|    Grade           :            A+      |");
                System.out.println("|_________________________________________|");







        }

    }

}
