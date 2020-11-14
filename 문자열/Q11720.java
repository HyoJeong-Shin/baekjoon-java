package 문자열;

import java.util.Scanner;

public class Q11720 {
// 숫자의 합 // 정수를 문자열로 입력받는 문제 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String text = sc.next();
		sc.close();
		
		int sum = 0;
		
		for(int i=0; i<n; i++) {
			sum += text.charAt(i)-'0';
		}
		
		System.out.print(sum);	
	}
}

// char -> int로 형변환 : 각 숫자의 아스키코드는 0을 의미하는 48을 빼주면 자신의 수를 가지게 됨 