package Class9;

public class T42DArrays {
    public static void main(String[] args) {

        String [][] cars=
                {       {"Ford", "Chevrolet", "Acura", "Dodge"},
                        {"BMW", "Audi", "Mercedes", "Porsche"},
                        {"Kia", "Hyundai", "Soul", "Sorento"},
                        {"Lamborghini", "Ferrari", "Maserati", "Alfa Romeo"}
                };

       for (String [] row:cars){
          for (String v:row){
              System.out.print(v+" ");
          }
           System.out.println();
       }
        System.out.println("================================");
       for (int i=0; i<cars.length;i++){
           for (int j=0;j< cars.length;j++){
               System.out.print(cars[i][j]+" ");
           }
           System.out.println();
       }
    }
}
