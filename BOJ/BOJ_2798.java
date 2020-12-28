import java.util.Scanner;

/*
 * https://www.acmicpc.net/problem/2798
 */

public class BOJ_2798 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] cards = new int[n];
		int max = 0;
		
		for(int i = 0; i < n; i++) {
			cards[i] = sc.nextInt();
		}
		
		for(int x = 0; x < n - 2; x++) {
			for(int y = x + 1; y < n - 1; y++) {
				for(int z = y + 1; z < n; z++) {
					int sum = cards[x] + cards[y] + cards[z];
					
					if(max < sum && sum <= m) max = sum;		
				}
			}
		}
		
		System.out.println(max);
	}
}
