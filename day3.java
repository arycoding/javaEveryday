/******************************************************************************

            Coding in JAVA until I get a girlfriend (bruh)
                                #day 3.
Today's problem : Sum of two 2D arrays.
Exemple
Input:
2 3 (rows, cols)
1 2 3 (first array)
4 5 6

7 8 9 (second array)
10 11 12
Output: 
8 10 12 
14 16 18
*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] arr1 = new int[rows][cols];
        int[][] arr2 = new int[rows][cols];
        int[][] sum = new int[rows][cols];

        for(int i = 0; i<rows; i++) {
            for(int j = 0; j<cols; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i<rows; i++) {
            for(int j = 0; j<cols; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i<rows; i++) {
            for(int j = 0; j<cols; j++) {
                sum[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        for(int i = 0; i<rows; i++) {
            for(int j = 0; j<cols; j++) {
                System.out.print(sum[i][j] + " ");
            }
        System.out.println();
        }
    }
}
