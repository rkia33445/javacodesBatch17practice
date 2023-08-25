package review2;

public class E7NestedIf {
    public static void main(String[] args) {

        String day="Saturday";
        double accountBalance=5000;
        if(day.equals("Sunday")) {
            if (accountBalance > 2000) {
                System.out.println("we can buy this");
            } else {
                System.out.println("Its too expensive");

            }
        } else if (day.equals("Saturday")) {
            System.out.println("its saturday lets go dinner");


    }else {
            System.out.println("lets wait for Sunday");
        }
    }
}
