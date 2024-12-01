package section02;
//2. 변수 - 저장공간과 값 ①
public class Variable03 {
	public static void main(String[] args) {
//		[예제 01.]
		int myAge = 20; 		// 정수형 타입 myAge 변수에 20이라는 값 대입 / myAge : 저장공간
		int yourAge = myAge;	// 정수형 타입 yourAge 변수에 myAge의 값 대입 / myAge : 값
		
		System.out.println(myAge);		// () 안에 있는 myAge의 값을 출력하고 줄바꿈함
		System.out.println(yourAge);	// () 안에 있는 yourAge의 값을 출력하고 줄바꿈함
		

//		[예제 02.]
		int myAge2 = 20;		// 정수형 타입의 myAge 변수에 값 20으로 초기화
		int yourAge2 = 30;	// 정수형 타입의 yourAge 변수에 값 30으로 초기화
		int tempAge;		// 정수형 타입의 tempAge 선언
		
		tempAge = myAge2;	// tempAge에 myAge 값 20 대입 (초기화)
		myAge2 = yourAge;	// myAge에 yourAgedml 값 30 대입
		yourAge2 = tempAge;	// yourAge에 tempAge 값 20 대입
//		이미 초기화된 변수에 새로운 값을 대입하게 되면 새로운 값으로 값이 변경됨
		
		System.out.println(myAge2);		// myAge의 값 출력하고 줄바꿈함
		System.out.println(yourAge2);	// yourAge의 값 출력하고 줄바꿈함
	}
}
