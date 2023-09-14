//국어,영어,수학 점수를 입력 받아 평균을 출력하는 프로그램

package Java_1Week_;

import java.util.Scanner;

public class YJSB_Ex01 {

	public static void main(String[] args) {
     
		Scanner sc = new Scanner(System.in);
		
		System.out.println("국어 점수를 입력하세요:");
		int Kor = sc.nextInt(); //사용자 입력
		
		System.out.println("영어 점수를 입력하세요:");
		int Eng = sc.nextInt(); //사용자 입력
		
		System.out.println("수학 점수를 입력하세요:");
		int Math = sc.nextInt(); //사용자 입력
		
		int average = (Kor+Eng+Math)/3;
		System.out.println("세 과목의 평균은 "+average+"점 입니다."); //평균 출력
		
	}

}
