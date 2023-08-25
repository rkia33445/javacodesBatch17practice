package Class7;

public class T8Arrays {
    public static void main(String[] args) {

     int [] prices={20,10,50,30,40};
        int sum=0;
        for(int i=0;i< prices.length;i++){
            sum=sum+ prices[i];
        }
        System.out.println(sum);
    }
}
