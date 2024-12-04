package section08;
// 멘토시리즈 자바 예제 01-05
public class Method01 {
//	예제 01. 출력하는 메소드 생성
	void printHello() {	// 해당 메소드 사용시 아래 2줄 출력
		System.out.println("안녕하세요.");
		System.out.println("만나서 반갑습니다.");
	}
	
//	예제 02. 출력하는 메소드 생성 / Method02.java 파일 확인
	void run() {
		System.out.println("run run run");
	}
	
//	예제 04. 클래스안에 사용된 변수와 메소드 다른 클래스 파일에서 사용하기 / Method02.java 파일 확인
	String name;	// 필드에 선언된 변수
	
	void sayName () {
//		필드에 선언된 변수에 저장된 값 출력
		System.out.println("제 이름은 " + name + "입니다.");
	}
	
	public static void main(String[] args) {
		Method01 m = new Method01();	// 메소드 사용하기 위해 클래스를 객체화함
//		예제 01.
		m.printHello();	// 메소드 사용
		
//		예제 03.
		m.run();	// run으로 정의해둔 메소드 실행(사용)
		
//		예제 05. 메소드 호출하고 변수 사용
		m.name = "김철수";	// 클래스필드에 선언된 변수 
		m.sayName();
		m.run();
		
	}
	
}
