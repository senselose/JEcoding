package Lv3_Programmers;

public class 등굣길 {

	public static void main(String[] args) {
		/*
		-- 문제 설명 --
		계속되는 폭우로 일부 지역이 물에 잠겼습니다. 물에 잠기지 않은 지역을 통해 학교를 가려고 합니다. 집에서 학교까지 가는 길은 m x n 크기의 격자모양으로 나타낼 수 있습니다.
		
		아래 그림은 m = 4, n = 3 인 경우입니다.
		가장 왼쪽 위, 즉 집이 있는 곳의 좌표는 (1, 1)로 나타내고 가장 오른쪽 아래, 즉 학교가 있는 곳의 좌표는 (m, n)으로 나타냅니다.
		격자의 크기 m, n과 물이 잠긴 지역의 좌표를 담은 2차원 배열 puddles이 매개변수로 주어집니다. 
		오른쪽과 아래쪽으로만 움직여 집에서 학교까지 갈 수 있는 최단경로의 개수를 1,000,000,007로 나눈 나머지를 return 하도록 solution 함수를 작성해주세요.
		
		-- 제한사항 --
		격자의 크기 m, n은 1 이상 100 이하인 자연수입니다.
		m과 n이 모두 1인 경우는 입력으로 주어지지 않습니다.
		물에 잠긴 지역은 0개 이상 10개 이하입니다.
		집과 학교가 물에 잠긴 경우는 입력으로 주어지지 않습니다.
		
		-- 입출력 예 --
		m	n	puddles		return
		4	3	[[2, 2]]	4
		*/
		
		// 문제 풀이 방법
		// 가로열 첫번째 줄 [0][i] 에 모두 1 채우기 | 세로열 맨 왼쪽 줄 [i][0] 에 모두 1 채우기
		// 웅덩이 부분에 0 채우기
		// 웅덩이 제외하고 다른 부분에 위 [i-1][i] 값 + 왼쪽 [i][i+1] 값 넣어서 저장하기
		// 최종 [m-1][n-1]에 저장된 값 출력
		
		
		int m = 5;
		int n = 5;
		int[][] map = new int [n][m];
		int[][] puddles = { { 2, 2 }, { 1, 4 } ,{4,2},{4,4}};
		
//		// 가로열 첫번째 줄에 모두 1 채우기
//        for(int i=0; i<m; i++) {
//            map[0][i] = 1;
//        }
//        
//        // 세로열 제일 왼쪽 줄에 모두 1 채우기
//        for(int i=0; i<n; i++) {
//            map[i][0] = 1;
//        }
		
		// 전체 요소에 우선적으로 1 채우기
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				map[i][j] = 1;
			}
		}
		
		// 웅덩이 정보 가져오기
		for (int[] puddle : puddles) {
			map[puddle[1] - 1][puddle[0] - 1] = 0; // 웅덩이는 0으로 설정
		}
		
		map[0][0] = 1;
		
		// 전체 요소 접근 (위의 방식으로 하면 나머지가 0이라서 계속 지나침)
        for(int i=0; i<map.length; i++) { // 행
            System.out.print(i + "행 : ");
            for(int j=0; j<map[i].length; j++) { // 열
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        
        // 맨 윗 열에 웅덩이가 중간에 존재하면 그 뒤는 0으로 설정
        // ex) 웅덩이 [0][2]
        //     1 1 0 0
        for(int i=1; i<m; i++) {
        	if(map[0][i-1] == 0) {
        		map[0][i] = 0;
        	}
        }
        
        // 맨 왼쪽 세로열에에 웅덩이가 중간에 존재하면 그 뒤는 0으로 설정
        // ex) 웅덩이 [1][0]
        //     1 1 1 1
        //     0 1 2 3
        //     0 1 3 6
        for(int i=1; i<n; i++) {
        	if(map[i-1][0] == 0) {
        		map[i][0] = 0;
        	}
        }
        
 // -------------------------------------------------------------------------------       
        // 위 + 왼쪽 더하기
        // {1, 1}시작  i=m (가로) j=n(세로)
        for(int i=1; i<n; i++) {
            for(int j=1; j<m; j++) {
                if(map[i][j] == 0) {
                    continue; // 웅덩이는 건너뛰기
                } else {
                	map[i][j] = ((map[i-1][j]%1000000007) + (map[i][j-1]%1000000007));
                }
            }
        }
        
        // 전체 요소 접근 (결과 출력)
        for(int i=0; i<map.length; i++) { // 행
            System.out.print(i + "행 : ");
            for(int j=0; j<map[i].length; j++) { // 열
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        
        // 결과 값 저장 (문제 똑바로 읽자)
        int answer = 0;
        for(int[] res : map) {
        	answer = map[n-1][m-1]%1000000007;
        }
        
        System.out.println(answer);
		
		 
	}

}
