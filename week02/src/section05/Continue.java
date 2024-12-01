package section05;
//3-1. 제어문(기타 제어문) : continue문
public class Continue {
	public static void main(String[] args) {
		int sum = 0;	// 총합 변수 선언 및 초기화
		for (int i = 1; i <= 100; i++) {	// i를 1부터 시작해서 100이 될때까지 반복
			if (i % 2 != 0) {				// i를 2로 나누었을때 0이 아닌 것,
				continue;					// 즉, 홀수라면 해당 반복은 통과 후 다음 반복 실행
			}
			sum += i;						// 위 if문이 false라면 sum = sum + i, 총합 변수에 i를 더함
		}
		System.out.println("짝수의 합 : " + sum);		// 총합 결과 출력
	}
}
