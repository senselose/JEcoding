package Lv2_Programmers;

import java.util.Arrays;

public class P241103_최솟값_만들기 {

	public static void main(String[] args) {
		int []A = {1, 4, 2};
		int []B = {5, 4, 4};
		int answer = 0;
		Arrays.sort(A);
		Arrays.sort(B);
		
		for(int i = 0;i<A.length;i++) {
			int mul = A[i] * B[B.length-i-1];
			answer += mul;
		}
		
		System.out.println(answer);
	}

}
