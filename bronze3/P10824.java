package bronze3;

import java.util.Scanner;

public class P10824 {
	// 네 수
	// A와 B를 붙인 수와 C와 D를 붙인 수의 합 구하기 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		
		sc.close();
		
		String ab = String.valueOf(a) + String.valueOf(b);
		String cd = String.valueOf(c) + String.valueOf(d);
		
		System.out.print(Long.valueOf(ab)+Long.valueOf(cd));
	}

}
