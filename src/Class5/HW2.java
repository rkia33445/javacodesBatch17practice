package Class5;

import java.util.Scanner;

public class HW2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Pleas enter quiz score");
        double quizScores=input.nextDouble();
        System.out.println("pleas enter midterm score");
        double midtermScores=input.nextDouble();
        System.out.println("pleas enter final score");
        double finalScores=input.nextDouble();
        double averageScore=(quizScores+midtermScores+finalScores)/3;
        if(averageScore>=90){
            System.out.println("grade A");
        } else if (averageScore>=70 && averageScore<90) {
            System.out.println("grade B");

        } else if (averageScore>=50 && averageScore<70 ) {
            System.out.println("grade C");

        } else if (averageScore<50) {
            System.out.println("grade F");

        }
    }
}
