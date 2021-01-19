package bronze3;

import java.util.Scanner;

public class P11718 {
	// 입력 받은 대로 출력하는 프로그램 
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()) {	// 다음 입력이 존재할 동안 반복 
			String s = sc.nextLine();	// 한 줄을 입력 받음 
			System.out.println(s);
		}
		
		sc.close();
	}

}
