package parallel;

import java.util.Arrays;

import org.testng.TestNG;

public class RunSuiteInParallel {
	
	public static void main(String[] args) {
		
		TestNG testng = new TestNG();
		testng.setTestSuites(Arrays.asList(new String[] {System.getProperty("user.dir")+"//testng.xml"}));
		testng.setSuiteThreadPoolSize(2);
		testng.run();
	}

}
