package _1차원배열;

import java.util.Scanner;

public class Q8958 {
// OX퀴즈의 결과를 일차원 배열로 입력받아 점수를 계산하는 문제 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();		
		
		for(int i=0; i<n; i++) {
			int score = 0, bonus = 0;
			String test = sc.next();
			
			for(int j=0; j<test.length(); j++) {
				if (test.charAt(j)=='O') {
					bonus++;
					score += bonus;
				}else {
					bonus = 0;
				}
			}
			
			System.out.println(score);
				
		}
		sc.close();
	}
}
