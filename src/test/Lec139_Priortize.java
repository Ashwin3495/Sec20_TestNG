package test;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Lec139_Priortize {
	
	@BeforeSuite
	public void Demon() 
	{
		System.out.println("-----------------Before Suite execution-----------------------");
	}

	@Test(groups= {"Fog"})
	public void Evil() 
	{
		System.out.println("Priortize1");
	}
	
	@Test
	public void Luci() 
	{
		System.out.println("Priortize2");
	}
	
	@Parameters({"IM"})
	@Test(groups= {"Smoke"})
	public void Fer(String f) 
	{
		System.out.println("Priortize3");
		System.out.println(f);
	}
}
