package for문;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q15552 {
// 빠른 A+B
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));//선언

		int t = Integer.parseInt(bf.readLine());	// readLine() 리턴값은 String => Int 형변환 

			
		for(int i=0; i<t; i++) {
		   String s= bf.readLine();	//String	//예외처리 해줘야 함
		   String[] arr = s.split(" ");
		   int a = Integer.parseInt(arr[0]);
		   int b = Integer.parseInt(arr[1]);
		   bw.write((a+b)+"\n");
		}
		
		bw.flush();	// 남아있는 데이터를 모두 출력시킴 
		bw.close();	// 스트림 닫음 
	}

}

// BufferedReader : 엔터만 경계로 인식하고 받은 데이터가 String으로 고정 
//					많은 양의 데이터를 입력받을 경우 더 효율적, 입력시 buffer활용하여 작업속도 차이 많이 남
// readLine() : 리턴값 String으로 고정 => 다른 타입 입력 받을려면 형변환 필수
//				예외처리 해주기 => try&catch문 또는 throws IOException (주로 사용)
// 