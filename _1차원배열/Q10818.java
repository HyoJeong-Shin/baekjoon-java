package _1차원배열;

import java.util.Arrays;
import java.util.Scanner;

public class Q10818 {
// 최솟값과 최댓값을 찾는 문제 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		
		Arrays.sort(arr);	// 오름차순 정렬 
		
		System.out.print(arr[0]+" "+arr[n-1]);
		
	}

}
