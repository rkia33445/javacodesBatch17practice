package Class5;

import java.util.Scanner;

public class T5Switch {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Pleas enter country");

       String country=input.nextLine();

        switch (country) {
            case "USA":
                System.out.println("English");
                break;
            case "Morocco" :
                System.out.println("Arabic");
                break;
            case "Poland":
                System.out.println("Polish");
                break;
            case "Spain":
                System.out.println("Spanish");
                break;
            default:
                System.out.println("Wrong country");
                break;
        }




    }
}
