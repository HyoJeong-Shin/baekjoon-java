package bronze3;

import java.util.Scanner;

public class P1284 {
	// 조건을 만족하는 호수판의 너비 구하기 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int n = sc.nextInt();
			if(n==0) break;
			
			int x1 = 0;	// 각 숫자 사이 여백 
			int x2 = 2;	// 호수판과의 경계 (오, 왼)
			int x3 = 0;	// 각 숫자별 너비 
			int[] arr = new int[4];	// n의 범위 4자리수까지이므로 
			
			for(int i=0; i<arr.length; i++) {	// 각 자리수 디폴트 값 -1 설정 
				arr[i] = -1;
			}
			
			for(int i = 0; n>0; i++) {	// 각 자리수를 배열에 넣음 // 존재하지 않는 자리수는 -1로 유지 
				arr[i] = n%10;
				n /= 10;
			}
			
			for(int j = 1; j<arr.length; j++) {	// 자리수에 해당하는 숫자 사이 여백 추가 (두 자리 수부터 여백 발생) 
				if(arr[j]!=-1) x1++;
			}
			
			for(int j = 0; j<arr.length; j++) {
				if(arr[j]== -1) continue;		// 자리수가 존재하지 않을 경우 생략 
				else if(arr[j] == 1) x3 += 2;	// 1은 2cm 너비 차지 
				else if(arr[j] == 0) x3 += 4;	// 0은 4cm 너비 차지 
				else x3 += 3;	// 나머지 숫자 3cm 너비 차지 
			}
			
			System.out.println(x1+x2+x3);	// 총 여백들의 합 
		}
		sc.close();
	}

}
