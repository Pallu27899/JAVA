// 1.What will be the result of the following expression:
// float a = 7/4 * 9/2
// 2.Write a java program to encrypt a grade by adding 8 to it. Decrypt it to show the correct grade.
// 3.Use comparison operators to find out whether a given number is greater than the user entered number or not.

package problemSet;
import java.util.Scanner;
public class two {
    public static void main(String[] args) {
        System.out.println("_______________problem 1_________________");

        // problem 1 
        float a = 7/4.0f * 9/2.0f;
        System.out.println(a);

        System.out.println("_______________problem 2_________________");
        // problem 2
        char grade = 'B';
        grade = (char)(grade + 8);
        System.out.println(grade);
        // Decrypting the grade
        grade = (char)(grade - 8);
        System.out.println(grade);

        System.out.println("________________ problem 3_________________");
        // problem 3

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value");
        int p = sc.nextInt();
        System.out.println(p>8);
        System.out.println(7*49/7+35/7);
    }
}
