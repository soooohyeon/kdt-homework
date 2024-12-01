package section02;
//4. 형변환 : 정수에서 정수로의 형변환
public class TypeCasting02 {
	public static void main(String[] args) {
		int i1 = 10;		// 정수형 타입의 변수에 값 담기
		byte b1 = (byte)i1;	// 바이트 타입의 변수에 바이트로 타입 변경해서 값 담기
		System.out.println(b1);	// 변수의 값 출력
		
		int i2 = 128;		// 정수형 타입의 변수에 값 담기
		byte b2 = (byte)i2;	// 바이트 타입의 변수에 바이트로 타입 변경해서 값 담기
		System.out.println(b2);	// 바이트 타입에서 표현할 수 있는 숫자의 크기가 넘어감 = 오버플로우
								// 해서 제일 작은 수로 바뀌어서 값이 들어감
	}
}
