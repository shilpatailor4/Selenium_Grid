package suiteA;

import base.BaseTest;

public class TestA2 extends BaseTest{
	
	public void testA2() throws InterruptedException
	{
		System.out.println("Statring A2");
		openBrowser("Chrome");
		Thread.sleep(5000);
		System.out.println("Ending A2");
	}

}
