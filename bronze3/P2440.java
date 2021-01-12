package bronze3;

import java.util.Scanner;

public class P2440 {
	// 별 찍기 - 3
	// 첫째 줄 별 n개, 둘째 줄 별 n-1개... n번째 줄 별 1개 찍기
	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
		  
		  int n = sc.nextInt();
		  sc.close();
		  
		  for(int i = 0; i<=n; i++) {
			  for(int j = n-i; j>0; j--) {
				  System.out.print("*");
			  }
			  System.out.println();
		  }
		
	}

}
