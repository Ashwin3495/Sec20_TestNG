package test; //package name is must or it will throw Class not found exception

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Lec137_Run {
	
	@Parameters({"IM"})
	@Test(groups= {"Smoke"})
	public void Demo(String a)
	{
		System.out.println("Hello");	
		//Assert.assertTrue(false);
		System.out.println(a);
	}
	
	@Parameters({"URL"})
	@Test(groups= {"Fog"})
	public void Demo1(String uname)
	{
		System.out.println("Hello");	
		System.out.println(uname);
	}

}
