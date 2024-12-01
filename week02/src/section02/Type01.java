package section02;
// 3. 자료형 타입 - 정수형 ①
public class Type01 {
	public static void main(String[] args) {
//		[예제 01.]
		byte num1 = 20;		// 정수형 byte 타입 변수 num1을 생성하고 값 20 대입
//		byte num5 =  128;	// 에러 발생 : byte의 범위를 벗어나기 때문에 저장 불가
		short num2 = 30;	// 정수형 short 타입 변수 num2을 생성하고 값 30 대입
		int num3 = 40;		// 정수형 int 타입 변수 num3을 생성하고 값 40 대입
		long num4 = 50;		// 정수형 long 타입 변수 num4을 생성하고 값 50 대입
//		long 타입이나 int의 범위 내라면 L을 붙이지 않아도 됨
		
		System.out.println(num1);	// num1의 값을 출력하고 줄바꿈함
		System.out.println(num2);	// num2의 값을 출력하고 줄바꿈함
		System.out.println(num3);	// num3의 값을 출력하고 줄바꿈함
		System.out.println(num4);	// num4의 값을 출력하고 줄바꿈함
		
//		[예제 02.]
		byte num6 = 0110;		// 정수형 byte 타입 변수 num1을 생성하고 값 72 대입
		short num7 = 0107;		// 정수형 short 타입 변수 num2을 생성하고 값 71 대입
		int num8 = 0x46;		// 정수형 int 타입 변수 num3을 생성하고 값 70 대입
		long num9 = 69L;		// 정수형 long 타입 변수 num4을 생성하고 값 69 대입
//		10진수가 아닌 2진수, 8진수, 16진수의 형태로 값을 대입하더라도 기본적인 출력 형태는 10진수
		
		System.out.println(num6);	// num1의 값을 출력하고 줄바꿈함
		System.out.println(num7);	// num2의 값을 출력하고 줄바꿈함
		System.out.println(num8);	// num3의 값을 출력하고 줄바꿈함
		System.out.println(num9);	// num4의 값을 출력하고 줄바꿈함
	}
}
