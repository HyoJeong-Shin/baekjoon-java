package _1차원배열;

import java.util.Scanner;

public class Q4344 {
// 평균은 넘겠지 
// 각 케이스마다 한 줄씩 평균을 넘는 학생들의 비율을 반올림하여 소수점 셋째 자리까지 출력함 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		
		for(int i=0; i<c; i++) {
			int n = sc.nextInt();
			
			float sum = 0;
			int[] arr = new int[n];
			
			for(int j=0; j<n; j++) {
				int score = sc.nextInt();
				arr[j] = score;
				sum += score;
			}
			
			float avg = sum/n;
			float over = 0;
			
			for(int j=0; j<n; j++) {
				if(arr[j]>avg) {
					over++;
				}
			}
			
			System.out.printf("%.03f%%\n", over/n*100);
		}
	}
}
