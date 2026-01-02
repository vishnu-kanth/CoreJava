package RelationShips_Early;

public class Car {
	private String Modelname;
	public void setModelName(String ModelName) {
		this.Modelname= ModelName;
	}

	Car(){
		
	}
	public String getModelname() {
		return Modelname;
	}

	public void setModelname(String modelname) {
		Modelname = modelname;
	}

	Car(String ModelName){
		this.Modelname=ModelName;
	}
	private engine e = new engine(1000);
	public engine getengine() {
		return e;
	}
	
}
