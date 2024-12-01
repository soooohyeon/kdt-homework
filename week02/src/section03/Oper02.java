package section03;
//1-1. 단항 연산자(증감 연산자) : 전위형과 후위형 ①
public class Oper02 {
	public static void main(String[] args) {
//		[예제 03.]
		int num = 10;
		System.out.println(num);	// num의 값 출력
		num++;	// num의 값에 + 1하고 num 변수에 대입
		System.out.println(num);	// num의 변경된  값 출력
		
//		[예제 04.]
		int num2 = 20;
		System.out.println(num2++);	// num2의 값이 출력된 후 num2의 값에 + 1하고 num2 변수에 대입
		System.out.println(num2);	// num2의 변경된 값 출력
		
//		[예제 05.]
		int num3 = 30;
		System.out.println(++num3);	// num3의 값에 + 1하고 num3 변수에 대입 후 그 값 출력
		System.out.println(num3);	// 이미 위에서 변경이 된 값을 출력한 것이라 같은 값 출력
		
		System.out.println(num3++);	// num3의 값이 출력된 후 num3의 값에 + 1하고 num3 변수에 대입
		System.out.println(num3);	// num3의 변경된 값 출력
	}
}
