package Class6;

import java.util.Scanner;

public class E10WhileLoop {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Pleas enter the starting point ");
        int start=scanner.nextInt();
        System.out.println("pleas enter the ending point");
        int end=scanner.nextInt();
        System.out.println("please enter the step");
        int step=scanner.nextInt();

        while (start<=end){

                System.out.print(start+" ");

                start+=step;

        }
    }
}
