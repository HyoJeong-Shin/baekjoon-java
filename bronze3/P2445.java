package bronze3;

import java.util.Scanner;

public class P2445 {
	// 첫째 줄부터 2×N-1번째 줄까지 차례대로 별을 출력
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		sc.close();
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<i+1; j++) {
				System.out.print("*");
			}
			
			for(int j=i; j<(n-1); j++) {
				System.out.print(" ");
			}
			
			for(int j=i; j<(n-1); j++) {
				System.out.print(" ");
			}
			
			for(int j=0; j<i+1; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		for(int i=0; i<n; i++) {
			for(int j=n-1; j>i; j--) {
				System.out.print("*");
			}
			
			for(int j=0; j<i+1; j++) {
				System.out.print(" ");
			}
			
			for(int j=0; j<i+1; j++) {
				System.out.print(" ");
			}
			
			for(int j=n-1; j>i; j--) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}

}
