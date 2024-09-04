package Lv1;

public class 문자열_다루기_기본 {

	public static void main(String[] args) {
		/*
		-- 문제 설명 --
		문자열 s의 길이가 4 혹은 6이고, 숫자로만 구성돼있는지 확인해주는 함수, solution을 완성하세요. 
		예를 들어 s가 "a234"이면 False를 리턴하고 "1234"라면 True를 리턴하면 됩니다.
		
		-- 제한 사항 --
		s는 길이 1 이상, 길이 8 이하인 문자열입니다.
		s는 영문 알파벳 대소문자 또는 0부터 9까지 숫자로 이루어져 있습니다.
		
		-- 입출력 예 --
		  s		return
		"a234"	false
		"1234"	true
		 */
		
		
		// 1. 기존 boolean answer를 true 로 설정하기.
		// 2. 첫번째로 S 문자열의 길이가 4 || 6 인경우만 if 문으로 선별
		// 3. 2번 조건식이 맞다면 숫자만 있는지 확인하기 위해서 아스키코드를 활용해서 숫자 범위 이내인지 확인한다. (for 문으로 확인)
		// 4. 3번 조건식에 해당된다면 answer를 true로 반환시킨다.
		
		String s = "1234aaa";
		boolean answer = true;
		
		// 아스키 코드의 숫자인 범위 확인하기 (48 ~ 57)
		char aski = '0';
		int asknum = (int)aski;
		System.out.println(asknum);
		
		int num = 57;
		char askicode = (char)num;
		System.out.println(askicode);
		
		// 문자열 s 의 길이가 4 또는 6인 경우인지 확인
//		if(s.length() == 4 || s.length() == 6) {
//			// for문으로 문자열 s 의 요소들을 자리 번호대로 확인하며 아스키 코드의 숫자에 해당하는 범위인지 확인한다.
//			for(int i=0; i<s.length();i++) {
//				// 자리별 요소가 숫자인지 확인하기
//				char aski = (char)s.charAt(i);
//				int askicode = (int) aski;
//				if(askicode<48 || askicode > 57) {
//					answer = false;
//					break;
//				}
//			}
//		} 
//		else {
//			answer = false;
//		}
//		
//		System.out.println(answer);
		
		if(s.length()==4 || s.length()==6) {
			for(int i = 0; i< s.length(); i++) {
				//(int) 로 캐릭터 강제 형변환
				int temp = (int)s.charAt(i);
				
				// 65 -> 대문자 A why?? 조건문에 대문자, 소문자, 숫자로만 이루어진 문자열이라고 했는데 대문자가 65로시작 소문자가 94로 시작이라서 65이하는 그냥 숫자로 인식 (다른 문자 생각안함)
				if(temp<65) {
					answer = true;
				}
				else {
					answer = false;
					break;
				}
			}
		}
		else {
			answer = false;
		}
	}
}
