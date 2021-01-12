package bronze3;

import java.util.Scanner;

public class P2441 {
	// 별 찍기 - 4
	// 첫째 줄 별 n개, 둘째 줄 별 n-1개... n번째 줄 별 1개 찍기
	// 오른쪽을 기준으로 정렬한 별 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		sc.close();
		
		for(int i=0; i<=n; i++) {
			for(int j=0; j<i; j++) {
				System.out.print(" ");
			}
			for(int j=n-i; j>0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
