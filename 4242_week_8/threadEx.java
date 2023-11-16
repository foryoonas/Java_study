package Java_8Week;

class BankAccount {
	
	private int totalMoney;
	
	public BankAccount(int totalMoney) {
		this.totalMoney = totalMoney;
	}
	
	public synchronized void deposit(int money) {
		
		totalMoney += money;
		
		try {
			
			Thread.sleep(500); 
			
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("입금 금액 : " + money 
						+ " | 총 잔액 : " + totalMoney);
		
	}
	
	public int getTotalMoney() {
		return totalMoney;
	}
	
	
}


public class threadEx{

	public static void main(String[] args) {
		
		BankAccount account = new BankAccount(1000);
		
		Runnable run = new Runnable() {
			
			@Override
			public void run() {
				
				for(int i = 0; i < 5; i++) {
					account.deposit(100);
				}
				
			}
			
		};
		
		Thread thread1 = new Thread(run);
		Thread thread2 = new Thread(run);
		
		thread1.start();
		thread2.start();
		
		try {
			
			thread1.join();
			thread2.join();
			
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("최종잔액 : " + account.getTotalMoney());
		
	}

}


			
		
