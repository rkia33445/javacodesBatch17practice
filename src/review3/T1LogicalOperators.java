package review3;

import java.util.Scanner;

public class T1LogicalOperators {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your first boolean value true/false");
        boolean var1=input.nextBoolean();
        System.out.println("Please enter your second boolean value true/false");
        boolean var2=input.nextBoolean();

        if(var1&&var2){
            System.out.println("Both values are true");
        }else {
            System.out.println("Both values are not true");
        }


    }
}
