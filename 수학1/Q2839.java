package 수학1;

import java.util.Scanner;

public class Q2839 {
// 5와 3을 최소 횟수로 합하여 N을 만드는 문제 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		
		int box = 0;
		
		while(true) {
			if(n%5==0) {
				box = box + n/5;
				System.out.print(box);
				break;
			}
			
			n = n - 3;
			box += 1;
			
			if(n<0) {
				System.out.print(-1);
				break;
			}
		}
	}
}