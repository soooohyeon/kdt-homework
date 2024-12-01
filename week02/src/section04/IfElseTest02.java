package section04;

import java.util.Scanner;
//1-2. 제어문(조건문) : if-else ②
public class IfElseTest02 {
	public static void main(String[] args) {
//		[예제 05.]
		int a = 4;
		int b = 10;
		int max = 0;
		
		if (a > b) {
			max = a;
		} else {
			max =b;
		}
		System.out.println(a + "와 " + "b 중에 큰 수는 " + max + "입니다.");

//		[예제 06.]
//		입력 메소드를 사용하기 위해 입력 클래스 import
		Scanner sc = new Scanner(System.in);
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();
		if (age > 19) {	// 입력받은 비밀번호 값이 19보다 클때 아래 코드 실행
			System.out.println("성인입니다");
		} else {			// 위 조건식이 거짓일 때 아래 코드 실행
			System.out.println("미성년자입니다");
		}
		sc.close();
	}
}
