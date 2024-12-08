package section06;

import java.util.Arrays;
import java.util.Iterator;

public class Array07 {
	public static void main(String[] args) {
//		예제 10.
		int[] arr01 = {1, 2, 3};	// 배열 선언 및 값 저장
		int[] arr02 = arr01;		// 배열 선언 및 arr01 배열 얕은 복사
		
		System.out.println("arr01 배열 : " + Arrays.toString(arr01));	// arr01 문자열로 출력
		
		arr02[1] = 10;	// arr02 배열의 1번째 값을 10으로 수정
		System.out.println("arr02 배열 : " + Arrays.toString(arr02));	// arr02 문자열로 출력, 1번째 값이 10으로 바뀐 것 확인
		System.out.println("arr01 배열 : " + Arrays.toString(arr01));	// arr01 문자열로 출력, 1번째 값이 10으로 바뀐 것 확인
		
//		예제 11.
		int[] card = {1, 6, 4, 5, 3, 2};		// 배열 선언 및 값 저장
		int[] newCard = new int[card.length];	// 배열 선언하고 길이만 복사할 배열의 길이로 칸 생성
		
		for (int i = 0; i < card.length; i++) {	// 베열 길이 만큼 반복
			newCard[i] = card[i];				// 새 배열에 기존 배열 값 저장
		}
		
		System.out.println("card 배열 : " + Arrays.toString(card));			// 기존 배열 출력
		System.out.println("newCard 배열 : " + Arrays.toString(newCard));	// 복사 배열 출력
	}
}
