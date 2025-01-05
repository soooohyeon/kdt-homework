package ioStream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//예제 13.
public class BufferRead03 {
	public static void main(String[] args) {
//		입력 스트림 객체 선언
		FileInputStream readFile = null;
//		입력 보조 스트림 객체 선언
		BufferedInputStream bis = null;
		
//		출력 스트림 객체 선언
		FileOutputStream writeFile = null;
//		출력 보조 스트림 객체 선언
		BufferedOutputStream bos = null;
		
		try {
			System.out.println("기본 스트림으로 복사 시작");
			readFile = new FileInputStream("back.jpg");
			writeFile = new FileOutputStream("copy.jpg");
			int read = 0;
			
			long start = System.currentTimeMillis();
			System.out.println("이미지 복사 시작1");
//			설정해둔 파일 끝날 때까지 순회하기
			while ((read = readFile.read()) != -1) {
				writeFile.write(read);
			}
			System.out.println("이미지 복사 종료1");
			long end = System.currentTimeMillis();
			long time = (end - start) / 1000;
			
			System.out.println("소요 시간 : " + time + "초");
			System.out.println("기본 스트림으로 복사 종료");
			
//			파일 닫기
			readFile.close();
			writeFile.close();
			
			System.out.println("보조 스트림으로 복사 시작");
			readFile = new FileInputStream("back.jpg");
			writeFile = new FileOutputStream("copy.jpg");
			
			bis = new BufferedInputStream(readFile);
			bos = new BufferedOutputStream(writeFile);
			start = System.currentTimeMillis();
			System.out.println("이미지 복사 시작2");
//			설정해둔 파일 끝날 때까지 순회하기
			while (bis.read() != -1) {
				bos.write(read);
			}
			
			System.out.println("이미지 복사 종료2");
			end = System.currentTimeMillis();
			double result = (double)(end - start) / 1000;
			
			System.out.println("소요 시간 : " + result + "초");
			System.out.println("보조 스트림으로 복사 종료");
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (bis != null) {
					bis.close();
				}
				if (readFile != null) {
					readFile.close();
				}
				if (bos != null) {
					bos.close();
				}
				if (writeFile != null) {
					writeFile.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		
	}
}
