package 문자열;

import java.util.Scanner;

public class Q11654 {
// 아스키 코드 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char text = sc.next().charAt(0);
		sc.close();
		
		System.out.print((int)text);
	}

}
