package review5;

public class E42DArrays {
    public static void main(String[] args) {
        int [][] array=new int[2][4];
        //1 row
        array[0][0]=12;
        array[0][1]=13;
        array[0][2]=14;
        array[0][3]=15;
        // 2row
        array[1][0]=1;
        array[1][1]=2;
        array[1][2]=3;
        array[1][3]=4;
        System.out.println(array[0][3]);
        // how to get all the element from the 2D array?
        //array.length in 2D array?
        // array[row].length in 2D array returns number of colum from that row
        for (int row=0;row< array.length;row++){//outer loop iterates over
            for (int col=0; col< array[row].length;col++){//inner loop iterates over the columns
                System.out.println(array[row][col]);
            }
        }
    }
}

