package Lv1_Programmers;

import java.util.Arrays;

public class P241016_정수_내림차순으로_배치하기 {

	public static void main(String[] args) {

		// 873211
		long n = 118372;
		String nS = Long.toString(n);
		
		char[] charN = new char[nS.length()];
		char[] sortN = new char[nS.length()];
		
		for(int i=0; i<nS.length(); i++) {
			charN[i] = nS.charAt(i);
		}
		
		Arrays.sort(charN);
		
		for(int i= 0; i<nS.length(); i++) {
			sortN[i] = charN[charN.length -i -1];
		}
		
		// 확인
		for(char ch : sortN) {
			System.out.println(ch);
		}
		
		// 다시 String으로 변환
		String sortStr = new String(sortN);
		
		// 확인
		System.out.println(sortStr); // 873211
		
		// answer에 Long으로 변환해서 저장
		Long answer = Long.parseLong(sortStr);
		
		System.out.println(answer);
		
		
		
		
	}

}
