package 문자열;

import java.util.Scanner;

public class Q2908 {
// 숫자를 뒤집어서 비교하는 문제 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] n1 = sc.next().split("");
		String[] n2 = sc.next().split("");
		sc.close();
		
		String res1 ="";
		String res2 ="";
		
		for(int i=0; i<n1.length; i++) {
			res1 += n1[(n1.length-1)-i];
		}
		
		for(int i=0; i<n2.length; i++) {
			res2 += n2[(n2.length-1)-i];
		}
		
		if(Integer.parseInt(res1)>Integer.parseInt(res2))
			System.out.print(res1);
		else
			System.out.print(res2);
		
		
	}

}
