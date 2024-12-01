package section03;
//1-1. 단항 연산자(논리 부정 연산자)
public class Oper04 {
	public static void main(String[] args) {
		boolean isHuman = false;
//		isHuman의 값인 false의 부정
//		즉, true가 출력됨
		System.out.println(!isHuman);
//		논리 부정 연산자는 적용한 곳에만 사용될 뿐 값 자체가 변경되지 않음
//		즉, false 출력됨
		System.out.println(isHuman);
	}
}
