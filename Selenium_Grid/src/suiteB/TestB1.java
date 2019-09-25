package suiteB;

import base.BaseTest;

public class TestB1 extends BaseTest{
	
	public void testB1() throws InterruptedException
	{
		System.out.println("Starting B1");
		openBrowser("Mozila");
		Thread.sleep(5000);
		System.out.println("Ending B1");
		quit();
	}

}
