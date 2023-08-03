package Class4;

import java.util.Scanner;

public class E4Scanner {
    public static void main(String[] args) {
        System.out.println("Please Enter your name");
        // creating the object of the scanner class so that we can reuse the logic

        Scanner input=new Scanner(System.in);
        String name=input.next();
       if(name.equals("Rkia")){
           System.out.println("Java instructor");
       }else {
           System.out.println(" I don't know you");
       }
        //System.out.println("Hell "+name);



    }
}
