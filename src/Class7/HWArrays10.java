package Class7;

public class HWArrays10 {
    public static void main(String[] args) {


        int [] number={5,20,30,40,60,90,120,555,1,9};
        int largestNumber=number[0];
        for(int i=0;i<number.length;i++){
            if(number[i]>largestNumber)
            {
                largestNumber=number[i];
            }
        }
        System.out.println("the largest number:"+ largestNumber);

    }
    }
