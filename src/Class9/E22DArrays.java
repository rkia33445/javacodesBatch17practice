package Class9;

public class E22DArrays {
    public static void main(String[] args) {

        String [][] names=
                {       {"hind", "mikhail", "ismail", "ahmed"},
                        {"john", "bob", "adam", "tamim"},
                        {"joke", "laugh", "john ahmed", "mohammed"},
                        {"gui", "backend", "front", "API"}
                };
       String [] row = names[2];
        System.out.println(row[3]);
       // System.out.println(Arrays.toString(firstRaw));
    }
}
