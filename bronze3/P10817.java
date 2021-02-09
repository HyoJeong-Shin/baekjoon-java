package bronze3;

import java.util.Arrays;
import java.util.Scanner;

public class P10817 {
	// 두 번째로 큰 수 출력 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[3];
				
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
			
		}
		sc.close();
		
		Arrays.sort(arr);
		
		System.out.print(arr[1]);

	}

}
