package bronze3;

import java.util.Scanner;

public class P1009 {
	// 분산처리 	// a^b데이터 1~10번 컴퓨터 번갈아가며 처리
	// 마지막 데이터가 처리될 컴퓨터의 번호?
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		for(int i=0; i<t; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			if(a>=10) {		// 10이상의 수일 경우, 나누어 일의 자리 수로 계산 
				if(a%10==0)	
					System.out.println(10);
				else
					a=a%10;
			}
			
			if(a==1||a==5||a==6)
				System.out.println(a);
			
			if(a==4||a==9) {
				if(b%2 == 0)
					System.out.println(a*a%10);
				else
					System.out.println(a);
			}
			
			if(a==2||a==3||a==7||a==8) {
				if(b%4 == 0) 
					System.out.println((int)Math.pow(a, 4) % 10);
				else
					System.out.println((int)Math.pow(a, (b%4)) % 10);
			}		
		}
		sc.close();
	}

}
