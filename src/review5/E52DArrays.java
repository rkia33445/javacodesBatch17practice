package review5;

public class E52DArrays {
    public static void main(String[] args) {
      String[][] countries ={
                            {"Canada","USA"},//0
                            {"Ecuador","Brazil","Chile","Argentina"},//1
                            {"Romania","France","Italy"}//2
      };
        System.out.println(countries.length); //3 - number of array

        for (String[]countryArray:countries){// outer loop iterates over 1D arrays
            for (String country:countryArray){// inner loop iterates over each element INSIDE THAT 1D ARRAY
                System.out.println(country);
            }

        }
    }
}

