package section02;
// 4-1. 자동 형변환
public class TypeCasting05 {
	public static void main(String[] args) {
//		[예제 01.]
		int num1 = 14;
		double num2 = 3.14;
		 
//		실수형 double이 정수형 int보다 크기가 커서 자동으로 double 타입으로 형변환된 값이 담김
		double num3 = num1;
//		정수형 int가 실수형 double보다 크기가 작으므로 자동으로 형변환 안됨 / 형변환을 '강제'로 해줘야함
		int num4 = (int)num2;
		
		System.out.println(num4);	// 출력결과 3
		
//		[예제 02.]
		int i = 100;
		char c = 'a';
		int j = c;		// char 타입은 int 타입보다 작으므로 자동형변환돼서 값이 담김
		double d = i;	// int 타입은 double 타입보다 작으므로 자동형변환돼서 값이 담김
		
		System.out.println("int형 변수 j의 값 : " + j);
		System.out.println("double형 변수 d의 값 : " + d);
	}
}
