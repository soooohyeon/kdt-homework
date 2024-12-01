package section02;
// 4. 형변환 : 형변환의 기본구조 보기
public class TypeCasting01 {
	public static void main(String[] args) {
		int num1 = 11;		// 정수형 타입의 변수에 값 담기
		double num2 = 3.14;	// 실수형 타입의 변수에 값 담기
		double num1Change = (double)num1;	// 실수형 타입의 변수에 정수형 타입의 값을 실수로 변환해서 담기
//		다른 자료형의 타입을 원하는 자료형의 타입으로 변경해서 값 담음
		
		System.out.println("num1 : " + num1);	// () 안 변수의 값 출력하고 줄바꿈함
		System.out.println("num1Change : " + num1Change);
		System.out.println(num1Change + num2);	// 실수 + 실수 = 실수형 타입의 값 출력
		System.out.println((int)1.23);			// 실수형 타입이나 정수형으로 형변환함 → 반올림해서 1 출력
	}
}
