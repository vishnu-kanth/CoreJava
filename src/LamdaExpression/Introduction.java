package LamdaExpression;

public class Introduction {
	interface A {
		void test();
	}

	interface B {
		int marks(int x, int y);
	}

	public static void main(String[] args) {
		A a = () -> {
			System.out.println("testing");
		};
		a.test();

		B b = (x, y) ->  {
			return x + y;
		};
		System.out.println(b.marks(2, 4));
	}
}

