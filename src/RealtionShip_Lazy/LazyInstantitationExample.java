package RealtionShip_Lazy;

public class LazyInstantitationExample {

	static class Tyre {
		private String brand;

		public String getBrand() {
			return brand;
		}

		public void setBrand(String brand) {
			this.brand = brand;
		}

		public Tyre(String brand) {
			this.brand = brand;
		}
	}

	static class Car {
		private Tyre[] tyres = new Tyre[4];

		public Tyre[] getTyres() {
			return tyres;
		}

		public void setTyres(Tyre[] tyres) {
			this.tyres = tyres;
		}

		int i = 0;

		void addTyre(Tyre tyre) {
			tyres[i] = tyre;
			i++;
		}
	}
	
	public static void main(String[] args) {
		Car c = new Car();
		
		//here i need four tyres so now i can create 4 tyres with the help of addTyre method when i needed
		c.addTyre(new Tyre("MRF"));
		c.addTyre(new Tyre("MRF"));
		c.addTyre(new Tyre("MRF"));
		c.addTyre(new Tyre("MRF"));
		
		for(int i=0;i<c.getTyres().length;i++) {
			System.out.println(c.getTyres()[i].getBrand());
		}
	}
}

