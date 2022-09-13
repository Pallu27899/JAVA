package Concept;
import java.util.Scanner;

public class GettingUserInput {
    public static void main(String[] args) {
        System.out.println("Taking Input From the User");
        Scanner p = new Scanner(System.in);

        System.out.println("Enter number 1");
        int a = p.nextInt();

        // float f = p.nextFloat();

        System.out.println("Enter number 2");
        int b = p.nextInt();

        // float fl = p.nextFloat();

        int sum = a + b;

        // float sum1 = f + fl;

        System.out.println("The sum of these numbers is");
        System.out.println(sum);

        boolean b1 = p.hasNextInt();
        System.out.println("it is integer" +b1);

        // String str = p.next();

        String str1 = p.nextLine();
        System.out.println(str1);

    }
}
