package Lv1_Programmers;

import java.util.HashMap;

//class getter setter로 풀어보기

public class 완주하지_못한_선수_hash {

	public static void main(String[] args) {
		/*
		-- 문제 설명 --
		수많은 마라톤 선수들이 마라톤에 참여하였습니다. 단 한 명의 선수를 제외하고는 모든 선수가 마라톤을 완주하였습니다.
		
		마라톤에 참여한 선수들의 이름이 담긴 배열 participant와 완주한 선수들의 이름이 담긴 배열 completion이 주어질 때, 완주하지 못한 선수의 이름을 return 하도록 solution 함수를 작성해주세요.
		
		-- 제한사항 --
		마라톤 경기에 참여한 선수의 수는 1명 이상 100,000명 이하입니다.
		completion의 길이는 participant의 길이보다 1 작습니다.
		참가자의 이름은 1개 이상 20개 이하의 알파벳 소문자로 이루어져 있습니다.
		참가자 중에는 동명이인이 있을 수 있습니다.
		
		-- 입출력 예 --
		participant											completion									return
		["leo", "kiki", "eden"]								["eden", "kiki"]							"leo"
		["marina", "josipa", "nikola", "vinko", "filipa"]	["josipa", "filipa", "marina", "nikola"]	"vinko"
		["mislav", "stanko", "mislav", "ana"]				["stanko", "ana", "mislav"]					"mislav"
		
		-- 입출력 예 설명 --
		예제 #1
		"leo"는 참여자 명단에는 있지만, 완주자 명단에는 없기 때문에 완주하지 못했습니다.
		
		예제 #2
		"vinko"는 참여자 명단에는 있지만, 완주자 명단에는 없기 때문에 완주하지 못했습니다.
		
		예제 #3
		"mislav"는 참여자 명단에는 두 명이 있지만, 완주자 명단에는 한 명밖에 없기 때문에 한명은 완주하지 못했습니다.
		 */
		
		// 문제 생각해보기
		// 1. 참가자 해시에 키값으로 넣고 value는 1로 설정 (동명이인 있을 시 벨류 ++)
		// 2. 완주자 -> 해시에 키 값으로 존재하면 value에서 1--
		// 3. return 에 value가 0이 아닌 key들 넣고 반환
		
//		String[] participant = {"leo", "kiki", "eden"};
		String[] participant = {"mislav", "stanko", "mislav", "ana"};
		String[] completion = {"stanko", "ana", "mislav"};
		
		// HashMap 만들기
		HashMap<String, Integer> player = new HashMap<>();
		
		// player 에 participat 넣기 -> 동명이인은 value에 +1씩 추가
		for(String p : participant) {
			// 이미 key 존재하면 (동명이인)
			if(player.containsKey(p)) {
				player.put(p, player.get(p) +1);
			}
			// 아니라면 새로 넣고 value에 1설정
			else {
				player.put(p, 1);
			}
		}
		System.out.println(player);
		
		// 잘 들어갔는지 확인
		for (HashMap.Entry<String, Integer> p : player.entrySet()) {
		    System.out.println("Key = " + p.getKey() + ", Value = " + p.getValue());
		}
		System.out.println();
		
		// 완주자들 key값에 있으면 value -1씩하기
		for(String p : completion) {
			if(player.containsKey(p)) {
				player.put(p, player.get(p) -1);
			}
		}
		
		// 잘 적용됐는지 확인
		for (HashMap.Entry<String, Integer> p : player.entrySet()) {
		    System.out.println("Key = " + p.getKey() + ", Value = " + p.getValue());
		}
		
		// value > 0 을 answer에 저장
		String answer = "";
		for (HashMap.Entry<String, Integer> p : player.entrySet()) {
		    if(p.getValue() != 0) {
		    	answer += p.getKey() + "";
		    }
		}
		
		System.out.println(answer);
		
	}

}
