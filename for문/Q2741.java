package for문;

import java.util.Scanner;

public class Q2741 {
// 1부터 N까지 한 줄에 하나씩 출력 
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		
		for(int i=1; i<=n; i++)
			System.out.println(i);
	}

}
