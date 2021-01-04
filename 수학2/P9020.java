package 수학2;

import java.util.Scanner;

public class P9020 {
	// 골드바흐의 추측	(에라토스테네스의 체 소수 구하기 사용)
	// 2보다 큰 모든 짝수는 두 소수의 합으로 나타내기  (두 소수의 차이가 가장 작은 경우로 나타냄)
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		for(int k=0; k<t; k++) {
			int n = sc.nextInt();
			int min = 10000;
			int x1 = 0, x2 = 0;
			
			boolean[] arr = new boolean[n+1];	// 입력값만큼 소수판정 해 줄 배열 생성  
			
			arr[0] = arr[1] = false;	// 0과 1은 소수가 아니므로 false 설정 
			
			for(int i=2; i<=n; i++) {	// 2부터 배열 모두 true(소수) 설정 
				arr[i] = true;
			}
			
			
			for(int i=2; i<=n; i++) {	// 2부터 n까지 
				for(int j=i+i; j<=n; j=j+i) {	// i의 배수가 되는 값들 모두 소수 설정 해제 
					arr[j] = false;
				}
			}
			
			for(int i=1; i<=n/2; i++) {	// 주어진 범위에서 
				if(arr[i] == true) {	// 소수일 때,  
					if(arr[n-i] == true) {	// 소수의 합일 때, 
						if((n-i)-i < min) {	// 두 소수의 차이가 가장 작은 경우, 
							min = (n-i)-i;	// 최솟값 바꿔주고,
							x1 = i;			//  두 소수의 합에 해당하는 수들 바꿔줌 
							x2 = n-i;
						}
					}	
				}
			}
			System.out.println(x1 + " "+ x2);	// 소수의 합 작은 것부터 먼저 출력 
		}
		
		sc.close();
	}

}
