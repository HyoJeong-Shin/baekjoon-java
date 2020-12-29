package 수학2;

import java.util.Scanner;

public class P3009 {
	// 직사각형의 네 번째 점 완성 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arrx = new int[3];
		int[] arry = new int[3];
		
		for(int i=0; i<3; i++) {
			arrx[i] = sc.nextInt();
			arry[i] = sc.nextInt();
		}
		
		sc.close();
		
		if(arrx[0]==arrx[1]) {
			System.out.print(arrx[2] + " ");
		}else if(arrx[0]==arrx[2]) {
			System.out.print(arrx[1] + " ");
		}else {
			System.out.print(arrx[0] + " ");
		}
		
		if(arry[0]==arry[1]) {
			System.out.print(arry[2]);
		}else if(arry[0]==arry[2]) {
			System.out.print(arry[1]);
		}else {
			System.out.print(arry[0]);
		}
	}

}
