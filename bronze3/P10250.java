package bronze3;

import java.util.Scanner;

public class P10250 {

	public static void main(String[] args) {
		// ACM 호텔
		// N번째로 도착한 손님에게 배정될 방 번호 계산
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for(int i=0; i<t; i++) {
			int h = sc.nextInt();
			int w = sc.nextInt();
			int n = sc.nextInt();
			
			if(n%h==0)	
				System.out.println(h*100+(n/h));
			else	
				System.out.println((n%h)*100+(n/h+1));
		}
		sc.close();	
	}
}
