package Test;

import java.util.ArrayList;
import java.util.Arrays;

public class kakao_mobility_1 {

	public static void main(String[] args) {

		int [] R = {0,2,1,1,0,4,1};
		
		ArrayList<int[]> result = new ArrayList<>();
        ArrayList<Integer> tempList = new ArrayList<>();
		
        for (int num : R) {
            if (num != 0) {
                tempList.add(num);
            } else {
                // 0을 만난 경우 tempList를 배열로 변환하고 result 리스트에 추가
                if (!tempList.isEmpty()) {
                    // tempList를 int[] 배열로 변환
                    int[] tempArray = new int[tempList.size()];
                    for (int i = 0; i < tempList.size(); i++) {
                        tempArray[i] = tempList.get(i);
                    }
                    result.add(tempArray);
                    tempList.clear(); // tempList 초기화
                }
            }
        }
        // 마지막 그룹이 있을 경우 추가
        if (!tempList.isEmpty()) {
            int[] tempArray = new int[tempList.size()];
            for (int i = 0; i < tempList.size(); i++) {
                tempArray[i] = tempList.get(i);
            }
            result.add(tempArray);
        }
		
        // 최대 길이 * 최대값 찾기
        int maxIndicator = Integer.MIN_VALUE; // 길이 * 최대값 중 가장 큰 값을 저장

        // 결과 출력 (각 배열의 길이와 최대값)
        for (int[] arr : result) {
            // 배열의 길이
            int length = arr.length;

            // 배열에서 가장 큰 값 찾기
            int max = arr[0];  // 첫 번째 값을 초기값으로 설정
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                }
            }

            // 길이 * 최대값 계산
            int indicator = length * max;
            
            System.out.println("배열: " + Arrays.toString(arr));
            System.out.println("길이: " + length + ", 최대값: " + max + ", 길이 * 최대값: " + indicator);
            System.out.println();

            // 길이 * 최대값 중 가장 큰 값을 저장
            if (indicator > maxIndicator) {
            	maxIndicator = indicator;
            }
        }

        // 최종적으로 가장 큰 길이 * 최대값 출력
        System.out.println("가장 큰 (길이 * 최대값): " + maxIndicator);
		
		
		
		
		
		
		
		
		

		
		
		
		
		
		
		
		
	}

}
