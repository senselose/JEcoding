package Lv1_Programmers;

import java.util.ArrayList;
import java.util.Arrays;

public class 나누어_떨어지는_숫자_배열 {

	public static void main(String[] args) {
		/*
		-- 문제 설명 --
		array의 각 element 중 divisor로 나누어 떨어지는 값을 오름차순으로 정렬한 배열을 반환하는 함수, solution을 작성해주세요.
		divisor로 나누어 떨어지는 element가 하나도 없다면 배열에 -1을 담아 반환하세요.
		
		-- 제한사항 --
		arr은 자연수를 담은 배열입니다.
		정수 i, j에 대해 i ≠ j 이면 arr[i] ≠ arr[j] 입니다.
		divisor는 자연수입니다.
		array는 길이 1 이상인 배열입니다.
		
		-- 입출력 예 --
		arr				divisor		return
		[5, 9, 7, 10]	5			[5, 10]
		[2, 36, 1, 3]	1			[1, 2, 3, 36]
		[3,2,6]			10			[-1]
		
		-- 입출력 예 설명 --
		입출력 예#1
		arr의 원소 중 5로 나누어 떨어지는 원소는 5와 10입니다. 따라서 [5, 10]을 리턴합니다.
		
		입출력 예#2
		arr의 모든 원소는 1으로 나누어 떨어집니다. 원소를 오름차순으로 정렬해 [1, 2, 3, 36]을 리턴합니다.
		
		입출력 예#3
		3, 2, 6은 10으로 나누어 떨어지지 않습니다. 나누어 떨어지는 원소가 없으므로 [-1]을 리턴합니다.
		 */

//		int[] arr = {5, 9, 7, 10};
//		int divisor = 5;
		int[] arr = {3,2,6};
		int divisor = 10;
		
		// 배열 오름차순
		Arrays.sort(arr);
		// 확인 
		for(int a:arr) {
			System.out.println(a);
		}
		// 확인2
		System.out.println(Arrays.toString(arr));
		
		// answerList에 나누어지는 수 저장
		ArrayList<Integer> answerList = new ArrayList<>();
		for(int temp:arr) {
			if(temp%divisor == 0) {
				answerList.add(temp);
			}
		}
		
		// 확인
		System.out.println(answerList);
		
		// 나누어지는 수 없으면 -1 저장
		if(answerList.isEmpty()) {
			answerList.add(-1);
		}
		
		
		// answer 배열에 저장
		int [] answer =  new int[answerList.size()];
		
		
		
		for(int i = 0; i<answerList.size(); i++ ) {
			answer[i] = answerList.get(i);
		}
		
		for(int a :answer) {
			System.out.println(a);
		}
	}

}
