package Java_2Week;
//배열과 for문을 이용하는 예제

//1~5까지의 숫자 중에 랜덤으로 숫자를 입력하여 lotto에 입력되어 있는 순서대로 숫자 맞추기
//사용자가 입력한 값과 lotto(랜덤으로 돌아간 수)에 입력된 값이 2개 이상 맞으면 정답 처리

//[문제1] 5크기의 배열을 생성해라
//[문제2] 1~5가 아닌 숫자를 입력하였을때 다시 입력하도록 코드를 작성하여라
//[문제3] user[x]가 0~5까지의 숫자라면, 랜덤으로 lotto 변수가 출력되도록 하여라
//[문제4] for문을 올바르게 사용하여라 (for문이 필요한 위치에 두기)

import java.util.Random;
import java.util.Scanner;

public class HYSB_Ex02 {
  public static void main(String[] args) { //메인메서드

      Scanner scanner = new Scanner(System.in); //사용자 입력

      int[] lotto = new int[5]; //배열 lotto 5만큼 생성
      int[] user = new int[5]; //배열 user 5만큼 생성
      Random random = new Random(); //Random 매서드
      int cnt = 0; //cnt 값 초기화


      System.out.println("1~5까지의 숫자를 입력하세요."); //"1~5까지의 숫자를 입력하세요." 문구 출력

      for(int x=0; x<5; x++) { //반복문 (x=0으로 초기화, x는 0~4까지 총 5회 실행)
          if (0 < user[x] && user[x] < 6) { //만약 user[x]가 0~5까지의 숫자라면,
              lotto[x] = random.nextInt(5) + 1; //lotto[x]에 랜덤 숫자 출력 random.nextInt(num) 함수는 0~ num-1 사이의 수를 반환
          } else { //만약에 user[x]가 0~5까지의 숫자가 아니라면,
              System.out.println("1~5까지의 숫자를 올바르게 입력하세요."); //"1~5까지의 숫자를 입력하세요." 문구 출력
              System.out.println("범위 벗어난 숫자 제외 하고 이이서 count 됩니다."); //"범위 벗어난 숫자 제외 하고 이이서 count 됩니다." 문구 출력
              user[x] = scanner.nextInt(); //user[x]는 사용자가 입력한 값
          }
      }

      for(int x=0; x<5; x++) { //반복문 (x=0으로 초기화, x는 0~4까지 총 5회 실행)
          if (lotto[x] == user[x]) { //만약 lotto[x] == user[x]라면,
              cnt = cnt + 1; //cnt 증가
          }
      }

      for(int x=0; x<5; x++) { //반복문 (x=0으로 초기화, x는 0~4까지 총 5회 실행)

          System.out.print(lotto[x] + " "); //lotto[x] 값 출력
      }

      System.out.println(""); //한줄 공백으로 출력

      for(int x=0; x<5; x++) { //반복문 (x=0으로 초기화, x는 0~4까지 총 5회 실행)
          System.out.print(user[x] + " "); //user[x] 값 출력
      }

      if (cnt >= 2) { //cnt 가 2보다 크다면,
          System.out.println(""); //한줄 공백으로 출력
          System.out.println("====================");
          System.out.println("당첨"); //"당첨" 문구 출력
      } else { //만약 cnt가 2보다 크지 않다면,
          System.out.println(""); //한줄 공백으로 출력
          System.out.println("====================");
          System.out.println("꽝"); //"실패" 문구 출력
      }
  }

}		 