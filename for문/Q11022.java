package for문;

import java.util.Scanner;

public class Q11022 {
// Case #x: A + B = C 형식 출력 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		for(int i=1; i<=t; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println("Case #"+i+": "+a +" + "+b+" = "+(a+b));
		}
		sc.close();
	}

}
