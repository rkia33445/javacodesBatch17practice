package Class7;

public class HWArrays7 {
    public static void main(String[] args) {

     int [] prices={17,10,56,300,40};
        int sum=0;
        for(int i=0;i< prices.length;i++){
            sum=sum+ prices[i];
        }
        System.out.println(sum);
    }
}
