package section05;
//1-2. 제어문(반복문) : 이중 for문 ①
public class TwoFor01 {
	public static void main(String[] args) {
		for (int i = 2; i <= 9; i++) {	// (행) i를 2부터 9가 될때까지 1씩 증가하면서 반복
			for (int j = 1; j <= 9; j++) {	// (열) i의 조건식이 true일때 j가 1부터 9가 될 때까지 1씩 증가하며 반복
											//	즉, i = 2일 때 j = 1 ~ 9까지 반복, i = 3일 때 j = 1 ~ 9, ...
				System.out.print(i + " x " + j + " = " + (i * j) + "\t");	// \t을 사용하여 칸 맞춤
			}
			System.out.println();	// 단이 끝나면 줄바꿈
		}
	}
}
