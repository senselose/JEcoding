package Lv1_Programmers;

import java.util.ArrayList;

public class 제일_작은_수_구하기 {

	public static void main(String[] args) {
		/*
		-- 문제 설명 --
		정수를 저장한 배열, arr 에서 가장 작은 수를 제거한 배열을 리턴하는 함수, solution을 완성해주세요. 
		단, 리턴하려는 배열이 빈 배열인 경우엔 배열에 -1을 채워 리턴하세요. 
		예를들어 arr이 [4,3,2,1]인 경우는 [4,3,2]를 리턴 하고, [10]면 [-1]을 리턴 합니다.
		
		-- 제한 조건 --
		arr은 길이 1 이상인 배열입니다.
		인덱스 i, j에 대해 i ≠ j이면 arr[i] ≠ arr[j] 입니다.
		
		-- 입출력 예 --
		arr				return
		[4,3,2,1]		[4,3,2]
		[10]			[-1]
		 */
		
		int [] arr = {4,3,2,1};
		
		// 최소값 인덱스 저장
		int minarr = 0;
		
		// 배열의 길이가 1이면 answer에 -1 담아서 리턴
		if(arr.length == 1) {
			int[] answer = {-1};
//			return answer;
			
		}
		
		
		// 배열의 길이가 1보다 클 떄
		// 제일 작은 요소 인덱스 찾기
		for(int i = 0; i<arr.length; i++) {
			if(arr[minarr] > arr[i]) {
				minarr = i;
			}
		}
		
		// 새로 배열 생성 -> 길이는 arr 보다 한개 적게
		int[] answer = new int[arr.length - 1];
		
		// 새로 인덱스 번호 할 변수 하나 생성
		int index = 0;
		
		// result 배열에 minarr 인덱스 빼고 새로 저장
		for(int i=0; i<arr.length; i++) {
			if(i != minarr) {
				answer[index++] = arr[i];
			}
		}
		

		// 잘 나왔는지 확인
		for(int i =0; i<answer.length; i++) {
			System.err.println(answer[i]);
		}

	
	//--------------------------------------------------------------------------
	
		// ArrList?
		
		int minIndex = 0;
		
		// 가장 작은 요소 인덱스 찾기
		for(int i = 1; i < arr.length; i++) {
            if(arr[minIndex] > arr[i]) {
                minIndex = i;
            }
        }

		// ArrList 변수 만들고 거기에 arr에서 minIdex 빼고 저장
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			if (i != minIndex) {
				list.add(arr[i]);
			}
		}

		// ArrList -> 배열 변환
		if (list.size() == 0) {
			int answer2[] = { -1 };
//			return answer;
		} else {
			int[] answer2 = new int[list.size()];
			for(int i=0; i<list.size(); i++) {
				answer[i] = list.get(i);
			}
//			return answer;
		}
		

		
	}
}
