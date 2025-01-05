package ioStream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

//예제 02.
public class BufferRead02 {
	public static void main(String[] args) {
		FileInputStream readFile = null;
		FileInputStream bisReadFile = null;
		BufferedInputStream bis = null;
		
		try {
			System.out.println("기본 스트림으로 읽기 시작");
//			기본 스트림으로 불러올 파일 설정
			readFile = new FileInputStream("back.jpg");
			long start = System.currentTimeMillis();
			System.out.println("이미지 읽기 시작1");
//			설정해둔 파일 끝날 때까지 순회하기
			while (readFile.read() != -1) {
//				이미지 읽기
			}
			System.out.println("이미지 읽기 종료1");
			long end = System.currentTimeMillis();
			long time = (end - start) / 1000;
			
			System.out.println("소요 시간 : " + time + "초");
			System.out.println("기본 스트림으로 읽기 종료");
			
			System.out.println("보조 스트림으로 읽기 시작");
//			보조 스트림으로 불러올 파일 설정
			bisReadFile = new FileInputStream("back.jpg");
			bis = new BufferedInputStream(bisReadFile);
			start = System.currentTimeMillis();
			System.out.println("이미지 읽기 시작2");
//			설정해둔 파일 끝날 때까지 순회하기
			while (bis.read() != -1) {
//				이미지 읽기
			}
			System.out.println("이미지 읽기 종료2");
			end = System.currentTimeMillis();
			time = (end - start) / 1000;
			
			System.out.println("소요 시간 : " + time + "초");
			System.out.println("보조 스트림으로 읽기 종료");
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (bis != null) {
					bis.close();
				}
				if (bisReadFile != null) {
					bisReadFile.close();
				}
				if (readFile != null) {
					readFile.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
