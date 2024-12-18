package Lv1_Programmers;

public class 최소직사각형 {

	public static void main(String[] args) {

//		int[][] sizes = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
//		int[][] sizes = {{10, 7}, {12, 3}, {8, 15}, {14, 7}, {5, 15}};
		int[][] sizes = {{14, 4}, {19, 6}, {6, 16}, {18, 7}, {7, 11}};
		
		// 가로 크기만 담을 배열
		int [] width = new int[sizes.length];
		// 세로 크기만 담을 배열
		int [] length = new int[sizes.length];
		
		// 반복문으로 i번째 요소의 0번째 요소와 1번째 요소 비교하여 큰 수를 width 로 저장. 작은 수는 length로 저장
		for(int i=0; i<sizes.length; i++) {
			
			int max = sizes[i][0];
			int min = sizes[i][0];
			
			for(int j=0; j<sizes[i].length; j++) {
				//System.out.println(sizes[i][j]);
				if(sizes[i][j] > max) {
					max = sizes[i][j];
				}
				if(sizes[i][j] < min) {
					min = sizes[i][j];
				}
			}
			width[i] = max;
			length[i] = min;
		}
		
		for(int temp : width) {
			System.out.println(temp);
		}
		System.out.println();
		
		for(int temp : length) {
			System.out.println(temp);
		}
		System.out.println();
		
		
		// width 배열의 가장 큰 수와 length 배열의 가장 큰 수 더해서 answer에 저장
		int maxWidth = width[0];
		int maxLength = length[0];
		
		for(int i=0; i<width.length; i++) {
			if(width[i] > maxWidth) {
				maxWidth = width[i];
			}
		}
		for(int i=0; i<length.length; i++) {
			if(length[i] > maxLength) {
				maxLength = length[i];
			}
		}
		
		int answer = maxWidth * maxLength;
		
		System.out.println("제일 긴 가로 길이 : " + maxWidth);
		System.out.println("제일 긴 세로 길이 : " + maxLength);
		System.out.println("가장 작은 지갑 크기 : " + answer);
		
	}

}
