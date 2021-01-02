package 수학2;

import java.util.Scanner;

public class P1929 {
	// 에라토스테네스의 체로 소수 구하기 
	// 2~n까지의 배수들을 모두 걸러 소수를 구하는 방법  
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		sc.close();
		
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
		
		for(int i=m; i<=n; i++) {	// 주어진 범위에서 
			if(arr[i] == true) {	// 소수 출력 
				System.out.println(i);	
			}
		}
	}

}
