package section04;
import java.util.Scanner;
//1-1. 제어문(조건문) : if
public class IfTest {
	public static void main(String[] args) {
//		[예제 01.]
		int result = 0;
		if (3 > 2) {	// 3이 2보다 크면 중괄호 안 코드 실행함
			result = 3;	// result 변수에 3 대입
		}
		System.out.println(result);
		
//		[예제 02.]
		Scanner sc = new Scanner(System.in);	// Scanner 메소드를 사용하기 위해 클래스 import
		
		System.out.print("나이 압력 : ");			// 입력받을 값에 대한 출력메세지
		int age = sc.nextInt();					// 정수형 타입의 변수를 생성하고 입력받은 값을 대입함
		if (age > 19) {							// 입력받은 값이 19보다 크다면 true
			System.out.println("성인입니다.");		// 결과가 true라면 '성인입니다' 출력
		}
		System.out.println("프로그램을 종료합니다.");// 마지막 프로그램 종료 문구 출력		
	}
}
