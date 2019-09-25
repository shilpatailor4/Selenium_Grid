package suiteB;

import base.BaseTest;

public class TestB2 extends BaseTest{
	
	public void testB2() throws InterruptedException
	{
		System.out.println("Starting B2");
		openBrowser("Chrome");
		Thread.sleep(5000);
		System.out.println("Ending B2");
		quit();
	}

}
