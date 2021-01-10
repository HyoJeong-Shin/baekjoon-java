package bronze3;

import java.util.Scanner;

public class P1547 {
	// 공 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		
		boolean cup[] = new boolean[4];	// 컵 개수만큼 배열 생성 (1번, 2번, 3번 편하게 출력하기 위해 0번째 인덱스 제외하고 생각함) 
		
		for(int i=1; i<4; i++) {
			cup[i] = false;		// 공이 들어가 있지 않은 컵들 
			if(i==1) cup[i] = true;	// 먼저 1번 컵의 아래에 공을 넣음 
		}
		
		boolean tmp;
		
		for(int i=0; i<m; i++) {	// m번 컵의 위치 바꿈 (x번 컵과 y번 컵 자리 바꿈) 
			int x = sc.nextInt();	// x번 컵 
			int y = sc.nextInt();	// y번 컵 
			
			// 위치 바꾸는 식 
			tmp = cup[x];	// 먼저 cup[x]에 해당하는 내용 변수 tmp에 저장 
			cup[x] = cup[y];	// cup[x]와 cup[y]자리 바꿈 // y의 내용 x에 저장 
			cup[y] = tmp;	// 앞서 tmp에 저장해놓은 x의 내용 y에 저장 
		}
		
		sc.close();
		
		for(int i=1; i<4; i++) {	// 공이 들어있는 컵의 번호 출력 
			if(cup[i])	System.out.print(i);
		}
	}

}
