package for문;

import java.util.Scanner;

public class Q2739 {
// 구구단 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		
		for(int i=1; i<10; i++)
			System.out.printf("%d * %d = %d\n", n, i, n*i);
	}

}
