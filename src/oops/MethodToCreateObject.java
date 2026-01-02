package oops;

public class MethodToCreateObject {
	static class Box{
		int length;
		
		Box(){
			
		}
		Box(int length){
			this.length=length;
		}
		public static Box createBox() {
			return new Box();
		}
		public static Box createBox(int length) {
			return new Box(length);
		}
	}
	
	public static void main(String[] args) {
		Box b1 = Box.createBox();
		printRef(b1);
		Box b2 = Box.createBox(23);
		printRef(b2);
	}
	public static void printRef(Box b) {
		System.out.println(b);
	}	

}
