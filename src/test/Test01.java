package test;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class Test01 {

	@AfterTest(groups= {"A"})
	public void A()
	{
		System.out.println("Attitude");		
	}
	
	@Test(groups= {"A"})
	public void A2()
	{
		System.out.println("Attractive");		
	}
	
	@AfterMethod(groups= {"A"})
	public void A3()
	{
		System.out.println("->->->->Alpha lead<-<-<-<-");		
	}
	
	@Test
	public void B()
	{
		System.out.println("Blaster");
	}
	
	@Test
	public void B2()
	{
		System.out.println("Bulls Eye");
		Assert.assertTrue(false);
	}
	
	@Parameters({"Life"})
	@Test
	public void B3(String a)
	{
		System.out.println("Believer");
		System.out.println(a);
	}
	
	@AfterSuite(groups= {"A"})
	public void E()
	{
		System.out.println("Empathy");
	}
	
	@AfterClass(groups= {"A"})
	public void E1()
	{
		System.out.println("Enlightenment");
	}
	
}
