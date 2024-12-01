package section02;
// 1-3. 출력메소드
// print(), println(), printf() 차이 확인하는 예제
public class Printf03 {
	public static void main(String[] args) {
//		[예제 04.]
		System.out.printf("%.1f", 1.1234567);	// 서식문자를 사용하여 f앞 숫자만큼 소수점 이하 데이터를 출력하고 줄바꿈하지 않음
		System.out.println();					// 내용이 없기 때문에 줄바꿈만 함
		System.out.printf("%.2f", 1.1234567);
		System.out.println();
		System.out.printf("%.3f", 1.1234567);
		System.out.println();
		System.out.printf("%.4f", 1.1234567);
		System.out.println();
		System.out.printf("%.5f", 1.1234567);
		System.out.println();
	}
}
