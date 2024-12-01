package section04;

import java.util.Scanner;

//1-3. 제어문(조건문) : if-else if
public class IfElseIfTest {
	public static void main(String[] args) {
//		[예제 07.]
		int favorite = 7;
		
		if (favorite < 5) {			// favorite 변수의 값은 7, 조건식이 false이므로 아래 실행문 실행하지 않고 통과
			System.out.println("좋아하는 숫자가 5보다 작습니다.");
		} else if (favorite > 5) {	// favorite 변수의 값은 7, 조건식이 true이므로 아래 실행문 실행하고 if문 그대로 종료
			System.out.println("좋아하는 숫자가 5보다 큽니다.");
		} else {					// 위 조건식들이 전부 false일 때 실행이나 위 조건식에서 true가 나왔으므로 실행하지 않음
			System.out.println("좋아하는 숫자가 5입니다.");
		}
		
//		[예제 08.]
		if (favorite > 5) {			// favorite 변수의 값은 7, 조건식이 true이므로 아래 실행문 실행하고 if문 그대로 종료
			System.out.println("좋아하는 숫자가 5보다 큽니다.");
		} else if (favorite == 7) {	// 조건식은 true 이나 위 조건식에서 true로 이미 if문이 종료되어 아래 코드는 실행되지 않음
			System.out.println("좋아하는 숫자는 7입니다.");
		}
		
//		[예제 09.]
		Scanner sc = new Scanner(System.in);	// 입력메소드를 사용하기 위해 입력클래스 import
		System.out.print("나이 입력 : ");			// 어떠한 값을 입력받을지 안내하는 출력 메세지
		int age = sc.nextInt();					// 나이 입력받고 변수에 값 대입
		if (age > 19) {							// 입력받은 값이 true라면 {}안 코드 실행, false라면 통과
			System.out.println("성인입니다.");
		} else if (age > 13) {					// 위 조건식보다 작지만 해당 줄 조건식이 true라면 {}안 코드 실행, false라면 통과
			System.out.println("청소년입니다.");
		} else if (age > 6) {					// 위 조건식보다 작지만 해당 줄 조건식이 true라면 {}안 코드 실행, false라면 통과
			System.out.println("어린이입니다.");
		} else {								// 위 조건식이 전부 false로 통과되면 {}안 코드 실행
			System.out.println("유아입니다.");
		}
		sc.close();		// 입력받을 값이 더 이상 없으므로 입력클래스 종료
	}
}
