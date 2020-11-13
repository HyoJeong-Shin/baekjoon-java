package while문;

import java.util.Scanner;

public class Q1110 {
// 더하기 사이클 // 원래 수로 돌아올 때까지 연산을 반복하는 문제 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		
		int result = n;
		int cycle = 0;

		while(true) {
			cycle++;
			int add = result/10 + result%10;
			result = (result%10)*10 + (add%10);
			//System.out.println(result);
			if(result==n)
				break;
		}	
		System.out.print(cycle);		
	}
}