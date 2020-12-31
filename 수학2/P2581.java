package 수학2;

import java.util.Scanner;

public class P2581 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int sum = 0;
		int min = 10000;	// m,n은 10000이하의 자연수라고 주어짐 
		
		// 나누어 떨어지는 수가 있는지 판별하여 소수 찾음 
		for(int i=m; i<=n; i++) {
			for(int j=1; j<i; j++) {
				if(j!=1 && i%j == 0) {	// 1은 모든 수에서 나누어 떨어지므로 1이 아니고, 나누어 떨어질 때 반복문 벗어남 
					break;
				}
				if(j==i-1) {	// 입력숫자-1 까지 나누어 떨어지면 소수로 판정 
					sum += i;	// 소수의 합 
					if(min>i) {	// 최솟값 찾음 
						min = i;
					}
				}
			}
		}
		sc.close();
		
		if(sum==0) {	// 소수가 없을 경우 
			System.out.print(-1);
		}else {
			System.out.println(sum);
			System.out.println(min);
		}

	}

}
