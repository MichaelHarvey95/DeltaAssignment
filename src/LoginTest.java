import static org.junit.Assert.*;

import org.junit.Test;

public class LoginTest {

	Login lblUsername = new Login();
	Login lblPassword = new Login();
	
	@Test
	public void test() {
		if(lblUsername == null)
		{
			System.out.print("Please enter a value");
		}
		else if(lblPassword == null)
		{
			System.out.print("Please enter a value");
		}
		else
		{
			System.out.print("Details are valid");
		}
		
	}

}
