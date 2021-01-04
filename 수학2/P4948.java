package 수학2;

import java.util.Scanner;

public class P4948 {
	// 베르트랑 공준 (에라토스테네스의 체 소수 구하기 사용)
	// 임의의 자연수 n에 대하여 n보다 크고 2n보다 작거나 같은 소수는 적어도 하나 존재함 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int n = sc.nextInt();
			if(n==0) break;	// 입력의 마지막에는 0이 주어짐 
			int count=0;	// 소수 개수 초기화 
			
			boolean[] arr = new boolean[2*n+1];	// 입력값만큼 소수판정 해 줄 배열 생성  
			
			arr[0] = arr[1] = false;	// 0과 1은 소수가 아니므로 false 설정 
			
			for(int i=2; i<=2*n; i++) {	// 2부터 배열 모두 true(소수) 설정 
				arr[i] = true;
			}
			
			for(int i=2; i<=2*n; i++) {	// 2부터 n까지 
				for(int j=i+i; j<=2*n; j=j+i) {	// i의 배수가 되는 값들 모두 소수 설정 해제 
					arr[j] = false;
				}
			}
			
			for(int i=n+1; i<=2*n; i++) {	// 주어진 범위에서 (n보다 크고 2n보다 작거나 같은)  
				if(arr[i] == true) {	// 소수이면,
					count++;			// 소수 개수 증가 
				}
			}
			System.out.println(count);	// 소수의 개수 출력 
		}
		
		sc.close();	
	}
}
