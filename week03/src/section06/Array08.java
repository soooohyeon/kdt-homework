package section06;


import java.util.Arrays;

public class Array08 {
	public static void main(String[] args) {
//		예제 12.
		int[] card = {3, 1, 4, 5, 10};	// 배열 생성하고 값 저장
		int[] newCard = Arrays.copyOf(card, card.length);	// Arrays클래스의 메소드 사용해서 깊은 복사
		
		System.out.println("card 배열 : " + Arrays.toString(card));			// 배열 길이 출력
		card[1] = 10;
		System.out.println("card 배열 : " + Arrays.toString(card));			// 배열 길이 출력
		System.out.println("newCard 배열 : " + Arrays.toString(newCard));	// 배열 길이 출력
		
//		예제 13.
		int[] card2 = {1, 6, 4, 5, 3, 2};		// 배열 생성하고 값 저장
		int[] newCard2 = new int[card2.length];	// 복사할 배열 생성하고 기존 배열만큼의 칸 생성
		System.arraycopy(card2, 0, newCard2, 0, card2.length);	// System 클래스의 메소드 사용해서 깊은 복사
		
		System.out.println("card2 배열 : " + Arrays.toString(card2));			// 배열 길이 출력
		System.out.println("newCard2 배열 : " + Arrays.toString(newCard2));	// 배열 길이 출력
	}
}
