package bronze3;

import java.util.Scanner;

public class P15953 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for(int i=0; i<t; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			int r1, r2 = 0;
			
			if(a==1)	r1 = 500;
			else if(1<a&&a<4)	r1 = 300;
			else if(3<a&&a<7)	r1 = 200;
			else if(6<a&&a<11)	r1 = 50;
			else if(10<a&&a<16)	r1 = 30;
			else if(15<a&&a<22)	r1 = 10;
			else r1 = 0;
			
			if(b==1)	r2 = 512;
			else if(1<b&&b<4)	r2 = 256;
			else if(3<b&&b<8)	r2 = 128;
			else if(7<b&&b<16)	r2 = 64;
			else if(15<b&&b<32)	r2 = 32;
			else r2 = 0;
			
			System.out.println((r1+r2)*10000);
		}
		sc.close();
	}

}
