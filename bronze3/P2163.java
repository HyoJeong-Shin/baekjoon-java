package bronze3;

import java.util.Scanner;

public class P2163 {
	// 초콜릿 자르기
	// n*m크기 초콜릿을 1×1 크기의 초콜릿으로 쪼개기 위한 최소 쪼개기 횟수를 구하는 프로그램
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		sc.close();
		
		System.out.print((n-1)+n*(m-1));
	}

}
