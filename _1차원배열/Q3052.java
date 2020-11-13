package _1차원배열;

import java.util.HashSet;
import java.util.Scanner;

public class Q3052 {
// 서로 다른 나머지가 몇 개 있는지 출력 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashSet<Integer> set = new HashSet<Integer>();
		
		for(int i=0; i<10; i++) {
			int n = sc.nextInt();
			set.add(n%42);
		}
		
		sc.close();
		
		System.out.println(set.size());
			
	}
}

/* HashSet : 중복된 값을 허용하지 않음, 순서를 보장하지 않음, null 값을 저장할 수 있음, 
 * 			 내부적으로 hashmap을 사용하여 데이터를 저장
 * HashSet<Integer> set = new HashSet<Integer>(); // hashset 생성
 * set.add() // 값 추가
 * set.remove()	// 값 제거
 * set.size()	// set 크기 출력 
 * set.contains(); // set내부에 원하는 값이 있는지 확인 //true, false 반환 
 */
