package Test;

import BaseClass.BaseClass;
import POMClass.LoginPage;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		//open Browser
		BaseClass k=new BaseClass ();
		k.getdriver();
		LoginPage k1=new LoginPage(null);
		k1.enteremailId();
		k1.enterPassword();
		k1.pressLoginButton();
		k1.enteremailId();
		
		
	}

}
