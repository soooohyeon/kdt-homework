package section07;

// 예제 12.
class Student {
//	필드
	static String schoolName = "코리아 고등학교";	// 정적 변수 선언
	
//	메소드
	static void goToSchool() {	// 정적 메소드 선언
		System.out.println("학교에 갑니다.");
	}
}

public class ClassTest04 {
	public static void main(String[] args) {
//		예제 13.
		System.out.println(Student.schoolName); // 정적 변수는 객체화를 하지 않더라도 같은 패키지 내에서는 클래스명.멤버로 호출 가능
		Student.goToSchool();	// 정적 멤버는 클래스명.메소드명으로 호출 가능
	}
}
