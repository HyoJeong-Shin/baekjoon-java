package bronze3;

import java.util.Scanner;

public class P2523 {
	// 별찍기 - 13
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		sc.close();
		
		for(int i=1; i<2*n; i++) {
			if(i>n) {
				for(int j=0; j<n-(i-n); j++) {
					System.out.print("*");
				}
			}else {
				for(int j=0; j<i; j++) {
					System.out.print("*");
				}
			}
			
			System.out.println();
		}
	}

}
