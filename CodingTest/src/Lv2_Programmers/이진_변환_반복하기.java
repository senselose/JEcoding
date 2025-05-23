package Lv2_Programmers;

public class 이진_변환_반복하기 {

	public static void main(String[] args) {
		// 문자열에서 0 모두 제거하기.
		String s = "01110";
		// 2진법 변환 횟수를 저장할 변수
        int count = 0;
        // 제거된 0의 개수를 저장할 변수
        int zeroCount = 0;
		
        
//        // s가 "1"이 될 때까지 반복
//        while (!s.equals("1")) {
//            // 1. 0 제거 및 제거된 0의 개수 카운트
//            String tempS = "";
//            for (int i = 0; i < s.length(); i++) {
//                if (s.charAt(i) == '1') {
//                    tempS += s.charAt(i);
//                } else {
//                    zeroCount++;  // 제거된 0의 개수 카운트
//                }
//            }
//            
//            // 2. 남은 문자열의 길이를 2진수로 변환 (직접 변환하는 방식)
//            int length = tempS.length();
//            String binaryResult = "";  // 2진수 변환 결과를 저장할 문자열
//
//            // 10진수 length를 2진수로 변환하는 과정
//            while (length > 0) {
//                binaryResult = (length % 2) + binaryResult;  // 나머지를 앞에 추가
//                length /= 2;  // length를 2로 나누어 몫을 계속 구함
//            }
//
//            // 변환된 2진수를 s에 저장
//            s = binaryResult;
//            
//            // 3. 이진 변환 횟수 증가
//            count++;
//        }
//        
//        // 변환 횟수와 제거된 0의 개수를 배열로 반환
//        System.out.println(count);
//        System.out.println(zeroCount);
        
        
        //----------------- 2진법 전환 메서드 사용하기
        
        // s가 "1"이 될 때까지 반복
        while (!s.equals("1")) {
            // 1. 0 제거 및 제거된 0의 개수 카운트
            String tempS = "";
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '1') {
                    tempS += s.charAt(i);
                } else {
                    zeroCount++;
                }
            }
            
            // 2. 남은 문자열의 길이를 2진수로 변환
            int length = tempS.length();
            s = Integer.toBinaryString(length);
            
            // 3. 이진 변환 횟수 증가
            count++;
        }
        
        // 변환 횟수와 제거된 0의 개수를 배열로 반환
        System.out.println(count);
        System.out.println(zeroCount);
    
		
	}

}
