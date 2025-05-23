package Lv1_Programmers;

public class P241014_정수_제곱근_판별 {

	public static void main(String[] args) {
		long n = 121;
		long n1 = 3;
		long answer = 0;
		long answer1 = 0;
		
		// 제곱근(루트) 구하기
		double sqrt = Math.sqrt(n);
		double sqrt1 = Math.sqrt(n1);
		
		System.out.println("121의 제곱근: " + sqrt);
		System.out.println("3의 제곱근: " + sqrt1);
		
		// 121
		if(sqrt % 1 == 0) {
			//answer = ((long)sqrt+1) * ((long)sqrt+1);
			answer = (long)Math.pow(sqrt+1, 2); // Math.pow(제곱할 숫자, 몇제곱);
		}
		else {
			answer = -1;
		}
		
		// 3
		if(sqrt1 % 1 == 0) {
			answer1 = ((long)sqrt1+1) * ((long)sqrt1+1);
		}
		else {
			answer1 = -1;
		}
		
		System.out.println("121일 때: " + answer);
		System.out.println("3일 때: " + answer1);
		
		
	}

}
