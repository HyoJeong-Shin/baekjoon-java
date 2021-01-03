package 수학2;

import java.util.Scanner;

public class P11653 {
	// n을 소인수분해함
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		
		int k = 2;
		
		while(true) {
			if(n==1) break;	// 소인수분해 완료시 반복문 벗어남 
			if(n%k == 0 ) {	// 나눠질 경우,  
				System.out.println(k);	// 출력 
				n = n/k;	// 정수 n 값 재설정 
			}else {	// 더 이상 나눠지지 않을 경우,
				k++;	// 나누는 값 증가 
			}
		}
	}

}
