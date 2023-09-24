package Java_2Week;
import java.util.Scanner;

public class YJSB_Ex02 {

	public static void main(String[] args) {
		// 배열과 for 문을 이용하는 예제
		// 사이사이 고양이 유치원 참치반 마릿수 "N"을 입력받고 마릿수 크기의 배열 "score"을 생성.
		// 각 고양이의 수행평가 점수를 입력받고
		// 점수 출력->총점 구하기->평균 구하기->총점, 평균 출력

		  Scanner scanner = new Scanner(System.in); // 스캐너 인스턴스-객체 생성

		        // 고양이 마릿수 입력받기
		        System.out.print("사이사이 고양이 유치원 마릿수는? >> ");
		        int N = scanner.nextInt(); // 고양이의 마릿수 입력받기

		        // 마릿수 크기의 배열 score 생성
		       int []score =new int[N]; // [문제1]입력받은 마릿수 만큼의 배열 생성하기

		        // 각 고양이마다 점수 입력
		        for (int i=0; i<score.length; i++) {
		            System.out.print("고양이 점수 입력:"); // [문제2]번호대로 고양이 점수 입력받기
		            score[i] = scanner.nextInt();
		        }

		        // 총점, 평균 변수 생성, 초기화
		        int sum = 0;

		        // 각각의 고양이의 점수 출력
		        System.out.println("\n** 참치반 고양이 점수 출력 **");
		        for (int i=0; i<score.length; i++) {
		            System.out.println("고양이 점수:"+score[i]);// [문제3]번호별 고양이 점수 출력
		            // [문제4]참치반 총점 구하기
		            sum=sum+score[i];
		        }

		        // 평균 구하기
		         //[문제5]평균 구하기
		        double ave = sum/score.length;
                      
		        // 출력
		        System.out.println("참치반의 총점:"+sum+"참치반의 평균:"+ave);
		    }
         }

	

