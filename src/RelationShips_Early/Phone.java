package RelationShips_Early;

public class Phone {
	private String Modelname;
	public void setModelName(String ModelName) {
		this.Modelname= ModelName;
	}
	
	Phone(){
		
	}

	public String getModelname() {
		return Modelname;
	}

	public void setModelname(String modelname) {
		Modelname = modelname;
	}
	Phone(String Modelname){
		this.Modelname=Modelname;
	}
	private Sim s = new Sim(17);
	public Sim getSim() {
	return s;
	}
}
