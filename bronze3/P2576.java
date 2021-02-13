package bronze3;

import java.util.Scanner;

public class P2576 {
	// 7개의 자연수가 주어질 때, 홀수인 자연수들을 모두 골라 그 합을 구하고, 
	// 고른 홀수들 중 최솟값을 찾는 프로그램
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[7];
		int sum = 0;
		int min = 100;
		
		for(int i=0; i<7; i++) {
			arr[i] = sc.nextInt();
			if(arr[i]%2!=0) {
				sum += arr[i];
				if(arr[i]<min) {
					min = arr[i];
				}
			}
		}
		sc.close();
		
		if(sum==0) 
			System.out.print(-1);
		else {
			System.out.println(sum);
			System.out.println(min);
		}
	}
}
