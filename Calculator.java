package apniKasha;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter fist number");
        int a = sc.nextInt();

        System.out.println("Enter second number");
        int b = sc.nextInt();

        System.out.println("Enter the operstion");
        sc.nextLine();
        char operation = sc.nextLine().charAt(0);

        int result = 0;

        switch (operation){
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case  '/':
                result = a / b;
                break;
            default:
                System.out.println("Invalid operation");

        }

        System.out.println("The result is" + result);
        System.out.println();

    }
}

