package if문;

import java.util.Scanner;
// 알람시계 45분 빨리 설정 
public class Q2884 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int m = sc.nextInt();
		sc.close();
		
		if(h==0&&m<45)
			System.out.printf("%d %d", h+23, m+60-45);
		else if(m<45)
			System.out.printf("%d %d", h-1, m+60-45);
		else
			System.out.printf("%d %d", h, m-45);
	}

}
