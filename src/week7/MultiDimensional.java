package week7;

// 3. Declare multidimensional array and store 5 countries and their capital and print them in console.

public class MultiDimensional { // class name

    public static void main(String[] args) { // predefine method

        String name[][] = {{"india","Delhi"},{"Germany","Berlin"},{"Pakistan","Islamabad"},{"England","London"}, {"wales","cardiff"}}; // declare country name and capital name

                System.out.println("The Country is:" + name[0][0]  + "  and  "  + "The capital is:" + name[0][1]);
                System.out.println("The Country is:" + name[1][0]  + "  and  "  + "The capital is:" + name[1][1]);
                System.out.println("The Country is:" + name[2][0]  + "  and  "  + "The capital is:" + name[2][1]);
                System.out.println("The Country is:" + name[3][0]  + "  and  " + "The capital is:" + name[3][1]);
                System.out.println("The country is:"+  name[4][0]  + "  and  " + "The capital is:" + name[4][1]);






    }
}
