//공통문제
//조건:N의 범위는 1<=N<=100으로 한다.
package Java_2Week;

import java.util.Scanner;

public class Test_2 {

	public static void main(String[] args) {
    
		
		Scanner sc = new Scanner(System.in);
		System.out.println("출력할 별탑의 개수를 입력하세요.");
		int N = sc.nextInt();//쌓을 별탑의 수 
		
		for(int i=1; i<=N; i++ ) { 
			//N=2라 가정하면 
			//1. i=1일 때 1<=2 -> 성립 ->j로 이동
			//2. i++-> i=2일 때 -> 2<=2 -> 성립 ->j로 이동
			//3. i++ ->i=3일 때 -> 3<=2 -> 성립X -> for문 종료
			for(int j=1; j<=i; j++) { 
			//1.j=1일 때 1<=1 -> 성립 ->"*"출력
			//  j=2일 때 2<=1 -> 성립X ->최종적으로 "*"하나만 출력
		    
			//2.j=1일 떄 1<=2 -> 성립 ->"*"출력
			//	j=++ -> j=2일 때 2<=2 -> 성립 ->"*"출력
			//최종적으로 "**"출력됨
				System.out.print("*");
				
			}
			System.out.println();

		}
		sc.close();
 
	}

}
