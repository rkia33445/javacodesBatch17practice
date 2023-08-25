package Class9;

public class E92DArrays {
    public static void main(String[] args) {

        String [][] names=
                {       {"hind", "mikhail", "ismail", "ahmed"},
                        {"john", "bob", "adam", "tamim"},
                        {"joke", "laugh", "john ahmed", "mohammed"},
                        {"gui", "backend", "front", "API"}
                };

       for (String [] row:names){
          for (String v:row){
              System.out.print(v+" ");
          }
           System.out.println();
       }
    }
}
