package section07;

// 예제 10.
class Family {
//	클래스 선언 후 해당 클래스 멤버 선언 (필드)
	String name;
	int age;
	String address = "서울";
}

public class ClassTest03 {
	public static void main(String[] args) {
//		예제 11.
		Family father = new Family();	// Family 클래스 타입의 father 라는 참조변수를 가진 객체 생성
		Family son = new Family();		// Family 클래스 타입의 son 이라는 참조변수를 가진 객체 생성
		
		father.address = "인천";				// father 객체의 address 값을 인천으로 수정
		System.out.println(son.address);	// son 객체의 address 값 출력
//		맨처음 초기화해둔 서울 출력됨, father과 son은 각각의 저장공간인 것 확인
	}
}
