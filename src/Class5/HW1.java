package Class5;

import java.util.Scanner;

public class HW1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Pleas enter the current time ");
        int hour=input.nextInt();
        if(hour>=1 && hour<=11){
            System.out.println("Morning");
        } else if (hour>=12 && hour<=15) {
            System.out.println("Afternoon");

        } else if (hour>=16 && hour<=20 ) {
            System.out.println("Evening");

        } else if (hour>=21 && hour<=24) {
            System.out.println("Night");

        }
    }
}
