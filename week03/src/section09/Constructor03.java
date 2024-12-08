package section09;

// 예제 07.
class Phone {
//	필드
	String brand;
	int series;
	String color = "검정색";
	
//	생성자
	Phone (String b, int s, String c) {	// 매개변수 3개 받는 생성자
		brand = b;
		series = s;
		color = c;
	}
	
//	예제 09. 생성자 추가
	Phone (String b, int s) {	// 매개변수 2개 받는 생성자, 생성자 오버로딩
		brand = b;
		series = s;
	}
	
//	메소드
	void phoneInfo() {
		System.out.println(color + " " + brand + " " + series);
	}
}
public class Constructor03 {
	public static void main(String[] args) {
//		예제 08.
		Phone p1 = new Phone("갤럭시", 1, "흰색");	// 객체 생성
//		Phone p2 = new Phone("아이폰", 2);		// 생성자의 매개변수와 개수가 달라 컴파일 오류 발생
		
//		예제 10.
		Phone p2 = new Phone("아이폰", 2);		// 2개 받는 생성자와 자동매칭
		
		p1.phoneInfo();		// 객체 p1의 메소드 호출
		p2.phoneInfo();		// 객체 p2의 메소드 호출, color 필드에는 기존에 설정해둔 값 출력됨
		
	}
}
