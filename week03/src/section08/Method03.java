package section08;
//멘토시리즈 자바 예제 14 -
public class Method03 {
	
//	예제 14. result를 반환하는 메서드 선언
	int sum (int[] nums) {	// 외부에서 정수형 배열타입의 매개변수값을 받을 수 있음
		int result = 0;
		 for (int i = 0; i < nums.length; i++) {	// 전달받은 배열의 길이만큼 반복
			result += nums[i];	// 배열의 각 값을 누적해서 더함
		}
		 return result;	// 결과값 외부로 반환
	}
	
//	예제 16. result를 반환하는 메서드 선언 (사용시 변수에 저장)
	int score(int[] scores) {	// 외부에서 정수형 배열타입의 매개변수값을 받을 수 있음
		int result = 0;
		for (int i = 0; i < scores.length; i++) {
			result += scores[i];	// 배열의 각 값을 누적해서 더함
		}
		return result;	// 결과값 외부로 반환
	}
	
//	예제 18. result로 메서드 종료
	void take (int m) {
		while (true) {		// 무한반복
			if (m < 3000) {	// 매개변수의 값이 3000보다 작다면
				System.out.println("교통카드를 충전하러 갑니다.");
				return;		// 무한반복 종료
			}
			System.out.println("버스를 탑니다.");
			m-= 1250;		// 아니라면 누적 뺄셈
		}
	}
	
	
	public static void main(String[] args) {
		Method03 m = new Method03();	// 메소드 사용하기 위해 클래스를 객체화함
		
//		예제 15. result를 반환하는 메서드 호출
		int[] nums = {500, 200};
//		배열 사용시 nums 배열을 인수로 보내고 메소드 실행되고 반환된 값 사용
		System.out.println("숫자들의 합은 " + m.sum(nums) + " 입니다.");	
				
//		예제 17. result를 반환하는 메서드 호출 (사용시 변수에 저장)
		int[] studentA = {97, 53};
		int[] studentB = {95, 66};
		 
		int sumA = m.score(studentA);	// 위에서 선언한 학생A의 배열을 넘기고 반환한 값을 변수에 저장
		int sumB = m.score(studentB);	// 위에서 선언한 학생B의 배열을 넘기고 반환한 값을 변수에 저장
		
		if (sumA > sumB) {			// A의 점수가 더 높을 때
			System.out.println("A학생의 중간고사 총점이 더 높습니다.");
		} else if (sumA < sumB) {	// B의 점수가 더 높을 때
			System.out.println("B학생의 중간고사 총점이 더 높습니다.");
		} else {					// A와 B의 점수가 같다면
			System.out.println("두 학생의 중간고사 총점이 같습니다.");
		}

//		예제 19. result로 메서드 종료
		int money = 10000;
		m.take(money);	// 위에서 선언해둔 money 변수를 인수로 take 메소드에 전달
	}
}
