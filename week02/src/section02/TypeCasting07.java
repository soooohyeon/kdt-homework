package section02;
// 4-2. 강제 형변환 : double → float ⇒ double보다 float의 크기가 더 작기 때문에 강제형변환 필요
public class TypeCasting07 {
	public static void main(String[] args) {
//		double → float (범위 내)
		double d1 = 1.1234;
		float f1 = (float)d1;	// 범위내이기 때문에 d1과 f1의 값이 같음
		System.out.println("[double → float] d1의 값 : " + d1 + ", f1의 값 : " + f1);
		
//		double → float (최소보다 작은 경우)
		double d2 = 1.0e-50;
		float f2 = (float)d2;	// 출력 가능한 최소 범위보다 작기 때문에 0.0이 담김
		System.out.println("[double → float] d2의 값 : " + d2 + ", f2의 값 : " + f2);
		
//		double → float (최대보다 큰 경우)
		double d3 = 1.0e100;
		float f3 = (float)d3;	// 출력 가능한 최대 범위보다 크기 때문에 무한대의 값인 Infinity가 담김
		System.out.println("[double → float] d3의 값 : " + d3 + ", f3의 값 : " + f3);
		
//		double → float (정밀도 차이)
		double d4 = 9.123456789;	// double은 소수점 15자리까지 표현가능
		float f4 = (float)d4;		// float은 소수점 6-7자리까지만 표현가능하기때문에 뒤 소수점이 반올림됨
		System.out.println("[double → float] d4의 값 : " + d4 + ", f4의 값 : " + f4);
	}
}
