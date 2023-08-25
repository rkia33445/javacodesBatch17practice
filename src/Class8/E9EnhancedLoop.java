package Class8;

import java.util.Scanner;

public class E9EnhancedLoop {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        double total=0;
        while (true){
            System.out.println("Please Enter the price of the item ");
            double price=input.nextDouble();
            if (price==-1){
                break;
            }else {
                total = total + price;
            }
            System.out.println("Your total bill is "+total);
        }

      }


        }

