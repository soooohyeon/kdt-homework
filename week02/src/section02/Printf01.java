package section02;
// 1-3. 출력메소드
// print(), println(), printf() 차이 확인하는 예제
public class Printf01 {
	public static void main(String[] args) {
//		[예제 01.]
//		서식문자를 사용하여 데이터를 출력하고 줄바꿈하지 않음
		System.out.printf("저는 대학교 %d학년에 재학중입니다!", 3);
		
//		[예제 02.]
//		서식문자를 사용하여 차례대로 데이터를 출력하고 줄바꿈하지 않음
		System.out.printf("%d은 첫 번째, %f은 두 번째, %s은 세 번쨰.", 1, 2.0, "셋");
	}
}
