package for문;

import java.util.Scanner;

public class Q2742 {
// N부터 1까지 한 줄에 하나씩 출력 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		
		for(int i=n; i>0; i--)
			System.out.println(i);
	}
}
