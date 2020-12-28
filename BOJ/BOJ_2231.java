import java.util.Scanner;

/*
 * https://www.acmicpc.net/problem/2231
 */

public class BOJ_2231 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int digit = 0;
		int num = n;
		int ans = 0;
		
		// n의 자리수를 구한다.
		while(num != 0) {
			num /= 10;
			digit++;
		}
				
		for(int i = n - (digit * 9); i < n; i++) {
			int constructor = i;	// 생성자
			int digit_sum = 0;		// 각 자리수의 합
			
			while(constructor != 0) {
				digit_sum += constructor % 10;
				constructor /= 10;
			}
			
			if(n == i + digit_sum) {
				ans = i;
				break;
			}
		}
		
		System.out.println(ans);
	}

}
