package 수학1;

import java.util.Scanner;

public class Q2775 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		int[][] arr = new int[14][14];
		
		for(int i=0; i<14; i++) {
			arr[0][i] = i+1;
		}
		
		for(int i=1; i<14; i++) {
			for(int j=0; j<14; j++) {
				arr[i][j] += 1;
			}
		}
		
		for(int i=0; i<t; i++) {
			int k = sc.nextInt();
			int n = sc.nextInt();
			
		}
	}

}
