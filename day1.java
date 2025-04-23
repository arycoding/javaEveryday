/******************************************************************************

            Coding in JAVA until I get a girlfriend (bruh)
                                #day 1.
Today's problem : Determine the index of the maximum and minimum values of the elements of a vector.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] v = new int[n+1];

        for(int i = 1; i<=n; i++) {
            v[i] = sc.nextInt();
        }

        int imax = 1;
        int imin = 1;
        for(int i = 2; i<=n; i++){
            if(v[i] < v[imin]) {
                imin = i;
            } else if (v[i] > v[imax]) {
                imax = i;
            }
        }
        System.out.println(imin + " " + imax);
	}
}
