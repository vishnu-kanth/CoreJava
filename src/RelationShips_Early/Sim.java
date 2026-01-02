package RelationShips_Early;

public class Sim {
	private int pv;
	
	public int getpv() {
		return pv;
	}
	public void SetHp(int pv) {
		this.pv = pv;
	}
	Sim(){
		
	}
	Sim(int pv){
		SetHp(pv);
	}

}
