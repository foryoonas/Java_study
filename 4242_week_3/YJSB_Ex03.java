// HashMap을 이용하는 문제
// 모스부호 해독 문제 - 입력 창에 모스부호를 입력하면 영어 문자열로 변환되어 출력하도록 만드는 문제


package Java_3Week;

import java.util.HashMap;
import java.util.Scanner;

public class YJSB_Ex03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

        System.out.print("모스부호를 입력하세요 : ");
        String[] input1 = sc.nextLine().split(" ");
        // 입력값을 input1이라는 문자열 배열에 저장.
        // split() 함수 = 문자열을 각각 문자별로 잘라서 배열에 저장하여 리턴.
        
        HashMap<String , Character> map = new HashMap<String , Character>();
        // 모스부호(key)는 String, 알파벳(val)은 Charater로 구성된 해시맵 생성
        String [] key = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--",
                "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", " "};
        char [] val = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
                'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', ' '};

        for(int i=0; i<input1.length; i++) { // [문제1]모스부호의 길이 만큼 key와 val에 저장하는 for문을 완성하세요.
          map.put(key[i], val[i]);
        }
       

        
        for(int i=0; i<input1.length; i++) {// [문제2]입력받은 길이만큼 반복하는 for문을 완성하세요.
            if(map.get(input1[i])==null)
        	System.out.print("");
        	
            else
            	System.out.print(map.get(input1[i]));
        
        }
       
     }
        
    }

	
//출력값 보기 =>
//모스부호를 입력하세요 : .. .- -- -... .- -... ---
//iambabo
//모스부호를 입력하세요 : .. null .- -- null -... .- -... ---
//i am babo



