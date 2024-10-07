package Lv1_Programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class prep {

	public static void main(String[] args) {
		
		int [] A = {1,3,6,4,1,2};
//		int [] A = {2,3,4};
//		int [] A = {-1, -2, -6};
		int answer = 0;
		
//		Arrays.sort(A);
//		for(int arr : A) {
//			System.out.print(arr + " ");
//		}
//		System.out.println();
//		
//		if(A[0] > 1) {
//			answer = 1;
//		}
//		else if(A[A.length-1] < 0) {
//			answer = 1;
//		}
//		
//		
//		
//		for(int i=0; i<A[A.length-1]; i++) {
//			if(i+1 != A[i]) {
//				answer = i+1;
//			}
//			
//		}
//		
//
//		System.out.println(answer);
		
		// Key Value 로 가봅시다
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for(int num : A) {
			map.put(num, map.getOrDefault(num, 0) + 1);
		}
		
		System.out.println(map);
		
		ArrayList<Integer> arrList1 = new ArrayList<>();
		
		for(int key : map.keySet()) {
			arrList1.add(key);
		}
		
		System.out.println(arrList1);
		
		// 제일 작은 요소가 1보다 크다면 1
		if(arrList1.get(0) > 1) {
			answer = 1;
		}
		
		// 제일 큰 요소가 0보다 작으면 1 | 제일 큰 요소가 길이하고 같다면 큰요소 +1
		if(arrList1.get(arrList1.size()-1) <=0 ) {
			answer = 1;
		}else if(arrList1.get(arrList1.size()-1) == arrList1.size()) {
			answer = arrList1.get(arrList1.size()-1) + 1;
		}
		
		System.out.println(arrList1.get(0));
		
		for(int i=0; i<arrList1.get(arrList1.size()-1); i++) {
			if(i+1 != arrList1.get(i)) {
				answer = i+1;
				break;
			}
		}
		
		System.out.println(answer);

	}

}
