/******************************************************************************

            Coding in JAVA until I get a girlfriend (bruh)
                                #day 5.
Today's problem : Bubble sort
Exemple
Input: 8 9 5 -1 0 12 4


Output: 
-1 0 4 5 8 9 12
*******************************************************************************/
import java.util.*;


public class Main {
    public static void main(String[] args) {
        int[] arr = {8,9,5,-1,0,12,4};

        for(int i = 0; i< arr.length - 1; i++) {
            for(int j = 0; j<arr.length - i - 1; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int numbers : arr) {
            System.out.print(numbers + " ");
        }
    }
}
