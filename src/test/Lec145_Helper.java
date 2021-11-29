package test;

import org.testng.annotations.Test;

public class Lec145_Helper {

	@Test(dependsOnMethods={"Demo1"})
	public void Demon() 
	{
		System.out.println("Depends on Evil method");
	}

	@Test(enabled=false)
	public void Evil() 
	{
		System.out.println("Priortize1");
	}
	
	@Test(timeOut=1000)
	public void Zack() 
	{
		System.out.println("Priortize2");
	}
	

	@Test
	public void Tail() 
	{
		System.out.println("Bye3");
	}

	@Test
	public void Head() 
	{
		System.out.println("Bye4");
	}
	
	@Test
	public void Demo()
	{
		System.out.println("Bye5");	
	}
	
	@Test
	public void Demo1()
	{
		System.out.println("Bye6");	
	}
	
	
}
