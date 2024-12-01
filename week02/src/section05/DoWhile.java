package section05;
//2-2. 제어문(반복문) : do-while문
public class DoWhile {
	public static void main(String[] args) {
		int sum = 0;	// 총합 변수 선언 및 초기화
		int i = 0;		// 누적합할 변수 선언 및 초기화
		
		do {				// {} 안 코드 무조건 한번 실행
			sum += i;		// sum = sum + i, 총합 변수에 i를 더함
			i++;			// i = i + 1, 즉 i에 1 더함
		} while (i <= 10);	// 조건문이 false가 나올때까지 반복

		System.out.println("합 : " + sum);	// 총합 결과 출력
	}
}
