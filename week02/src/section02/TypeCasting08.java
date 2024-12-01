package section02;
// 4-2. 강제 형변환 : 정수 → 실수
public class TypeCasting08 {
	public static void main(String[] args) {
//		float → int
//		float과 int는 4byte로 크기 같지만 float에서 int로 형변환시 소수점이 이하 값이 사라져서 데이터 손실 발생
//		해서 형변환시 강제 형변환으로 진행해야함
		float f1 = 12345.67f;
		int i1 = (int)f1;
		System.out.println("[float → int] f1의 값 : " + f1 + ", i1의 값 : " + i1);
		
//		double → int
//		소수점 이하 값이 사라지므로 소수점 이하 데이터 손실이 발생됨
//		해서 형변환시 강제 형변환으로 진행
		double d1 = 12345.678;
		int i2 = (int)d1;
		System.out.println("[double → int] d1의 값 : " + d1 + ", i2의 값 : " + i2);
		
		
	}
}
