package if문;

import java.util.Scanner;

public class Q1330 {
// 두 수 비교하기 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		
		if(a>b)
			System.out.print(">");
		else if(a<b)
			System.out.print("<");
		else
			System.out.print("==");
	}

}
