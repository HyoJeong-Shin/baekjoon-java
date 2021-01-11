package bronze3;

import java.util.Scanner;

public class P1864 {
	// 문어 숫자 (문어의 수 체계, 8진법 기반, 각 문자에 대응하는 수 존재, 음수(-1) 나타내는 수 존재) 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char[] arr = {'/', '-', '\\', '(', '@', '?', '>', '&', '%'};	// 각 기호에 대응하는 숫자 배열을 이용해서 나타냄 
		
		
		while(true) {
			String oct = sc.next();		// 문어 숫자 입력 받음 

			if(oct.equals("#")) break;	// #이 들어오면 입력 종료 
			
			int sum = 0, length = 0, num = 0;
			
			for(int i=0; i<oct.length(); i++) {	// 입력 받은 숫자 길이만큼 반복 (각 자릿수에 대해 계산 해주기 위해) 
				for(int j=0; j<arr.length; j++) {	// 배열의 길이만큼 반복문 돌음 
					if(oct.charAt(i)==arr[j]) {	// 입력 받은 숫자와 동일한 문자 존재시 
						num = j - 1;	// 해당 인덱스 - 1 값을 변수에 저장 (인덱스는 0부터 시작이라 -1을 시작하는 수를 표현하기 위해서는 인덱스 - 1을 해줘야 함)
					}
				}
				
				length = oct.length() - i - 1;	// 각 자릿수 계산  ex) 8진법 ( 8^2, 8^1, 8^0 와 같은 자릿 수) 
				sum += num * Math.pow(8, length);	// 각 기호와 대응하는 숫자와 자릿수를 곱해주어 십진수로 나타냄 
			}
			
			System.out.println(sum);	// 계산한 십진수 출력 
		}
		
		sc.close();
		
	}

}
