package Encapsulation;

public class User {
	private int id;
	private String name;
	private String password;
	
	public User(int id,String name,String password) {
		this.id = id;
		setname(name);
		setpassword(password);
	}
//Getter
	public int getid() {
		return id;
	}
	public String getname() {
		return name;
	}
	public String getpassword() {
		return password;
	}
//Setter
	public void setname(String name) {
		if(name!=null) {
			this.name=name;
		}else {
			System.out.println("Invalid name");
		}
	}
	public void setpassword(String password) {
		if(password.length()>=8 && password!=null) {
			this.password=password;
		}else {
			System.out.println("Invalid password");
		}
	}

}
