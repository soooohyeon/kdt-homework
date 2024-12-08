package section09;

// 예제 05.
class Person {
//	필드
	String name;
	int age;
	
//	매개변수 2개를 받는 생성자 생성
	Person (String n, int a) {
		name = n;
		age = a;
	}
	
//	메소드
	void introduce() {
		System.out.println("안녕하세요. 저는 " + age + "세 " + name + "입니다.");
	}
}

public class Constructor02 {
	public static void main(String[] args) {
//		예제 06.
		Person p1 = new Person("김자바", 20);		// Person 클래스 객체 생성 및 초기화
		Person p2 = new Person("이코딩", 40);		// Person 클래스 객체 생성 및 초기화
		
		p1.introduce();		// 객체 p1의 메소드 호출
		p2.introduce();		// 객체 p2의 메소드 호출
	}
}
