package bronze3;

import java.util.Scanner;

public class P2438 {
	// 별 찍기 - 1	// n번째 줄 별 n개 찍기
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); 
		sc.close();
		
		for(int i=1; i<=n; i++) {
			for(int j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
