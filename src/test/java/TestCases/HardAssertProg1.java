package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertProg1 {
	
	@Test
	public void method1()
	{
		Assert.assertEquals(false, false);
		Assert.assertEquals(200, 200);
		Assert.assertEquals(true, true);
	
	}
	@Test
	
	public void method2()
	{
		Assert.assertEquals(false, false);
		Assert.assertEquals(200, 201);
		Assert.assertEquals(true, true);
	
	}

}
