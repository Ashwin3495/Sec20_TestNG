package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Lec138_XML {
	
	@BeforeMethod  // Will execute before everymethod is executed in the class   SCOPE IS ONLY INSIDE CLASS
	public void M1()
	{
		System.out.println("--------------138 Before Method-----------------");
	}
	
	@AfterMethod //Will execute after every method is executed in the class  SCOPE IS ONLY INSIDE CLASS
	public void M2()
	{
		System.out.println("--------------138 After Method-----------------");
	}
	
	@AfterTest // Will execute at the end of TC's in that class   SCOPE IS ONLY INSIDE CLASS
	public void Test(){
		System.out.println("->->->->138 After Test");
		
	}
@Test(groups= {"Smoke"})
	public void T2() {
		System.out.println("Bye1");
	}

@AfterSuite // After the execution of all the class and method it will execute in end  SCOPE IS IN FOLDER
public void T3() {
	System.out.println("-----------------After Suite--------------------");
}

@Test(groups= {"Fog"})
public void T4() {
	System.out.println("Bye3");
}
@Parameters({"URL1"})
@Test
public void T5(String b) {
	System.out.println("Bye4");
	System.out.println(b);
}

@BeforeTest //Before the execution starts for this class it will run	SCOPE IS ONLY INSIDE CLASS
public void T6() {
	System.out.println("->->->->138 Before Test");
}


}
