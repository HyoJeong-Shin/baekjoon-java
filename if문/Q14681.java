package if문;

import java.util.Scanner;

public class Q14681 {
// 사분면 고르기 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		sc.close();
		
		if(x>0&&y>0)
			System.out.print(1);
		else if(x<0&&y>0)
			System.out.print(2);
		else if(x<0&&y<0)
			System.out.print(3);
		else
			System.out.print(4);
	}

}
