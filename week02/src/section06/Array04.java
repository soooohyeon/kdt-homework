package section06;
//1. 배열 ④ : 배열의 값 중 영문자만 출력
public class Array04 {
	public static void main(String[] args) {
//		[예제 05.]
//		cards라는 참조변수를 stack 메모리에 선언하고 7칸짜리 배열을 heap 메모리에 생성한 후 각 값 담기
		char[] cards = {'1', 'L', 'O', '2', 'V', '3', 'E'};
//		추출한 영문자를 담을 변수 선언 및 초기화
		String myWord = "";
		
//		배열의 길이만큼 반복 돌려서 영문자인지 확인
		for (int i = 0; i < cards.length; i++) {
//			영문자인지 검사하기 위해 아스키코드 이용
			int word = cards[i];
//			대문자는 65 ~ 90, 소문자는 97 ~ 122이므로 if문 사용
			if (((word) >=  65 && word <= 90) || (word >= 97 && word <= 122)) {
//				해당하는 값들은 myWord 변수에 누적
				myWord += (char)word;
			}
		}
//		위에서 추출한 myWord 결과값 출력
		System.out.println("단어 : " + myWord);
		
	}
}
