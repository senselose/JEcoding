package Lv1_Programmers;

public class 없는_숫자_더하기 {

	public static void main(String[] args) {

		/*
		-- 문제 설명 --
		0부터 9까지의 숫자 중 일부가 들어있는 정수 배열 numbers가 매개변수로 주어집니다. numbers에서 찾을 수 없는 0부터 9까지의 숫자를 모두 찾아 더한 수를 return 하도록 solution 함수를 완성해주세요.

		-- 제한사항 --
		1 ≤ numbers의 길이 ≤ 9
		0 ≤ numbers의 모든 원소 ≤ 9
		numbers의 모든 원소는 서로 다릅니다.
		
		-- 입출력 예 --
		numbers				result
		[1,2,3,4,6,7,8,0]	14
		[5,8,4,0,6,7,9]		6
		 */
		
		// for-each 문 사용하기
		
		int [] numbers = {0,1,2,4,6,8,9};
		int answer = 45;
        for(int num : numbers){
            answer -= num;
        }
        
        System.out.println(answer);
		
        // for 문 사용하기
        int [] numbers2 = {1,2,3,4,9};
        int answer2 = 45;
        for(int i=0;i<numbers2.length;i++) {
        	answer2 -= numbers2[i];
        }
        
        System.out.println(answer2);
        
	}

}
