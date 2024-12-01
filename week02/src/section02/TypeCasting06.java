package section02;
// 4-2. 강제 형변환 : int → byte ⇒ int보다 byte의 크기가 더 작기 때문에 강제형변환 필요
public class TypeCasting06 {
	public static void main(String[] args) {
//		int → byte (범위 내)
		int i = 10;
//		정수형 i 변수의 값인 10은 byte 범위 내여서 강제 형변환을 하더라도 값 손실이 없음
		byte b = (byte)i;
		
		System.out.println("[int → byte] i의 값 : " + i + ", b의 값 : " + b);
		
//		int → byte (범위 밖)
		int j = 1000;
//		정수형 i 변수의 값인 1000은 byte 범위 밖이므로 강제 형변한시 값 손실 발생으로 예상하지 못한 값이 담김
		byte c = (byte)j;
		System.out.println("[int → byte] j의 값 : " + j + ", c의 값 : " + c);
	}
}
