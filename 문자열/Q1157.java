package 문자열;

import java.util.Scanner;

public class Q1157 {
// 주어진 단어에서 가장 많이 사용된 알파벳을 출력하는 문제 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.next().toUpperCase();
		sc.close();
		
		int[] arr = new int[26];

		for(int i=0; i<word.length(); i++) {
			arr[word.charAt(i) - 'A']++;
		}
		
		int max = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>= max)
				max = arr[i];
		}
		
		int sum = 0;
		int index = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==max) {
				sum++;
				index = i;
			}
			
		}
		
		if(sum > 1)
			System.out.print('?');
		else
			System.out.print((char)(index+'A'));
		}

}
