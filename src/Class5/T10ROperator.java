package Class5;

import java.util.Scanner;

public class T10ROperator {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Please enter birth month");
        String month=input.nextLine();
        if(     month.equalsIgnoreCase("March")||
                month.equalsIgnoreCase("April")||
                month.equalsIgnoreCase("May")){
            System.out.println("Spring");
        }else if(month.equalsIgnoreCase("Jun")||
                month.equalsIgnoreCase("Jul")||
                month.equalsIgnoreCase("Aug")){
            System.out.println("Summer");
        }



    }
}
