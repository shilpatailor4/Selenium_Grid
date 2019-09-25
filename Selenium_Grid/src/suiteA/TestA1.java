package suiteA;

import base.BaseTest;

public class TestA1 extends BaseTest{
	
	public void testA1() throws InterruptedException
	{
		System.out.println("Starting A1");
		openBrowser("Mozila");
		Thread.sleep(5000);
		System.out.println("Ending A1");
		quit();
	}
}
