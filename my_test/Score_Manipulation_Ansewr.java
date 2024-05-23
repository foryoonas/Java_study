package Java_1Week_;

import java.util.Scanner;

public class Score_Manipulation_Ansewr {

	public static void main(String[] args) {

		
		 Scanner sc = new Scanner(System.in);
		    System.out.println("과목의 개수를 입력하세요:");
		    int N =sc.nextInt(); //시험을 본 과목의 개수

		    System.out.println("조작 전 과목별 성적들을 입력하세요:");

		    int array[] = new int[N];  //[문제1]윤아의 과목별 성적을 담기 위해 배열 array선언하기

		for(int i=0; i<array.length; i++) {    //인덱스는 0번째 부터
			array[i]= sc.nextInt();            //각 인덱스에 들어갈 점수를 콘솔에 입력해야함
			                                   //반복문을 통해 조건문이 끝날 때까지 인덱스 생성하기
		}

		long sum=0; //평균을 구하기 위해서는 for문을 사용하여 점수를 다 더해야해서 sum을 0으로 초기화함
		long Max=0; //최댓값은 for문을 이용하여 인덱스끼리 비교해야하므로 0으로 초기화함


			
			for(int i=0; i<array.length; i++) {
				if(array[i]>Max)                     //[문제2]조건문을을 활용해 인덱스끼리 비교하여 Max값을 구하는 코드 작성하기
				Max = array[i];
				
				sum+=array[i];                          //[문제3]새로운 평균을 구할 때 사용할 조작된 점수들의 총합(sum)을 구하는 코드 작성하기

			}
			
						
			
			
			
			System.out.println("조작 후 성적들의 평균은:");
			System.out.println((sum*100.0/Max)/N);      //[문제4]조작된 점수들의 평균을 구하는 코드를 간단하게 작성하기

	}

}
