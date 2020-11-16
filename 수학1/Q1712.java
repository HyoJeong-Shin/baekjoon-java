package 수학1;

import java.util.Scanner;

public class Q1712 {
// 이익이 발생하는 지점을 찾는 문제 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		sc.close();
				
		if(b>=c)
			System.out.print(-1);
		else {
			System.out.print(a/(c-b)+1);
		}
	}
}
