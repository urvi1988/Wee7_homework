package week7;
// 11. Same as above program-8 using switch statement.
public class SwitchStatment {

    public static void main(String[] args) {  // predefine method
        String Group= "H"; // define variable

        switch (Group){ // print group name
            case "A":
                System.out.println("Computer");
                break;
            case "B":
                System.out.println("Java");
                break;
            case "C":
                System.out.println("Notepad");
                break;
            case "D":
                System.out.println("Wordpad");
                break;
            case "E":
                System.out.println("Selenium");
                break;
            case "F":
                System.out.println("Postman");
                break;
            case "G":
                System.out.println("Mouse");
                break;
            case "H":
                System.out.println("KeyBoard");
                break;
            case"I":
                System.out.println("Java");
                break;
            case"J":
                System.out.println("Selenium");
                break;
                default:
                System.out.println("Invalid Input");

        }


    }


}
