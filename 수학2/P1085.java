package 수학2;

import java.util.Arrays;
import java.util.Scanner;


public class P1085{
	// 직사각형과 점의 거리를 구하는 문제 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int w = sc.nextInt();
		int h = sc.nextInt();
		
		sc.close();
		
		int[] arr = new int[3];
		arr[0] = x;
		arr[1] = y;
		arr[2] = w-x;
		arr[3] = h-y;
		
		Arrays.sort(arr);
		
		System.out.print(arr[0]);
	}

}