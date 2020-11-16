package 문자열;

import java.util.Scanner;

public class Q5622 {
// 규칙에 따라 문자에 대응하는 수를 출력하는 문제 // 다이얼 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.next();
		sc.close();
		
		int sum = 0;
		
		for(int i=0; i<word.length(); i++) {
			int count = 2;
			char ch = word.charAt(i);
			
			for(char j='A'; j<='M'; j+=3) {	// 3간격으로 묶여있는 곳 
				count++;
				if(j<=ch&&ch<=j+2)
					sum += count;
			}
			
			if('P'<=ch&&ch<='S') {	// 4간격으로 묶여있음 
				count=8;
				sum+=count;
			} else if('T'<=ch&&ch<='V') {	// 3간격으로 묶여있음 
				count=9;
				sum+=count;
			} else if('W'<=ch&&ch<='Z'){	// 4간격으로 묶여있음 
				count=10;
				sum+=count;
			}
		}
		
		System.out.print(sum);
	}
}
