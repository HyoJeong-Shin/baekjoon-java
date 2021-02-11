package bronze3;

import java.util.Scanner;

public class P2875 {
	// 대회 or 인턴 
	// 여2, 남1이서 한 팀. 이 중 k명은 반드시 인턴쉽 참여. 
	// 인턴쉽 참여시 대회 참가 불가능. 대회에 참가할 수 있는 최대팀 수 구하기!
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();	// 여성 인원 
		int m = sc.nextInt();	// 남성 인원 
		int k = sc.nextInt();	// 인턴쉽 참여 인원 
		
		sc.close();
		
		for(int i=0; i<k; i++) {
			if((n/2)<m) {
				m--;
			}else {
				n--;
			}
		}
		
		if((n/2)>m)	System.out.print(m);
		else	System.out.print(n/2);
	}

}
