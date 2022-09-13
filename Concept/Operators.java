package Concept;

public class Operators {
    public static void main(String[] args) {
        // 1. Arithmetic Operators
        int a = 4;
        int b = 6 % a; // Modulo Operator
        System.out.println(b);
        // 4.8%1.1 --> Returns Decimal Remainder

        // 2. Assignment Operators
        int p = 9;
        p *= 3;
        System.out.println(p);

        // 3. Comparison Operators
        // System.out.println(64<6);

        // 4. Logical Operators
        // System.out.println(64>5 && 64>98);
        System.out.println(64 > 5 || 64 >98);

        // 5. Bitwise Operators
        System.out.println(2 & 3);
        // 10
        // 11
        // ----
        // 10
    }

}