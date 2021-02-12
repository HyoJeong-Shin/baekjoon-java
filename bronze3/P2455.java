package bronze3;

import java.util.Scanner;

public class P2455 {
	// 지능형 기차
	// 4개의 역에 대해 기차에서 내린 사람과 탄 사람 수가 주어졌을 때,
	// 기차에 사람이 가장 많을 때의 사람 수 계산 
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		int max = 0;
		
		for(int i=0; i<4; i++) {
			int a = sc.nextInt();	// 내린 사람 수 
			int b = sc.nextInt();	// 탄 사람 수 
			
			sum += (-a+b);
			
			if(sum>max) max = sum;
		}
		sc.close();
		
		System.out.print(max);
	}

}
