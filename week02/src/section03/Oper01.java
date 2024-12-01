package section03;
//1-1. 단항 연산자(부호 연산자)
public class Oper01 {
	public static void main(String[] args) {
//		[예제 01.]
		int x = 100;
		int resultPlus = +x;	// x의 값에 부호 변경해서 정수형 값 담기
		int resultMinus = -x;	// x의 값에 부호 변경해서 정수형 값 담기
		
		System.out.println(resultPlus);	// 변수의 값 출력
		System.out.println(resultMinus);
		
//		[예제 02.]
		double d = 1.11;	
		double result = -d;	// d의 값에 부호 변경해서 실수형 값 담기
		
		System.out.println(d);	// 변수의 값 출력
		System.out.println(result);
	}
}
