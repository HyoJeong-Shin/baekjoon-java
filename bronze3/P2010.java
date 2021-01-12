package bronze3;

import java.util.Scanner;

public class P2010 {
	// 플러그 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();	// 멀티탭의 개수 
		int sum = 0;	// 연결될 수 있는 컴퓨터의 수 
		
		for(int i=0; i<n; i++) {
			int plug = sc.nextInt();	// 각 멀티탭에 꽂을 수 있는 플러그 수 
			if(plug - 1 > 0) sum+=(plug-1);	// 앞선 멀티탭의 플러그에 현재의 멀티탭을 꽂고 남은 플러그 수만큼 더해줌 (= 남은 플러그 수 = 연결될 수 있는 컴퓨터 수) 
		}
		sc.close();
		
		System.out.println(sum+1);	// 맨 마지막 멀티탭에는 뒤에 더 꽂을 멀티탭이 없기에 +1을 해줌 
	}

}
