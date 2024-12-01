package section06;
//1. 배열 ② : 배열의 초기값
public class Array02 {
	public static void main(String[] args) {
//		[예제 03.]
//		intArray라는 참조변수를 stack 메모리에 선언하고 5칸짜리 배열을 heap 메모리에 생성함
		int[] intArray = new int[5];
//		strArray라는 참조변수를 stack 메모리에 선언하고 5칸짜리 배열을 heap 메모리에 생성함
		String[] strArray = new String[5];
		
//		varArray라는 참조변수를 stack 메모리에 선언하고 5칸짜리 배열을 heap 메모리에 생성한 후 값 방에 값 담기
		int[] varArray = {1, 2, 3, 4, 5};
		
//		intArray 각 방의 값 출력 → 따로 초기값을 설정하지 않더라도 정수형의 초기값인 0이 들어감
		System.out.println("intArray[0] = " + intArray[0]);
		System.out.println("intArray[1] = " + intArray[1]);

//		strArray 각 방의 값 출력 → 따로 초기값을 설정하지 않더라도 객체형의 초기값인 null이 들어감
		System.out.println("strArray[0] = " + strArray[0]);
		System.out.println("strArray[1] = " + strArray[1]);

//		varArray 각 방의 값 출력 → 초기값을 따로 저장했기 때문에 저장한 값 출력
		System.out.println("varArray[0] = " + varArray[0]);
		System.out.println("varArray[1] = " + varArray[1]);
	}
}
