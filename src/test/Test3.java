package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test3 {
	@Test(dependsOnMethods= {"G3"})
	public void G()
	{
		System.out.println("Great");		
	}
	
	@Parameters({"Life"})
	@Test
	public void G3(String a)
	{
		System.out.println("Guilt");
		System.out.println(a);
	}
	
	@Test(timeOut=4000,enabled=false)
	public void G2()
	{
		System.out.println("Gangster");		
	}
}
