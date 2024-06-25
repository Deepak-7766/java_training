package Exception;
import java.util.*;
class UserDefinedExc extends RuntimeException{
	UserDefinedExc(String msg){
		super(msg);
	}
}

public class UserdefinedExcApp {

	public static void main(String[] args)throws UserDefinedExc {
	
		int age=13;
		try {
		if(age<18) {
			throw new UserDefinedExc("You are not elligible for vote");
		}else {
			System.out.println("You are Elligible for vote...");
		}
		}
		catch(UserDefinedExc e) {
			e.printStackTrace();
		}
		System.out.println("hello");
	}

}
