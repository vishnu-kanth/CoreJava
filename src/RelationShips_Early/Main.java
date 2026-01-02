package RelationShips_Early;

public class Main {
	public static void main(String[] args) {
	cars c = new cars();
//		System.out.println(c.getModelname());
//		System.out.println(c.getengine().getHp());
		for(int i=0;i<c.getTyres().length;i++) {
			System.out.println(c.getTyres()[i].getBrand());
			
		}
		
//		Phone p = new Phone("Iphone");
//		System.out.println(p.getModelname());
//		System.out.println(p.getSim().getpv());
	}		
}

