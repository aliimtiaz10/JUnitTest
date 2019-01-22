package JenkinsDemo.JUnitTest;

import static org.junit.Assert.*;

import org.junit.Test;

public class SimpleDemoTest {
	
	@Test
	public void simpleTestPass(){
		int a = 1;
		int b = 2;
		assertTrue(a+b==3);
	}

}
