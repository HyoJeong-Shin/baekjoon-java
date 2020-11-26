package 수학1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2869 {
// 달팽이의 움직임을 계산하는 문제 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int a = Integer.parseInt(st.nextToken());	// 낮동안 올라가는 높이 
		int b = Integer.parseInt(st.nextToken());	// 밤동안 미끄러지는 높이 
		int v = Integer.parseInt(st.nextToken());	// 나무막대 높이 
		
		int count = (v-b)/(a-b);
		
		if((v-b)%(a-b)!=0) {	
			count++;
		}
		
		System.out.print(count);
	}

}
