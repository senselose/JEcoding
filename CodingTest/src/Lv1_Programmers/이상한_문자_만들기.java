package Lv1_Programmers;

public class 이상한_문자_만들기 {

	public static void main(String[] args) {
		/*
		-- 문제 설명 --
		문자열 s는 한 개 이상의 단어로 구성되어 있습니다. 
		각 단어는 하나 이상의 공백문자로 구분되어 있습니다. 
		각 단어의 짝수번째 알파벳은 대문자로, 홀수번째 알파벳은 소문자로 바꾼 문자열을 리턴하는 함수, solution을 완성하세요.
		
		-- 제한 사항 --
		문자열 전체의 짝/홀수 인덱스가 아니라, 단어(공백을 기준)별로 짝/홀수 인덱스를 판단해야합니다.
		첫 번째 글자는 0번째 인덱스로 보아 짝수번째 알파벳으로 처리해야 합니다.
		
		-- 입출력 예 --
				s				return
		"try hello world"	"TrY HeLlO WoRlD"
		
		-- 입출력 예 설명 --
		"try hello world"는 세 단어 "try", "hello", "world"로 구성되어 있습니다. 
		각 단어의 짝수번째 문자를 대문자로, 홀수번째 문자를 소문자로 바꾸면 "TrY", "HeLlO", "WoRlD"입니다. 
		따라서 "TrY HeLlO WoRlD" 를 리턴합니다.
		*/
		
		// 문자열의 공백은 무시한다.
		// 단어의 짝수번째는 대문자로, 홀수번째는 소문자로 변경한다. (단어기준으로 첫번째 단어는 0번째 자리이므로 대문자)
		
		String s = "try hello world";
		String n = "";
		int count = 0;
		
		for(int i=0;i<s.length();i++) {
			// 각각의 요소를 캐릭터 형태로 변환
			char charS = s.charAt(i);
			
			// 변환한 캐릭터가 공백이라면 카운트는 0 유지
			// 빈문자열 n에 캐릭터 add
			if(charS == ' ') {
				count = 0;
				n += charS;
			}
			// 공백이 아니라면 카운트 1씩 올리기
			else {
				// 카운트 = 짝수
				if(count % 2 == 0) {
					// 문자열 n에 charS를 대문자로 변환하여 저장
					n += Character.toUpperCase(charS);
				}
				// 카운트 = 홀수
				else {
					// 문자열 n에 charS를 소문자로 저장
					n += Character.toLowerCase(charS);
				}
				count ++;
			}
		}
		
		System.out.println(n);
		
	}

}
