package Java_3Week;
/*
"그만...!"이 입력될 때까지 배우이름과 작품을 입력받아 저장하고 다시 배우이름을 입력받아 작품를 출력하는 프로그램을 작성하세요.
해당 연예인(배우)를 보고 배우의 대표작을 맞추는 게임입니다.(키(Key)는 배우 이름이고 값(Value)은 대표작품입니다)
 오류 부분 또는 비어있는 부분을 채우시면 됩니다!
 */

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class BestperformanceGame_Answer {

private HashMap<String,String> store=new HashMap<String,String>();
	private Scanner sc = new Scanner(System.in);
	
	public BestperformanceGame_Answer() {
		//store에 6명의 배우와 대표작품을 입력하여 초기화
	//이미 입력되어있음
		store.put("박은빈","이상한변호사우영우");
		store.put("신혜선", "서른이지만열입곱입니다");
		store.put("박보검","응답하라1988");
		store.put("한소희","부부의세계");
		store.put("강동원", "전우치");
		store.put("박서준", "쌈마이웨이");
		
		
	}
	private void error(String msg) {
		System.out.println(msg);
	}
public void run() {
	System.out.println("-----지금부터 연예인 대표 작품 맞추기 게임을 시작합니다!~-----");

	while (true) {
		System.out.println("입력:1,퀴즈:2,종료:3 ->");
		int menu =sc.nextInt();
		switch(menu) {
		case 1:Input();
		break;
		case 2:Quiz();
		break;
		case 3:Finish();
		return;
		
		default:
			error("잘못된 입력입니다.");
			
			
		}
	}
}
//입력(입력 되어있는 배우와 작품이외에 배우와 작품 추가하기)
private void Input() {
	int N =store.size();
	System.out.println("현재"+N+"개 배우와 대표 작품이 입력되었습니다.");
	N++;
	while(true) {
		System.out.println("배우와 대표작품 입력"+N +"->");
		String entertainer  = sc.next();
	if(entertainer.equals("그만...!")) { //그만...!을 입력하면 다시 메뉴를 선택할 수 있도록 돌아간다.
		break;
		
	}
	String bestperformance =sc.next();
	if(store.containsKey(entertainer)) {
		System.out.println(entertainer+"은(는) 이미 존재합니다");
	continue;
	}
	store.put(entertainer, bestperformance);
	N++;
	}
}
//퀴즈(원래 있던 값 이외에 내가 추가적으로 입력했던 값을 포함하여 랜덤으로 배우가 나오면 해당 대표작품을 맞추면 된다)
private void Quiz(){
	//모든 연예인(키)을 알아낸다
    Set<String>keys =store.keySet(); 
    Object[]array =(keys.toArray());

    while(true) {
	//연예인 중 하나를 택한다.(즉,랜덤한 위치 결정)
	int index = (int) (Math.random()*array.length);
	
	//문제(연예인 이름)와 정답(대표작)을 결정한다.
	String question=(String)array[index];
	String answer = store.get(question);
	
    //문제 출력하기
	System.out.println(question+"의 대표작은?");
	
	//사용자 입력
	String user =sc.next();
	if(user.equals("그만...!")) { //그만...!을 입력하면 다시 메뉴를 선택할 수 있도록 돌아간다.
		break;
		
	}
    if(user.equals(answer))
	System.out.println("딩~동~댕~동");
    else
    	System.out.println("때에에엥! 정말 그 작품이라고 생각하시나요?! 더 유명한 거 있자나요~!");
  }
}
//종료
private void Finish() {
	System.out.println("게임을 종료합니다!");
}
	public static void main(String[] args) {
		BestperformanceGame game = new BestperformanceGame();
		game.run();

	}

}

