package section02;
//3. 자료형 타입 - 문자형
public class Type03 {
	public static void main(String[] args) {
//		[예제 01.]
		char ga = '가';			// 문자형 타입의 변수에 값 대입
		char na = '나';
		char alphabetA = 'A';
		char alphabetB = 'B';
		
		System.out.println(ga);		// () 안 변수의 값을 출력하고 줄바꿈함
		System.out.println(na);
		System.out.println(alphabetA + ", " + alphabetB);	// () 안 변수의 값을 문자열로 연결해서 출력하고 줄바꿈함
		
//		[예제 02.]
		int ga2 = '가';			// 정수형 타입 변수에 유니코드 값 44032 담기
		int na2 = '나';			// 정수형 타입 변수에 유니코드 값 45208 담기
		int alphabetA2 = 'A';	// 정수형 타입 변수에 유니코드 값 65 담기
		int alphabetB2 = 'B';	// 정수형 타입 변수에 유니코드 값 66 담기
//		해서 char형을 문자형이기 전에 정수형이라고 표현한다고 함
		
		System.out.println(ga2);			// ()안에 담기 변수의 값 출력하고 줄바꿈함
		System.out.println(na2);
		System.out.println(alphabetA2);
		System.out.println(alphabetB2);
		
//		[예제 03.]
		int alphabetA3 = 'A';	// 정수형 타입 변수에 유니코드인 A의 숫자가 담김
		int alphabetB3 = 'B';	// 정수형 타입 변수에 유니코드인 B의 숫자가 담김
		System.out.println(alphabetA3);	
		System.out.println(alphabetB3);
		
		char alphabetC3 = 67;	// 문자형 타입 변수에 유니코드인 67의 문자가 담김	
		System.out.println(alphabetC3);
	}
}
