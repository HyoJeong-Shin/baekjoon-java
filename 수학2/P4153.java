package 수학2;

import java.util.Arrays;
import java.util.Scanner;

public class P4153 {
	// 직각삼각형 판단 // 피타고라스 이용 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[3];		// 삼각형 변의 수 만큼 배열 크기 선언 
		
		while(true) {
			// 각 변의 길이 입력 
			arr[0] = sc.nextInt();
			arr[1] = sc.nextInt();
			arr[2] = sc.nextInt();
			
			if (arr[0]==0 && arr[1]==0 && arr[2]==0){	// 0 0 0일 경우 테스트 끝 
				break;
			}
			
			Arrays.sort(arr);	// 피타고라스 정리를 적용할 수 있도록 배열 정렬 
			
			if((arr[0]*arr[0] + arr[1]*arr[1])== arr[2]*arr[2]) {
				System.out.println("right");
			}else {
				System.out.println("wrong");
			}
		}
		
		sc.close();

	}

}
