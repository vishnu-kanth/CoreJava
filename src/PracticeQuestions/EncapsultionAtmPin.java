package PracticeQuestions;

public class EncapsultionAtmPin {
	static class Account{
		private int pin;
		
		Account(int pin){
			this.pin = pin;
		}
		public boolean verifyPin(int EnteredPin) {
			return this.pin==EnteredPin;
			
		}
		
		public void changePin(int oldPin , int newPin) {
			if(!verifyPin(oldPin)) {
				System.out.println("wrong pin and can't be changed");
				return;
			}
			this.pin = newPin;
			System.out.println("PIN chnaged succesfully");
		}
		
			public static void main(String args[]) {
				Account p = new Account(2731);
				p.changePin(2731, 1234);
				
		}
	}
}
