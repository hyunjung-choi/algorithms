import java.util.*;

/*
https://www.acmicpc.net/problem/2309
*/

public class BOJ_2309 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> dwarfsHeight= new ArrayList<Integer>();
		int totalSum = 0; // 9명의 합
		int HEIGHT_SUM = 100;
		
		for(int i = 0; i < 9; i++) {
			dwarfsHeight.add(sc.nextInt());
			totalSum += dwarfsHeight.get(i);
		}
		
		for(int i = 0; i < dwarfsHeight.size(); i++) {
			for(int j = i + 1; j < dwarfsHeight.size(); j++) {
				int sum = dwarfsHeight.get(i) + dwarfsHeight.get(j);
				
				if(totalSum - sum == HEIGHT_SUM) {
					Integer iObj = (Integer)dwarfsHeight.get(i);
					Integer jObj = (Integer)dwarfsHeight.get(j);
					dwarfsHeight.remove(iObj);
					dwarfsHeight.remove(jObj);
					break;
				}
			}
		}
		
		Collections.sort(dwarfsHeight);
		
		for(Integer height : dwarfsHeight) {
			System.out.println(height);
		}
	}

}
