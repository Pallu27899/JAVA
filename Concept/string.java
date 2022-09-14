package Concept;
import java.util.Scanner;
public class string {
    public static void main(String[] args) {

//    %d for int
//   %f for float
//   %c for char
//   %s for string 

        String name = new String("Harry");
        // String n = "Harry";
        System.out.print("The name is: " +name);
        // System.out.print(name);
        int a = 6;
        float b = 5.6454f;
        System.out.printf("The value of a is %d and value of b is %8.2f", a, b);
        //System.out.format("The value of a is %d and value of b is %f", a, b);
        Scanner sc = new Scanner(System.in);

    //    String st = sc.next(); 

       String st = sc.nextLine();
       System.out.println(st);

    }
}
