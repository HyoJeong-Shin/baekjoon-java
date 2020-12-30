package 수학2;

import java.util.Scanner;

public class P1978 {
	// 소수 찾기 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;	// 소수 개수 저장  
		
		// 나누어 떨어지는 수가 있는지 판별하여 소수 찾음 
		for(int i=0; i<n; i++) {
			int k = sc.nextInt();
			for(int j=1; j<k; j++) {
				if(j!=1 && k%j == 0) {	// 1은 모든 수에서 나누어 떨어지므로 1이 아니고, 나누어 떨어질 때 반복문 벗어남 
					break;
				}
				if(j==k-1) {	// 입력숫자-1 까지 나누어 떨어지면 소수로 판정 
					count++;
				}
			}
		}
		sc.close();
		
		System.out.print(count);
	}

}
