package ioStream;

import java.io.File;

//예제 18.
public class FileTest {
	public static void main(String[] args) {
//		폴더 경로 및 파일명 설정
		File f = new File(".../src/example.txt");
//		파일이 있다면
		if (f.exists()) {
//			파일의 길이
			System.out.println("length : " + f.length());
//			파일의 크기
			System.out.println("canRead : " + f.canRead());
			System.out.println("canWrite : " + f.canWrite());
//			파일의 절대 경로 반환
			System.out.println("getAbsolutePath : " + f.getAbsolutePath());

			System.out.println("getName : " + f.getName());
//			현재 또는 폴더의 상위 폴더 반환
			System.out.println("getParent : " + f.getParent());
//			파일의 상대 경로 반환
			System.out.println("getPath : " + f.getPath());
		} else {
			System.out.println("파일에 존재하지 않습니다.");
		}
	}
}
