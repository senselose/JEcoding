package Lv1_Programmers;

import java.util.ArrayList;

// 가능은 함. 정답 역시 okay. 그러나 유효성 검사 실패
//class getter setter로 풀어보기
class Player {
	private String pName;
	private int pCount;
		
	public Player(String pName, int pCount) {
		this.pName = pName;
		this.pCount = pCount;
	}
	public String getPName() {
		return pName;
	}
	public int getCount() {
		return pCount;
	}
	public void setPName(String pName) {
		this.pName = pName;
	}
	public void setPConut(int pCount) {
		this.pCount = pCount;
	}
}


public class 완주하지_못한_선수_class {

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
		
		ArrayList<Player> players = new ArrayList<>();
		
		// 참가자 넣기
		for(String p : participant) {
			// 이름 있는지 찾는 변수
			boolean found = false;
			
			for(Player player : players) {
				// Player에 p 가 있으면 count +1
				if(player.getPName().equals(p)) {
					player.setPConut(player.getCount() +1);
					found = true;
					break;
				}
			}
			
			// 찾아봤는데 없으면 새로 new Player 생성해서 집어넣기
			if(!found) {
				players.add(new Player(p, 1));
			}
		}
		
		// 잘 들어갔는지 여부 확인
		for(Player p : players) {
			System.out.println(p.getPName() + " - " + p.getCount());
		}
		
		// 완주자 count 줄이기
		for(String p : completion) {
			// 이름 있는지 찾는 변수
			boolean found = false;
			
			for(Player player : players) {
				// Player에 p 가 있으면 count -1
				if(player.getPName().equals(p)) {
					player.setPConut(player.getCount() -1);
					found = true;
					break;
				}
			}
		}
		
		// 잘 들어갔는지 여부 확인
		for(Player p : players) {
			System.out.println(p.getPName() + " - " + p.getCount());
		}
		
		// answer에 미완주자 넣기
		// pCount 가 0이 아닌 것
		String answer = "";
		for(Player p : players) {
			if(p.getCount() != 0) {
				answer += p.getPName();
			}
		}
		
		System.out.println(answer);
		
	}

}
