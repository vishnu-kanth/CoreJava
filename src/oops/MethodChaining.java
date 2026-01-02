package oops;

public class MethodChaining {
	MethodChaining m1() {
		return this;
	}
	MethodChaining m2() {
		return this;
	}
	MethodChaining m3() {
		return this;
	}
	MethodChaining m4() {
		return this;
	}
	public static void main(String[] args) {
		MethodChaining d1 = new MethodChaining();
		MethodChaining obj = d1.m1().m2().m3().m4();
		System.out.println(obj);
	}
}
