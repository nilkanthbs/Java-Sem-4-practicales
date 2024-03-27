// Write a java program using throw keyword to throw custom exception.

import java.util.Scanner;

public class practical27 {
    static void checkAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("You are not a Legal Adult, Access Denied");
        }
        System.out.println("You are a Legal Adult, Access Granted");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Age :");
        int age = sc.nextInt();
        sc.close();
        checkAge(age);
    }
}