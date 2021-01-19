package bronze3;

import java.util.Scanner;

public class P2446 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		sc.close();
		
		for(int i=0; i<=2*(n-1); i++) {
			if(i<n) {
				for(int j=0; j<i; j++) {
					System.out.print(" ");
				}
				for(int j=i*2; j<=2*(n-1); j++) {
					System.out.print("*");
				}
				System.out.println();
			}else {
				for(int j=i-n; j<n-2; j++) {
					System.out.print(" ");
				}
				for(int j=i-n; j<=3*(i-n)+2; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
	}

}
