package Test;

import java.util.LinkedList;
import java.util.Queue;

public class Naver_DY {
	public static void main(String[] args) {
		
		String input = "bCcCbCce";
		
		
		Queue<Character> queue = new LinkedList<>();
        int pairCount = 0;

        for (char ch : input.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                // 대문자일 경우 큐에 추가
                queue.offer(ch);
            } else if (Character.isLowerCase(ch)) {
                // 소문자일 경우 큐에서 대응되는 대문자가 있는지 확인
                char upper = Character.toUpperCase(ch);
                
                if (queue.contains(upper)) {
                    pairCount++;
                    // 큐에서 가장 먼저 만나는 해당 대문자 제거 (동일한 대문자가 있더라도 첫 번째 항목만 삭제)
                    Queue<Character> tempQueue = new LinkedList<>();
                    boolean found = false;
                    while (!queue.isEmpty()) {
                        char current = queue.poll();
                        if (current == upper && !found) {
                            found = true; // 첫 번째 해당 대문자만 제거
                        } else {
                            tempQueue.offer(current);
                        }
                    }
                    queue = tempQueue; // 업데이트된 큐로 교체
                }
            }
        }
        
        System.out.println(pairCount);
		
	}
}
