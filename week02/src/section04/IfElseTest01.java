package section04;
//1-2. 제어문(조건문) : if-else ①
public class IfElseTest01 {
	public static void main(String[] args) {
//		[예제 03.]
		int num = 5;
		if (num > 4) {
			System.out.println(num + "은/는 5보다 큽니다.");
		} else {
			System.out.println(num + "은/는 5보다 작습니다.");
		}

//		[예제 04.]
		int a = 4;
		int b = 10;
		
		if (a > b) {	// 조건식이 true 라면 아래 코드 실행
			System.out.println("a가 b보다 큽니다");
		} else {		// 조건식이 false 라면 아래 코드 실행
			System.out.println("a가 b보다 작거나 같습니다");
		}
	}
}