package section05;
//2-1. 제어문(반복문) : while문
public class While {
	public static void main(String[] args) {
		int sum = 0;	// 총합 변수 선언 및 초기화
		int i = 0;		// 누적합할 변수 선언 및 초기화
		
		while (i <= 10) {	// i가 10보다 작을때 까지 반복
			sum += i;		// sum = sum + i, 총합 변수에 i를 더함
			i++;			// i = i + 1, 즉 i에 1 더함
		}
		
		System.out.println("합 : " + sum);	// 총합 결과 출력
	}
}
