package bronze3;

import java.util.Scanner;

public class P1333 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int l = sc.nextInt();
		int d = sc.nextInt();
		
		sc.close();
		
		int start = l, end = l+5;
		int result = 0;
		
		while(true) {
			if(end>= n*l+5*(n-1))	break;

			if(end<=d) {
				start+=(l+5);
				end+=(l+5);
			}
			else if(start<=d && d<end) {
				result = d;
				System.out.println(result);
				break;
			}
			else if(d<start) {
				d+=d;
			}
		}
		
		if(result==0) {
			System.out.println(n*l+5*(n-1));
		}
	}

}
