package if문;

import java.util.Scanner;

public class Q2753 {
// 윤년 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		sc.close();
		
		if((year%4==0&&year%100!=0)||(year%400==0))
			System.out.print(1);
		else
			System.out.print(0);
		
	}

}
