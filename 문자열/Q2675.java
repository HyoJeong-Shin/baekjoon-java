package 문자열;

import java.util.Scanner;

public class Q2675 {
// 각 문자를 반복하여 출력하는 문제 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		for(int i=0; i<t; i++) {
			int r = sc.nextInt();
			String s = sc.next();
			for(int j=0; j<s.length(); j++) {
				char p = s.charAt(j);
				for(int k=0; k<r; k++) {
					System.out.print(p);
				}
			}
			System.out.println();
		}
		sc.close();
	}
}
