package while문;

import java.util.Scanner;

public class Q10951 {
// 입력이 끝날 때까지 a+b 출력 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()) {	// 입력이 존재하는 동안 반복문 실행 
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println(a+b);
		}
		
	}

}
