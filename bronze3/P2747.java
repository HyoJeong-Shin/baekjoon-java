package bronze3;

import java.util.Scanner;

public class P2747 {

	public static void main(String[] args) {
		// 피보나치 수
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		sc.close();
		
		int a1 = 0;
		int a2 = 1;
		int sum = 0;
		
		for(int i=2; i<=n; i++) {
			sum = a1 + a2;
			if(a1<=a2)
				a1 = sum;
			else
				a2 = sum;
		}
		
		if(n==0)	
			System.out.print(0);
		else if(n==1)	
			System.out.print(1);
		else 
			System.out.print(sum);
	}

}
