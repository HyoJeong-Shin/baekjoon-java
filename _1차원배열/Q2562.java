package _1차원배열;

import java.util.Scanner;

public class Q2562 {
// 최댓값이 어디에 있는지 찾는 문제 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[9];
		
		for(int i=0; i<9; i++)
			arr[i]= sc.nextInt();
		
		int max = arr[0];
		
		for(int i=1; i<9; i++) {
			if(arr[i]>max)
				max = arr[i];
		}
		
		System.out.println(max);
		
		for(int i=0; i<9; i++) {
			if(arr[i] == max)
				System.out.println(i+1);
		}
	}
}
