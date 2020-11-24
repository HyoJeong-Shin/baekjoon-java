package 문자열;

import java.util.Scanner;

public class Q1316 {
	// 그룹 단어 체커  // 그룹 단어 : 단어에 존재하는 모든 문자에 대해서 각 문자가 연속해서 나타나는 경우 
	// ccazzzzbb는 c, a, z, b가 모두 연속 => 그룹 단어 // aabbbccb는 b가 떨어져서 나타나기 때문에 그룹 단어가 아니다
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();	// 단어의 개수 입력  
		int result = 0;			// 총 그룹 단어의 개수 
		
		for(int i=0; i<n; i++) {		// 단어의 개수만큼 반복
			String word = sc.next();	// 단어 입력 받음 
			char[] arr = new char[26];	// 알파벳 개수만큼 배열 생성 
			int count =0;				// 그룹 단어인지 체크해주기 위한 카운트 수 
			for(int j=0; j<word.length(); j++) {	// 단어 길이만큼 반복 
				if(arr[word.charAt(j)-'a']==0) {	// 만약 j번째 문자가 한번도 나타나지 않았던 문자라면, 
					arr[word.charAt(j)-'a']++;		// 문자가 들어왔다고 배열에 더해줌 (문자가 나타났었는지 아닌지 구별해주기 위해서)
					count++;						// 그룹조건을 만족하므로 카운트 값 더해줌 
				}else {					// 이미 앞에서 나타났던 문자일 경우, 
					if(word.charAt(j-1)-'a'==word.charAt(j)-'a') {	// 연속해서 나타난 문자의 경우 
						arr[word.charAt(j)-'a']++;	// 결과 도출상 필요없는 코드이기는 하나, 해당 문자가 몇번 나타났는지 의미상 표현 위해서 넣어준 코드 
						count++; 					// 그룹조건을 만족하므로 카운트 값 더해줌
					}else {				// 연속해서 나타난 문자가 아닐 경우 
						break;						// 그룹 단어 조건을 만족하지 않으므로, 반복문 나감 
					}
				}	
			}
			if (count==word.length())	result++;	// 만약 카운트 수가 단어의 길이와 같다면, 그룹 단어의 조건을 만족한 채 반복문을 모두 완료했기 때문에 그룹 단어임 (그룹 단어 개수 증가시킴)
		}
		sc.close();
		
		System.out.print(result);
	}

}
