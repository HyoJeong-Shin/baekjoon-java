package 문자열;

import java.util.Scanner;

public class Q10809 {
// 한 단어에서 각 알파벳이 처음 등장하는 위치를 찾는 문제 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		sc.close();
		
		int[] arr = new int[26];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = -1;
		}
		
		for(int i=0; i<s.length(); i++) {
			if(arr[s.charAt(i) - 'a'] == -1)
				arr[s.charAt(i) - 'a'] = i; 
		}
		
		for(int n : arr)
			System.out.printf("%d ",n);
	}

}
