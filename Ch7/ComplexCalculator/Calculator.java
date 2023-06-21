package Ch7.ComplexCalculator;

import java.text.NumberFormat;
import java.util.Scanner;
import java.util.function.DoublePredicate;

public class Calculator {


    private Scanner scan = new Scanner(System.in);

    private String num1;
    private String num2;
    private String operator;

    public Calculator(){
        setValues();

        try{
            double n1 = parseDouble(this.num1);
            double n2 = parseDouble(this.num2);
            double result = calculate(n1, n2, getOperator());
            System.out.println("The answers is " + result);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }

    public double calculate(double n1, double n2, String operator) {

        double result = 0;
        switch(operator){
            case "+":
                result = getSum(n1, n2);
                break;
            case "-":
                result = getDifference(n1, n2);
                break;
            case "*":
                result = getProduct(n1, n2);
                break;
            case "/":
                if (n2!=0)
                {
                    result = getQuotient(n1, n2);
                }
                else
                {
                    throw new ArithmeticException("Error: Cannot divide by zero.");
                }
                break;
            default:
                throw new IllegalArgumentException("Unrecognized operator!");
        }

        return result;
    }
    public void setValues()
    {
        System.out.print("Enter a numeric value: ");
        this.num1 = scan.nextLine();

        System.out.print("Enter a numeric value: ");
        this.num2 = scan.nextLine();

        System.out.print("Choose an operation (+ - * /): ");
        this.operator = scan.next();
    }

    private double parseDouble(String number) {
        try {
            return Double.parseDouble(number);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Number formatting exception for input string: " + number);
        }
    }
    public String getOperator() {
        return operator;
    }

    public double getSum(double num1, double num2){
        return num1 + num2;
    }

    public double getDifference(double num1, double num2){
        return num1 - num2;
    }

    public double getProduct(double num1, double num2){
        return num1 * num2;
    }

    public double getQuotient(double num1, double num2){
        if (num2==0){
            throw new ArithmeticException("Division by zero");
        }
        return num1 / num2;
    }

}

