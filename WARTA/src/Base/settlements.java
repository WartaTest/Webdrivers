package Base;

import Base.logins.password1;
import Base.logins.username1;
import Base.login;

public class settlements {
	
	public static void Settlements() throws InterruptedException{
		
		login logowanie = new login();
		logowanie.RunLogin(username1.CENTRALA.toString);
	}
	

}
