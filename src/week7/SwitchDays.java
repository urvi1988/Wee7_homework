package week7;
//15. Write a Java program which input any number between 1 to 7 and it print The Days
//name MONDAY, TUESDAY.....SUNDAY of the week accordingly by using switch.

public class SwitchDays {

    public static void main(String[] args) {
        int number = 5;

        switch (number) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Week contains 1 to 7 days");

        }
    }
}
