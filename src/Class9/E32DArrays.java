package Class9;

public class E32DArrays {
    public static void main(String[] args) {



        int [][] numbers= {
                {10,20,30,40},
                {100,200,303},
                {100,200,303,400}};
        int [] row=numbers[0];// this returns us a complete 1D array
        int number=numbers[0][1];//this return us one single element
        System.out.println(numbers[0][1]);
    }
}
