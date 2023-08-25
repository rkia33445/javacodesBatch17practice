package Class10;

public class PhoneTester {
    public static void main(String[] args) {
        Phone iphoneObj=new Phone();
        iphoneObj.make="Apple";
        iphoneObj.model="Iphone 14";
        iphoneObj.price=999;
        iphoneObj.os="IOS 17";

        Phone pixelObj=new Phone();
        pixelObj.make="Google";
        pixelObj.model="Pixel 7";
        pixelObj.price=699;
        pixelObj.sendText();
        pixelObj.call();

        Phone samsungObj=new Phone();
        samsungObj.model="S23 ultra";
        samsungObj.make="samsung";
        samsungObj.os="Android 13";
        samsungObj.price=1199;
        samsungObj.sendText();
        samsungObj.call();
    }
}