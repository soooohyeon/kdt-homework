package section02;
// 1-3. 출력메소드
// print(), println(), printf() 차이 확인하는 예제
public class Printf02 {
	public static void main(String[] args) {
//		[예제 03.]
		System.out.printf("%5d", 1);	// 서식문자를 사용하여 5칸만큼 데이터를 오른쪽 정렬해서 출력하고 줄바꿈하지 않음
		System.out.println();			// 내용이 없기 때문에 줄바꿈만 함
		System.out.printf("%5d", 12);
		System.out.println();
		System.out.printf("%5d", 123);
		System.out.println();
		System.out.printf("%5d", 1234);
		System.out.println();
		System.out.printf("%5d", 12345);
		System.out.println();
	}
}
