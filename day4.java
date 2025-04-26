/******************************************************************************

            Coding in JAVA until I get a girlfriend (bruh)
                                #day 4.
Today's problem : Two natural numbers a and b are read. Display the first b non-zero multiples of the number a in ascending order.
Exemple
Input:
3  6

Output: 
3 6 9 12 15 18
*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        for(int i = 1; i <= b; i++) {
            System.out.print(a*i);
            if ( i < b) {
                System.out.print(" ");
            }
        }
    }
}
