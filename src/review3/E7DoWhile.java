package review3;

import java.util.Scanner;

public class E7DoWhile {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int x=0;
        int sum=0;

        do{
            System.out.println("Please enter the number or -1 to terminate");
            x=input.nextInt();
            if(x!=-1){
            sum=sum+x;}
            System.out.println("your total bill is "+sum);
        }while (x!=-1);
    }
}
