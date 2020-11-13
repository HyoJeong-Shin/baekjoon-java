package _1차원배열;

import java.util.Scanner;

public class Q2577 {
// 각 숫자가 몇 번 나왔는지 저장하기 위해 일차원 배열을 만드는 문제 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		sc.close();
						
		int[] arr = new int[10];
		String len = String.valueOf(a*b*c);
		
		for(int i=0; i<10; i++) {
			int mul = a*b*c;
			for(int j=0; j<len.length(); j++) {
				int result = mul%10;
				if(result == i) {
					arr[i] +=1;
				}
				mul = mul/10;
			}
			System.out.println(arr[i]);
		}
	}

}
