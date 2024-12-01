package section02;
//3. 자료형 타입 - 실수형
public class Type02 {
	public static void main(String[] args) {
//		[예제 01.]
		double marathon = 42.195;		// 실수형 타입의 marathon 변수를 생성하고 값 대입
		float halfMarathon = 21.0975f;	// 실수형 타입의 halfMarathon 변수를 생성하고 값 대입
//		정수형 long 타입처럼 값 뒤에 f 붙여서 사용
		
		System.out.println("마라톤은 " + marathon + "km를 달립니다.");			//	() 안을 출력하고 줄바꿈함
		System.out.println("하프마라톤은 " + halfMarathon + "km를 달립니다.");	//	() 안을 출력하고 줄바꿈함

//		[예제 02.]
		double pieDouble = 3.141592653589793;	// 실수형 double 타입 변수 선언 및 초기화
		float pieFloat = 3.141592653589793f;	// 실수형 float 타입 변수 선언 및 초기화
		
		System.out.println("double : " + pieDouble);	// () 안 데이터 출력하고 줄바꿈함, 소수점 15번째까지 출력
		System.out.println("float : " + pieFloat);		// () 안 데이터 출력하고 줄바꿈함, 소수점 7번째까지 출력
//		double과 float은 정밀도 차이로 기본적으로 double을 사용함.
	}
}