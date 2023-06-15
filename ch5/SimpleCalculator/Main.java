package ch5.SimpleCalculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double num1;
        double num2;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a numeric value: ");
        num1 = Double.parseDouble(scanner.nextLine());

        System.out.print("Enter a numeric value: ");
        num2 = Double.parseDouble(scanner.nextLine());

        System.out.println("The answer is: " + (num1+num2));

    }


}
