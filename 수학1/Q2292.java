package 수학1;

import java.util.Scanner;

public class Q2292 {
// 벌집이 형성되는 규칙에 따라 벌집의 위치를 구하는 문제 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		
		int first = 1;
		int plus = 6;
		int room = 1;
		
		if (n==1) {
			System.out.print(1);
		}else {
			while(true) {
				first = first + plus;
				room += 1;
				if(n<=first) {
					System.out.print(room);
					break;
				}
				plus += 6;
			}
		}
	}
}
