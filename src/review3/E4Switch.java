package review3;

import java.util.Scanner;

public class E4Switch {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter the name of the Fruit");
        String fruit=input.nextLine();

        switch (fruit){
            case "Orange":
                System.out.println("It is usually Orange");
                break;
            case "Banana":
                System.out.println("Yallow Banana are good");
                break;
            case "Strawberry":
                System.out.println("I like red strawberry");
                break;
            case "Blue berry":
                System.out.println("Blue berry are very good for heart");
                break;
            default:
                System.out.println("I don't like this fruit ");




        }

    }
}
