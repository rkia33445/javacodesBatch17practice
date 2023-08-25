package Class5;

import java.util.Scanner;

public class HW4 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the first number");
        double num1=input.nextDouble();
        System.out.println("enter the second number");
        double num2=input.nextDouble();
        System.out.println("enter (+,-,*,/)");
       char operator=input.next().charAt(0);

        if (operator == '+') {
            System.out.println(num1 + num2);
        } else if (operator == '-') {
            System.out.println(num1 - num2);
        } else if (operator == '*') {
            System.out.println(num1 * num2);
        } else if (operator == '/') {
            System.out.println(num1 / num2);
        }

    }
}
