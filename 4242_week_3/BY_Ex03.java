//빈 줄 채우기
//일정을 추가하고, 검색하는 프로그램입니다.
//[문제 1] 1을 입력한 경우, 사용자에게 추가할 일정의 날짜와 일정 내용을 입력받습니다.
//[문제 2] 2를 입력한 경우, 사용자에게 검색할 날짜를 입력받은 후 해당 날짜와 일치하는 날짜의 일정이 존재하는 경우
// 저장된 일정을 출력하고 그렇지 않을 경우 일정이 존재하지 않는다는 문장을 출력합니다.
//[문제 3] 3을 입력한 경우, 프로그램을 종료합니다.

//아래는 출력 결과의 예시입니다.
//        원하는 작업을 선택하세요.
//        1.일정 추가 2.일정 검색 3.종료
//        원하는 작업의 번호를 입력하세요.>>0
//        숫자를 다시 입력해주세요.
//
//        원하는 작업을 선택하세요.
//        1.일정 추가 2.일정 검색 3.종료
//        원하는 작업의 번호를 입력하세요.>>1
//        추가할 일정의 날짜를 입력하세요.(YYYY/MM/DD)>>2023/09/29
//        일정 내용을 입력하세요.>>추석
//        일정이 추가되었습니다.
//
//        원하는 작업을 선택하세요.
//        1.일정 추가 2.일정 검색 3.종료
//        원하는 작업의 번호를 입력하세요.>>2
//        검색할 날짜를 입력하세요.(YYYY/MM/DD)>>2023/09/29
//        2023/09/29의 일정은 추석입니다.
//
//        원하는 작업을 선택하세요.
//        1.일정 추가 2.일정 검색 3.종료
//        원하는 작업의 번호를 입력하세요.>>2
//        검색할 날짜를 입력하세요.(YYYY/MM/DD)>>2023/12/25
//        해당 날짜는 일정이 없습니다.
//
//        원하는 작업을 선택하세요.
//        1.일정 추가 2.일정 검색 3.종료
//        원하는 작업의 번호를 입력하세요.>>3
//        종료합니다.


package Java_3Week;


import java.util.*;



public class BY_Ex03 {


	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
        HashMap<String,String> calender=new HashMap<>();
        

        while (true){
            System.out.println("원하는 작업을 선택하세요.");
            System.out.println("1.일정 추가 2.일정 검색 3.종료");
            System.out.print("원하는 작업의 번호를 입력하세요.>>");
            int choice=sc.nextInt();
            sc.nextLine();
            
            if(choice==1){
                //[문제 1] calender에 일정을 추가하는 부분입니다. 주석을 참고해서 빈 줄을 채워주세요.
            	//사용자가 입력한 날짜를 저장합니다. 
            	
                  System.out.print("추가할 일정의 날짜를 입력하세요.(YYYY/MM/DD)>>");
                 String theDate =sc.nextLine();
                 
                 String thedate=sc.nextLine();
                 System.out.print("일정 내용을 입력하세요.>>");
                 String searchEvent=sc.nextLine();
                 calender.put(thedate,searchEvent);
                 System.out.println("일정이 추가되었습니다.");
                 System.out.println("\n");
             }
             else if (choice==2) {
                 System.out.print("검색할 날짜를 입력하세요.(YYYY/MM/DD)>>");
                 String date=sc.nextLine();
                 String searchEvent=calender.get(date);
                 if(searchEvent!=null){
                     System.out.println(date+"의 일정은 "+searchEvent+"입니다.");
                     System.out.println("\n");
                 }
                 else{
                     System.out.println("해당 날짜는 일정이 없습니다.");
                     System.out.println("\n");
                 }
             }
             else if (choice==3) {
                 System.out.println("종료합니다.");
                 System.exit(0);
             }
             else {
                 System.out.println("숫자를 다시 입력해주세요.");
                 System.out.println("\n");
             }
         }
     }
 }