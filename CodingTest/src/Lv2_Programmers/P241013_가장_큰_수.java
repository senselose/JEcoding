package Lv2_Programmers;

import java.util.Arrays;
import java.util.Collections;

public class P241013_가장_큰_수 {

	public static void main(String[] args) {
		//int[] numbers = {6, 10, 2};
		int[] numbers = {3, 30, 34, 5, 9};
		String answer = "";		
		
		String [] sNumbers = new String[numbers.length];
		for(int i=0; i<numbers.length; i++) {
			sNumbers[i] = String.valueOf(numbers[i]);
		}
		// 확인
		System.out.println(Arrays.toString(sNumbers));
		
		Arrays.sort(sNumbers,Collections.reverseOrder()); // 내림차순 정렬
		System.out.println(Arrays.toString(sNumbers));
		
		// numbers 요소의 첫번째 자리 수가 큰거부터 앞으로 더하기 ex) 6>1>2
		for (int i = 0; i < sNumbers.length - 1; i++) {
            for (int j = i + 1; j < sNumbers.length; j++) {
                // 두 문자열을 이어붙여서 비교
                String bigger1 = sNumbers[i] + sNumbers[j];
                String bigger2 = sNumbers[j] + sNumbers[i];
                
                // order1이 order2보다 작다면 자리를 바꿈
                if (bigger1.compareTo(bigger2) < 0) {
                    String temp = sNumbers[i];
                    sNumbers[i] = sNumbers[j];
                    sNumbers[j] = temp;
                }
            }
        }
		
		// 정렬된 배열을 이어 붙여서 답을 생성
        for (int i = 0; i < sNumbers.length; i++) {
            answer += sNumbers[i];
        }
		
        System.out.println(answer);
	}

}
