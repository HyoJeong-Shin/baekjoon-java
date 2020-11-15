package 문자열;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Q1152 {
// 단어의 개수를 구하는 문제 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine();
		sc.close();
		
		StringTokenizer st = new StringTokenizer(text);
		
		System.out.print(st.countTokens());
				
	} 
}


// split()과  StringTokenizer 클래스 차이 
// split() : 구분자와 구분자 사이에 아무 데이터가 없어도 하나의 요소로 인정함 (공백 요소 인정)
// StringTokenizer 클래스 : 구분자와 구분자 사이에 아무 데이터가 없으면 하나의 요소로 인정 X
//	Token : 공백이 없는 연속된 문자의 집합 (단어 -> 공백문자 포함X)