package Lv2_Programmers;

import java.util.Stack;

public class 올바른_괄호 {

	public static void main(String[] args) {
		
		/*
		괄호가 바르게 짝지어졌다는 것은 '(' 문자로 열렸으면 반드시 짝지어서 ')' 문자로 닫혀야 한다는 뜻입니다. 예를 들어

		"()()" 또는 "(())()" 는 올바른 괄호입니다.
		")()(" 또는 "(()(" 는 올바르지 않은 괄호입니다.
		'(' 또는 ')' 로만 이루어진 문자열 s가 주어졌을 때, 문자열 s가 올바른 괄호이면 true를 return 하고, 
		올바르지 않은 괄호이면 false를 return 하는 solution 함수를 완성해 주세요.

		-- 제한사항 -- 
		문자열 s의 길이 : 100,000 이하의 자연수
		문자열 s는 '(' 또는 ')' 로만 이루어져 있습니다.
		
		-- 입출력 예 --
		s	answer
		"()()"	true
		"(())()"	true
		")()("	false
		"(()("	false 
		*/
		
        boolean answer = true;

        String s = "()(()()";
        
        // 비어있는 캐릭터를 사용하는 새로운 스택 변수 선언
        Stack<Character> stack = new Stack<>();
        
        // 반복문으로 s 의 길이만큼 요소들을 하나씩 빼오면서 스택에 푸시 or 팝
    	for (int i=0; i<s.length(); i++) {
    		// s 의 요소가 "(" 라면 스택에 푸시한다
    		if(s.charAt(i) == '(') {
    			stack.push(s.charAt(i));
    		}
    		// s 의 요소가 ")" 라면 스택에서 pop 한다
    		else {
    			// ")"로 닫아야 하는 "(" 요소가 스택 내에 없다면
    			// = 스택이 비어있다면
    			// 결과를 false로 반환한 후 break 를 걸어서 반복문에서 나온다.
    			if(stack.isEmpty()) {
    				answer = false;
    				break;
    			}
    			// 스택에 저장된 "(" 이 있다면 짝이 맞춰지는거니 스택에 있던 "("를 없애준다.
    			else {
    				stack.pop();
    			}
    		}
    	}
        
    	// 모든 반복문이 끝난 후
    	// stack 이 비어있지 않다면 = 무언가 남아있다면
    	// 그건 짝이 안맞는 것이므로 false 반환
        if (!stack.isEmpty()) {
        	answer = false;
        }
        
        System.out.println(answer);
	}

}
