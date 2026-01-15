package Exception_Handling;
import java.util.*;

public class UnderAgeException extends RuntimeException{
	String message;
	UnderAgeException(){
		
	}
	
	UnderAgeException(String message){
		this.message=message;
	}
	public String getMessage() {
		return message;
	}
}

    class OverAgeException extends RuntimeException{
	String message;
	OverAgeException(){
		
	}
	
	OverAgeException(String message){
		this.message=message;
	}
	public String getMessage() {
		return message;
	}
}