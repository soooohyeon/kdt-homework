package section03;
//1-3. 삼항 연산자
public class Oper09 {
	public static void main(String[] args) {
//		[예제 16] ⇒ 예제 17번을 삼항 연산자로 한 줄로 표현
		int num = (7 > 1) ? 1 : 2;	// 7 > 1의 조건식이 true 이므로 1이 선택됨, 정수형 num 변수에 1이 담김
		System.out.println(num);
		
//		[예제 17.] ⇒ 예제 16번을 if문으로 풀어서 표현
		int num2 = 0;
		if (7 > 1) {	// 조건식이 true라면 아래 코드 실행 후 if문 종료
			num = 1;
		} else {		// 위 조건식이 false라면 아래 코드 실행 후 if문 종료
			num = 2;
		}				// num 변수에 1이 담기게 됨
		System.out.println(num);
		
	}
}
