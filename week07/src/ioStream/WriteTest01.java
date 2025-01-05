package ioStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

//예제 03.
public class WriteTest01 {
	public static void main(String[] args) {
//		파일을 생성(출력)하기 위한 객체 선언
		OutputStream out = null;
		try {
//		 	생성할 파일명과, 이어쓰기 옵션을 매소드로 작성
//			true - 이어씀, false - 기존 내용 무시하고 새로 작성
			out = new FileOutputStream("write.txt", false);
//			작성할 데이터 출력(위 write.txt 파일에 한글자씩 출력됨)
			out.write('H');
			out.write('E');
			out.write('L');
			out.write('L');
			out.write('O');
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (out != null) {
					out.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
