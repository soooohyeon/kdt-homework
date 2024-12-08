package section07;

// 예제 01, 02. 클래스 선언
class Cat {	
	
}

// 예제 05. public 키워드를 제외하고 클래스 선언
class Car {
//	필드 선언
	int wheel = 4;
}

public class ClassTest01 {	// public 키워드는 파일 이름과 동일한 클래스만 사용
	public static void main(String[] args) {
//		예제 03, 04 클래스 선언 후 해당 클래스 객체화하기 위함
		Cat cat = new Cat();	// 클래스 객체화 (인스턴스화)
		
//		예제 06.
		Car car = new Car();	// Car 클래스 내부 멤버를 사용하기 위해 객체화
		System.out.println("wheel의 개수는 " + car.wheel + "개 입니다.");	// Car 클래스 필드 출력
		
		car.wheel = 5;	// Car 클래스 필드 개수 변경
		System.out.println("wheel의 개수는 " + car.wheel + "개 입니다.");	// Car 클래스 필드 출력
	}
}
