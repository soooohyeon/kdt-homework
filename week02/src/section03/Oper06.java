package section03;
//1-2. 이항 연산자(복합 대입 연산자) : +=, -=, *=, /=, %=
public class Oper06 {
	public static void main(String[] args) {
//		[예제 12.]
		int x = 10;
		int y = 1;
		
		y += x;	// y = y + x  →  y = 1 + 10 = 11
		System.out.println(y);
		
		y *= x;	// y = y * x  →  y = 11 * 10 = 110
		System.out.println(y);
		
		y %= x;	// y = y % x  →  y = 110 % 10 = 0
		System.out.println(y);
	}
}
