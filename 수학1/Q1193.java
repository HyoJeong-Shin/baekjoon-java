package 수학1;

import java.util.Scanner;

public class Q1193 {
// 분수 찾기  // 분수의 순서에서 규칙을 찾는 문제 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		sc.close();
		
		int count = 0;
		int plus = 1;
		int m = 1, n = 1;
		
		while(true) {
			count += plus;
			if(x <= count) {
				int y = count - x;
				if(plus%2 == 0) {
					System.out.printf("%d/%d", m + (plus-1) - y,n + y);
					break;
				}else {
					System.out.printf("%d/%d", m + y,n + (plus -1) - y);
					break;
				}
			}
			plus += 1;
		}
	}

}
