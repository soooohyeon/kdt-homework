package section02;
// 4. 형변환 : 크기가 큰 실수형에서 크기가 작은 실수형으로의 형변환
public class TypeCasting03 {
	public static void main(String[] args) {
		double d1 = 1.0e100;	// 1.0*(10의 100승)
		float f1 = (float)d1;	// d1의 값 형변환시 float의 최대 표현 값을 넘음
		System.out.println(f1);	// Infinity 라는 무한대의 값 출력
		
		double d2 = 1.0e-100;	// 1.0*(10의 -100승)
		float f2 = (float)d2;	// d2의 값을 형변환시 float의 최소 표현 값을 넘음
		System.out.println(f2);	// 0.0이라는 값 출력
	}
}
