package Class8;

public class T6EnhancedLoop {
    public static void main(String[] args) {
     //find the largest even number
          int [] nums={10,23,25,56,45,20};

int smallest=nums[0];
         for (int n:nums) {

             if (n < smallest) {

                 smallest = n;

             }
         }
            System.out.println(smallest);
        }
    }
