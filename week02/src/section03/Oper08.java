package section03;
//1-2. 이항 연산자(논리 연산자) : 결과는 true, false만 나옴
public class Oper08 {
	public static void main(String[] args) {
//		[예제 15.]
		boolean b1 = true;
		boolean b2 = false;
		boolean b3 = true;
		boolean b4 = false;
		
		System.out.println("---- 논리곱 ----");
//		&& (AND) : 두 항이 모두 true일 때, true
		System.out.println(b1 && b2);	// true && false	⇒ 결과 : false
		System.out.println(b1 && b3);	// true && true		⇒ 결과 : true
		System.out.println(b2 && b4);	// false && false	⇒ 결과 : false
		System.out.println();	// 콘솔에 출력할 값이 많을 경우 가독성을 위해 출력
		
		System.out.println("---- 논리합 ----");
//		|| (OR) : 둘 중 하나라도 true일 때, true
		System.out.println(b1 || b2);	// true || false	⇒ 결과 : true
		System.out.println(b1 || b3);	// true || true		⇒ 결과 : true
		System.out.println(b2 || b4);	// false || false	⇒ 결과 : false
		System.out.println();
		
		System.out.println("---- 베타적 논리합 ----");
//		^ (XOR) : 두 항이 다르면 true, 같으면 false
		System.out.println(b1 || b2);	// true || false	⇒ 결과 : true
		System.out.println(b1 || b3);	// true || true		⇒ 결과 : false
		System.out.println();
		
		System.out.println("---- 부정 ----");
//		! (NOT) : 단항 연산자이지만 논리형의 값을 반대로 바꿔줌 (true → false, false → true)
		System.out.println(!b1);		// true		⇒ 결과 : false
		System.out.println(!b2);		// false	⇒ 결과 : true
	}

}
