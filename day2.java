import java.util.*;
public class Main
{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] v = new int[n];

        for(int i=0; i<n; i++) {
            v[i] = sc.nextInt();
        }

        Arrays.sort(v);

        System.out.println(v[2] + " " + v[1] + " " + v[0]);
	}
}
