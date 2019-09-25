package suiteA;

import base.BaseTest;

public class TestA3 extends BaseTest{
	
	public void testA3() throws InterruptedException
	{
		System.out.println("Starting A3");
		openBrowser("Edge");
		Thread.sleep(5000);
		System.out.println("Ending A3");
	}

}
