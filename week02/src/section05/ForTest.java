package section05;
//1-1. 제어문(반복문) : for
public class ForTest {
	public static void main(String[] args) {
//		[예제 01.]
		int sum = 0;	// 총합을 저장할 변수 선언 및 초기화
		for (int i = 0; i <= 10; i++) {	// i를 0부터 시작해서 10이 될때까지 1씩 증가하면서 반복
			sum += i;	// sum = sum + i로 총합 변수에 i를 값을 더한 값을 대입함
		}
		System.out.println("합 : " + sum);	// 총합 변수의 값 출력
		
//		[예제 02.]
		int sum2 = 0;	// 총합을 저장할 변수 선언 및 초기화
		for (int i = 1; i <= 100; i++) {	// i를 1부터 시작해서 100이 될때까지 1씩 증가하면서 반복
			if (i % 2 == 0) {	// i를 2로 나누었을 때 나머지가 0이되는 값이 짝수
				sum2 += i;	// sum = sum  + i로 총합 변수에 i를 더한 값을 대입
			}
		}
		System.out.println("합 : " + sum2);	// 총합 변수의 값 출력
	}
}
