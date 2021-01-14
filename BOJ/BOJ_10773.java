import java.util.*;

/*
 * https://www.acmicpc.net/problem/10773
 */

public class BOJ_10773 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Integer> s = new Stack<>();
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			int x = sc.nextInt();
			if(x == 0) s.pop();
			else s.push(x);
		}
		
		if(s.empty()) System.out.println(0);
		else {
			int sum = 0;
			while(!s.empty()) {
				sum += s.peek();
				s.pop();
			}
			System.out.println(sum);
		}
	}

}
