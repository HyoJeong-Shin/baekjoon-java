package _1차원배열;

import java.util.Scanner;

public class Q1546 {
// 평균을 조작하는 문제 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		float[] score = new float[n];
		float m =0;
		
		for(int i=0; i<n; i++) {
			score[i] = sc.nextInt();
			if(m<score[i]) {
				m = score[i];
			}
		}
		
		float sum = 0;
		for(int i=0; i<n; i++) {
			score[i] = score[i]/m*100;
			sum += score[i];
		}
		
		System.out.print(sum/n);
	}

}
