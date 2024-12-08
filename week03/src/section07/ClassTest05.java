package section07;

// 예제 14.
class Student2 {
//	필드
	static String schoolName = "코리아 고등학교";	// 정적 변수 선언
	String studentName;	// 인스턴스 변수 선언
	
//	메소드
	static void goToSchool() {	// 정적 메소드 선언
		System.out.println("오늘은 학교에 가는 날입니다.");
	}
	void hello() {	// 인스턴스 메소드 선언
		System.out.println("안녕하세요, 제 이름은 " + studentName + "입니다.");
	}
}

public class ClassTest05 {
	public static void main(String[] args) {
//		예제 15.
		Student2 st1 = new Student2();	// 참조변수 명이 st1인 Student2 클래스의 객체 생성
		st1.studentName = "김고이";		// st1 객체에 studentName에 김고이로 값 초기화
		st1.hello();					// st1에 메소드 사용, st1의 studentName의 저장된 값 출력
		System.out.println("학교는 " + Student2.schoolName + "입니다.");	// 정적 변수로 클래스명으로 호출 가능
		Student2.goToSchool();			// Student2의 메소드 호출, 정적 메소드로 클래스명으로만 호출 가능
		
		Student2 st2 = new Student2();	// 참조변수 명이 st2인 Student2 클래스의 객체 생성
		st2.studentName = "김고삼";		// st2 객체에 studentName에 김고삼으로 값 초기화
		st2.hello(); 					// st2에 메소드 사용, st2의 studentName의 저장된 값 출력
		System.out.println("학교는 " + Student2.schoolName + "입니다.");	//  정적 변수로 클래스명으로 호출 가능
		Student2.goToSchool();			// Student2의 메소드 호출, 정적 메소드로 클래스명으로만 호출 가능
	}
}
