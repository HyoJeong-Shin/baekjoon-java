package bronze3;

import java.util.Scanner;

public class P2443 {
	// 첫째 줄 별 2*n-1개, 둘째 줄 별 2*n-3개, ..., n번째 별 1개 찍는 문제
	// 별은 가운데 기준으로 대칭 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		sc.close();
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<i; j++) {
				System.out.print(" ");
			}
			for(int j=i; j<n; j++) {
				System.out.print("*");
			}
			for(int j=i; j<n-1; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
}
