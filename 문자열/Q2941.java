package 문자열;

import java.util.Scanner;

public class Q2941 {
// 크로아티아 알파벳의 개수를 세는 문제 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String text = sc.next();
		sc.close();
		
		String[] arr = {"c=","c-","dz=","d-","lj","nj","s=","z="};
				
		for(int i=0; i<arr.length; i++) {
			if(text.contains(arr[i])){
				text = text.replaceAll(arr[i], "&");
			}
		}
		
		System.out.print(text.length());
	}
}
