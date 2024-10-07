package Test;

import java.time.Duration;
import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;

public class kako_mobility_2 {

	public static void main(String[] args) {
		String start = "15:15:00";
        String end = "15:15:12";

        // 시간을 초 단위로 변환
        LocalTime startTime = LocalTime.parse(start);
        LocalTime endTime = LocalTime.parse(end);

        long startSeconds = startTime.toSecondOfDay();
        long endSeconds = endTime.toSecondOfDay();

        int count = 0;

        // 시작 초부터 종료 초까지 순회
        for (long i = startSeconds; i <= endSeconds; i++) {
            // 초를 HH:MM:SS로 변환
            LocalTime currentTime = LocalTime.ofSecondOfDay(i % 86400); // 86400은 하루의 총 초수
            String hh = String.format("%02d", currentTime.getHour());
            String mm = String.format("%02d", currentTime.getMinute());
            String ss = String.format("%02d", currentTime.getSecond());

            // HH, MM, SS를 하나의 문자열로 합침
            String combinedTime = hh + mm + ss;

            // 전체 문자열이 한 가지 또는 두 가지 숫자로만 이루어졌는지 확인
            if (hasOneOrTwoUniqueDigits(combinedTime)) {
                count++;
            }
        }

        System.out.println("조건을 만족하는 시간 횟수: " + count);
    }

    // 문자열이 1가지 또는 2가지 숫자로만 이루어졌는지 확인하는 함수
    private static boolean hasOneOrTwoUniqueDigits(String str) {
        Set<Character> uniqueDigits = new HashSet<>();
        for (char c : str.toCharArray()) {
            uniqueDigits.add(c);
        }
        // 고유 숫자가 1개 또는 2개인 경우만 true 반환
        return uniqueDigits.size() <= 2;
    }
}


