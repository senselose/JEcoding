package Lv1_Programmers;

import java.util.Arrays;

public class P241011_K번째수 {

	public static void main(String[] args) {
		int[] array = {1, 5, 2, 6, 3, 7, 4};
		int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		
		int [] answer = new int[commands.length];
		
		// commands 배열에서 i번째부터 j번째까지 자르기
		for(int index=0; index<commands.length; index++) {
			int i = commands[index][0];
			int j = commands[index][1];
			int k = commands[index][2];
			
			// array에서 i~j번째 잘라서 배열 생성
			int [] sliceArray = Arrays.copyOfRange(array, i-1, j);
			System.out.println("자른 배열 (" + i + " - " + j + "번째까지): " + Arrays.toString(sliceArray));
			
			// 자른 배열 정렬
			Arrays.sort(sliceArray);
			System.out.println("정렬된 배열: " + Arrays.toString(sliceArray));
			
			// k번째 수 answer 배열에 저장
			answer[index] = sliceArray[k-1];
		}
		
		System.out.println(Arrays.toString(answer));
		
	}

}
