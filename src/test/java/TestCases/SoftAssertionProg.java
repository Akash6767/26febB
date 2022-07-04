package TestCases;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertionProg {
	
	@Test
	public void method1()
	{
		SoftAssert s = new SoftAssert();
		System.out.println("Method 1 Started");
		s.assertEquals(false, false);
		s.assertEquals(false, true);
		s.assertEquals(200, 201);
		System.out.println("Method 1 Ended");

	}
	
	@Test
	
	public void method2()
	{
		SoftAssert s = new SoftAssert();
		System.out.println("Method 2 Started");
		s.assertEquals(false, false);
		s.assertEquals(false, true);
		s.assertEquals(200, 201);
		System.out.println("Method 2 Ended");
        s.assertAll();

	}
	

}
