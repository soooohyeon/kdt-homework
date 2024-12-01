package section03;
//1-1. 단항 연산자(증감 연산자) : 전위형과 후위형 ②
public class Oper03 {
	 public static void main(String[] args) {
//		 [예제 06.] : 증감 연산자 위치에 따른 결과
		 int x = 1;
		 
		 System.out.println(x++);	// x의 값이 출력된 후 x의 값 + 1에 대한 결과값이 x에 대입
		 System.out.println(x);		// 변경된 x의 값 출력
		 System.out.println(++x);	// 변경된 x의 값 + 1에 대한 결과값이 x에 대입 후 그 값이 출력
		 
//		 [예제 07.] : 문자형에도 증감 연산자 적용 가능
		 char alphabetX = 'X';	// → 유니코드 값으로 88
//		 alphabet 변수의 값 먼저 출력 후 위 유니코드에 88 + 1 = 89로 그 값이 변수에 담김, 89 = Y로 계산
		 System.out.println(alphabetX++);
//		 위에서 변경된 값 출력 : Y
		 System.out.println(alphabetX);
		 
//		 [예제 - 혼자 풀어보는 문제]
		 int num1 = 100;
		 
		 System.out.println(num1++);
		 System.out.println(++num1);
		 System.out.println(++num1);
	}
}
