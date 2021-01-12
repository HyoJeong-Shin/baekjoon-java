package bronze3;

import java.util.Scanner;

public class P2439 {
	// 별 찍기 - 2	// n번째 줄에 별 n개 찍기 
	// 오른쪽을 기준으로 정렬한 별 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		sc.close();
		
		for(int i=1; i<=n; i++) {
			for(int j=n-i; j>0; j--) {
				System.out.print(" ");
			}
			for(int j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
