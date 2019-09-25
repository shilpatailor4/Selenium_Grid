package suiteB;

import base.BaseTest;

public class TestB3 extends BaseTest{
	
	public void testB3() throws InterruptedException
	{
		System.out.println("Starting B3");
		openBrowser("Edge");
		Thread.sleep(5000);
		System.out.println("Ending B3");
		quit();
	}

}
