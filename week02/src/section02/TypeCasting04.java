package section02;
// 4. 형변환 : 정수와 실수 간의 형변환
public class TypeCasting04 {
	public static void main(String[] args) {
//		실수 → 정수
		double pie = 3.14;			// 실수형 타입의 변수에 값 담기
		int pieInt = (int)pie;		// 정수형 타입의 변수에 실수형 값을 정수형으로 변환해서 담기
		System.out.println(pieInt);	// 변수의 값 출력
		
//		정수 → 실수 (범위 내)
		int num = 100;				// 정수형 타입의 변수에 값 담기
		double numD = (double)num;	// 실수형 타입의 변수에 정수형 값을 실수형으로 변환해서 담기
		float numF = (float)num;	// 실수형 타입의 변수에 정수형 값을 실수형으로 변환해서 담기
		System.out.println(numD);	// 변수의 값 출력
		System.out.println(numF);
		
//		정수 → 실수 (범위 밖)
		int i = 99999999;
		float f = (float)i;		// 정수형 값을 실수형으로 변환해서 값 대입 / 범위가 벗어나서 전혀 다른 값이 담김
		System.out.println(f);	// 1.0E8 출력
	}
}
