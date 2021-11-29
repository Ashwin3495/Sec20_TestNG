package test;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test2 {

	@Test
	public void C()
	{
		System.out.println("Character");	
		Assert.assertTrue(false);
	}
	@Parameters({"Life"})
	@Test
	public void C2(String a)
	{
		System.out.println("Communication");
		System.out.println(a);
	}
	
	@Test
	public void C3()
	{
		System.out.println("Challange");		
	}
	@Test(groups= {"B"})
	public void D()
	{
		System.out.println("Decision making");
	}
	
	@BeforeMethod(groups= {"B"})
	public void D2()
	{
		System.out.println("|/|/|/|Dedication|/|/|/|");
	}
	
	@BeforeTest(groups= {"B"})
	public void D3()
	{
		System.out.println("Deal braker");
	}
	
	@BeforeSuite(groups= {"B"})
	public void F()
	{
		System.out.println("Feelings");
	}

	@BeforeClass(groups= {"B"})
	public void F1()
	{
		System.out.println("Feelings");
	}
}
