package section03;
//1-2. 이항 연산자(산술 연산자)
public class Oper05 {
	public static void main(String[] args) {
//		[예제 09.]
		int x = 100;
		int y = 200;
		
		System.out.println(x + y);	// 100 + 200
		System.out.println(x - y);	// 100 - 200
		System.out.println(x * y);	// 100 * 200
		System.out.println(x / y);	// 100 / 200로 결과는 0.5가 나오나 정수형이므로 0 출력
		System.out.println(x % y);	// 100 % 200 : 나머지 출력
		
//		[예제 10.] : 실수 + 정수 연산
		double num1 = 1.2345;
		int num2 = 6;
		System.out.println(num1 + num2);	// 실수 + 정수는 정수가 실수로 형변환하여 연산됨
		
//		[예제 11.]
		int result = 100000 * 1000000;	// 자료형 int의 표현범위를 넘어가 엉뚱한 값이 나옴
		System.out.println(result);
	}
}
