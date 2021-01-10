package bronze3;

import java.util.Scanner;

public class P1333 {
	// 부재중 전화 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int l = sc.nextInt();
		int d = sc.nextInt();
		
		sc.close();
		
		boolean arr[] = new boolean[n*l+5*(n-1)];
		
		for(int i=0; i<n; i++) {	// n곡의 노래 
			int x = (l+5)*i;	// 모든 노래의 길이 l초, 노래와 노래 사이 5초동안 조용한 구간 존재 
			for(int j=x; j<x+l; j++) {
				arr[j]=true;	// 노래가 나오는 중 
			}
		}
		int call = 0;
		while(call<arr.length){	// 모든 앨범 수록곡을 다 듣고 난 후는 벨소리 들을 수 있음 
			if(arr[call]==false) // 노래가 나오는 중이 아닐 때, 	
				break;
			call += d;	// d초에 1번 울리는 전화벨  
		}
		
		System.out.println(call);
	}

}
