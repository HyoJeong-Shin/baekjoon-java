package 수학1;

import java.util.Scanner;

public class Q1011 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		int[] arr = new int[t];
		
		for(int i=0; i<t; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			arr[i] = y-x;
		}
		sc.close();
		
		for(int number : arr) {
			int n = (int) Math.sqrt(number);
			int m = n+1;
			if (n == 1)
		        System.out.println(number);
			else if(number >= n*m + 1)
		        System.out.println(n+m);
			else if(number >= Math.pow(n, 2) + 1)
		        System.out.println(n*2);
		    else
		        System.out.println(n*2-1);
		}
	}

}
