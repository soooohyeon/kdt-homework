package section09;

// 예제 11.
class Book {
//	필드
	String title = "제목 없음";
	int series = 1;
	int page = 100;
	

	Book() {					//	생성자 1
		
	}
	Book(String t) {			// 생성자 2 - 매개변수가 1개인 생성자, 생성자 오버로딩
		title = t;
	}
	Book(String t, int p) {		// 생성자 3 - 매개변수가 2개인 생성자, 생성자 오버로딩
		title = t;
		page = p;
	}
	Book(int s, String t) {		// 생성자 4 - 매개변수의 자료형의 순서가 다른 생성자, 생성자 오버로딩
		series = s;
		title = t;
	}
}
public class Constructor04 {
	public static void main(String[] args) {
//		예제 12.
		Book b1 = new Book();	// 생성자 1 사용
		 System.out.println("b1.title : " + b1.title);		// 설정되어 있는 초기화 값으로 출력됨
		 System.out.println("b1.series : " + b1.series);
		 System.out.println("b1.page : " + b1.page);

		 Book b2 = new Book("멘토시리즈 자바");	// 생성자 2 사용
		 System.out.println("b2.title : " + b2.title);		// 생성자 2를 사용하여 title 초기화
		 System.out.println("b2.series : " + b2.series);	// 설정되어 있는 초기화 값으로 출력됨
		 System.out.println("b2.page : " + b2.page);
		 
		 Book b3 = new Book("신데렐라", 170);	// 생성자 3 사용
		 System.out.println("b3.title : " + b3.title);		// 생성자 3을 사용하여 title 초기화
		 System.out.println("b3.series : " + b3.series);	// 설정되어 있는 초기화 값으로 출력됨
		 System.out.println("b3.page : " + b3.page);		// 생성자 3을 사용하여 page 초기화
		 
		 Book b4 = new Book(5, "노인과 바다");	// 생성자 4 사용, 초기화에 사용할 생성자의 매개변수 순서를 맞춰서 입력해야함
		 System.out.println("b4.title : " + b4.title);		// 생성자 3을 사용하여 title 초기화
		 System.out.println("b4.series : " + b4.series);	// 생성자 3을 사용하여 series 초기화
		 System.out.println("b4.page : " + b4.page);		// 설정되어 있는 초기화 값으로 출력됨
		
	}
}
