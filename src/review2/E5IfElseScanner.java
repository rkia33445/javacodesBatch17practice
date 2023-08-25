package review2;

import java.util.Scanner;

public class E5IfElseScanner {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter your age to calculate the discount");
        int age=scanner.nextInt();
        /*
        if age is greater than 60 offer 20% discount
        if age is greater than 50 offer 15% discount
        if age is greater than 40 offer 10% discount
        No discount
         */
        if (age>60){
            System.out.println("you get 20% Discount");
        } else if (age>50) {
            System.out.println("you get 15% Discount ");
        } else if (age>40) {
            System.out.println("you git 10% Discount");
        }else {
            System.out.println("No discount for you ");
        }

        }

    }




