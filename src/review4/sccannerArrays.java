package review4;

import java.util.Scanner;

public class sccannerArrays {
    public static void main(String[] args) {
        int []numbers =new int[5];
        Scanner input=new Scanner(System.in);



        for(int i=0 ;i<numbers.length;i++){
            numbers[i]=input.nextInt();

        }
        for(int i=0 ;i<numbers.length;i++){
            System.out.println(numbers[i]+" ");
        }


        for(int i=numbers.length-1 ;i>=0;i--){
            System.out.println(numbers[i]+" ");


        }
    }
}

