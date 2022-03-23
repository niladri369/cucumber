package myHooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class AmazonHooks {

	// TODO Auto-generated method stub
	@Before(order=1) 
	public void setup_Browser(Scenario sc){
		System.out.println("start broeswer");
		System.out.println(sc.);
	}
	@Before(order=2) 
	public void setup_Url() {
		System.out.println("give url for Amazon application");
	}
	@After(order=2)
	public void teardown_cutdb() {
		System.out.println("close db connection for Amazon application");
	}
	@After(order=1)
	public void teardown_close() {
		System.out.println("close Amazon application");
	}
}
