package section07;

// 예제 07, 08. public 키워드를 제외하고 클래스 선언
class Car2 {
//	필드
	int wheel;
	
//	메소드
	void ride () {
		System.out.println("달립니다.");
		System.out.println("씽씽씽");
	}
}
public class ClassTest02 {
	public static void main(String[] args) {
//		예제 09.
		Car2 c = new Car2();	// Car 클래스 내부에 메소드를 사용하기 위해 생성자를 사용해서 객체화
		c.ride();			// Car 클래스 ride() 메소드 사용
		c.ride();
		c.ride();
	}
}
