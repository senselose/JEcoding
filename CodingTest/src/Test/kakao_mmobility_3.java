package Test;

public class kakao_mmobility_3 {
	public static void main(String[] args) {
		int[] distance = {2, 1, 1, 1, 2};
        String[] trash = {"", "AA", "AA", "BC", ""};
        int[] distance1 = {2, 5};
        String[] trash1 = {"ABA","C"};
        System.out.println(minimumCollectionTime(distance, trash)); // Expected result: 12
        System.out.println(minimumCollectionTime(distance1, trash1)); // Expected result: 12
    }

    public static int minimumCollectionTime(int[] distance, String[] trash) {
        int[] lastHouseForTruck = {-1, -1, -1}; // 0:A, 1:B, 2:C
        int[] trashCount = new int[3]; // 0:A, 1:B, 2:C

        // 각 트럭(A, B, C)이 방문해야 할 마지막 집을 찾고, 해당 트럭이 수거할 쓰레기 개수를 계산
        for (int i = 0; i < trash.length; i++) {
            String currentTrash = trash[i];

            // A 트럭이 방문해야 할 마지막 집과 수거할 쓰레기 개수 계산
            if (currentTrash.contains("A")) {
                lastHouseForTruck[0] = i;
                for (int j = 0; j < currentTrash.length(); j++) {
                    if (currentTrash.charAt(j) == 'A') {
                        trashCount[0]++;
                    }
                }
            }

            // B 트럭이 방문해야 할 마지막 집과 수거할 쓰레기 개수 계산
            if (currentTrash.contains("B")) {
                lastHouseForTruck[1] = i;
                for (int j = 0; j < currentTrash.length(); j++) {
                    if (currentTrash.charAt(j) == 'B') {
                        trashCount[1]++;
                    }
                }
            }

            // C 트럭이 방문해야 할 마지막 집과 수거할 쓰레기 개수 계산
            if (currentTrash.contains("C")) {
                lastHouseForTruck[2] = i;
                for (int j = 0; j < currentTrash.length(); j++) {
                    if (currentTrash.charAt(j) == 'C') {
                        trashCount[2]++;
                    }
                }
            }
        }

        // 각 트럭(A, B, C)의 이동 시간과 쓰레기 수거 시간 계산
        int[] totalTime = new int[3]; // 각 트럭의 총 걸린 시간 저장

        for (int truck = 0; truck < 3; truck++) {
            int lastHouse = lastHouseForTruck[truck];
            if (lastHouse == -1) {
                continue; // 해당 트럭이 갈 필요가 없으면 시간을 계산하지 않음
            }

            int travelTime = 0; // 트럭이 이동하는 시간
            int collectionTime = trashCount[truck]; // 트럭이 쓰레기를 수거하는 시간 (봉투 개수)

            // 마지막 집까지 이동하는 동안 모든 거리를 합산
            for (int i = 0; i <= lastHouse; i++) {
                travelTime += distance[i]; // 각 집을 통과하는 거리
            }

            // 왕복 시간 계산 (마지막 집까지 가고 돌아오는 왕복 시간)
            travelTime = travelTime * 2;

            // 총 시간 = 이동 시간 + 쓰레기 수거 시간
            totalTime[truck] = travelTime + collectionTime;
        }

        // 가장 오래 걸린 트럭의 시간을 반환
        return Math.max(totalTime[0], Math.max(totalTime[1], totalTime[2]));
        
		
	}
}
