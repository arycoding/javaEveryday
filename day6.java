/******************************************************************************

            Coding in JAVA until I get a girlfriend (bruh)
                                #day 6.
Today's problem : Selection Sort
Exemple
Input: 5, 2, 9, 1, 7


Output: 1 2 5 7 9

*******************************************************************************/
import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] arr = {5,2,9,1,7};
        int n = arr.length;

        for(int i = 0; i < n-1; i++) {
            int minIndex = i;

            for(int j = i +1; j< n; j++){
                if(arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }

        for(int nums : arr) {
            System.out.print(nums + " ");
        }
    }
}
