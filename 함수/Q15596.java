package 함수;

public class Q15596 {
// 정수 n개의 합 함수 
	long sum(int[] a) {
		long ans = 0;
		for(int i=0; i<a.length; i++) {
			ans += a[i];
		}
		return ans;
	}

}
