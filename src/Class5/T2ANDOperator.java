package Class5;

import java.util.Scanner;

public class T2ANDOperator {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("enter person heights");
        double height=input.nextDouble();
        if(height<60){
            System.out.println("short");
        } else if (height>=60 && height<=72) {
            System.out.println("medium");

        } else if (height>72) {
            System.out.println("tall");
        }


    }
}
