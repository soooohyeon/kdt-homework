package section03;
//1-2. 이항 연산자(관계 연산자) : 결과는 true, false만 나옴
public class Oper07 {
	public static void main(String[] args) {
//		[예제 13.]
		int a = 10;
		int b = 20;
		
		System.out.println(a > b);		// a가 b보다 크다?  X
		System.out.println(a >= b);		// a가 b보다 크거나 같다?  X
		System.out.println(a == b);		// a와 b가 같다?  X
		System.out.println(a != b);		// a와 b가 같지 않다? O

//		[예제 14.] : 관계연산자와 단항연산자 순서
		int a2 = 10;
		int b2 = 20;
		
		System.out.println(a2 <= b2);		// b2가 a2보다 크거나 같다? O
		System.out.println(a2 == b2);		// a2와 b2가 같다?  X
//		아래 코드는 연산자의 우선 순위가 중요
//		단항연산자 → 관계연산자
//		즉, --b2 ⇒ b2 = b2 - 1 = 10이 먼저 연산됨 → 그 후 a2 == b2 관계 비교 진행
		System.out.println(a2 != --b2);		// a2와 b2가 같지 않다? X
	}
}
