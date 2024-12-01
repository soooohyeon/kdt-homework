package section02;

import java.util.Scanner;

//5. 입력 클래스와 입력 메소드
public class Scanner02 {
	public static void main(String[] args) {
//		입력메소드를 사용하기 위해 입력클래스 import
		Scanner sc = new Scanner(System.in);
//		입력받을 값들을 담을 변수 각각 선언
		String name, address;
		int age;
		double weight;
		
//		어떠한 값을 입력받아야 하는지 알기 위해 출력 메세지 작성
		System.out.print("이름 주소, 나이, 체중을 빈칸으로 구분하여 순서대로 입력 : ");
//		이름과 주소는 문자열 입력 메소드
		name = sc.next(); 
		address = sc.next();
//		나이는 정수형 입력 메소드
		age = sc.nextInt();
//		몸무게는 실수형 입력 메소드
		weight = sc.nextInt();
//		next(), nextInt(), nextDouble()은 엔터값을 소모하지 않음
//		입력 메소드를 다 사용하면 입력 클래스 종료
		sc.close();
		
//		각각의 변수의 자료형 타입에 맞는 서식문자 사용
//		%s는 문자열, %d는 정수형, %f는 실수형 (f앞에 .n은 소수점 이하 n번째까지 출력으로 지정)
//		서식문자 출력메소드 사용시에는 \n이 아닌 %n도 사용가능
		System.out.printf("당신의 이름은 %s입니다%n", name);
		System.out.printf("당신의 주소는 %s입니다%n", address);
		System.out.printf("당신의 이름은 %d입니다%n", age);
		System.out.printf("당신의 이름은 %.1f입니다%n", weight);
		
		
	}

}
