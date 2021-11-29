package test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Lec148_DataProvider {
	
	@Test(dataProvider="getData")
	public void Evil(String a , String b) 
	{
		System.out.println("Priortize1");
		System.out.println(a);
		System.out.println(b);
	}
	
	@Test
	public void Luci() 
	{
		System.out.println("Priortize2");
	}
	

@DataProvider
public Object[][] getData() {
	Object[][] data=new Object[3][2]; //3-number of times the set used 2-number of values used
	
	data[0][0]="firstusername";
	data[0][1]="firstpassword";
	
	data[1][0]="secondusername";
	data[1][1]="secondpassword";
	
	data[2][0]="thirdusername";
	data[2][1]="thirdpassword";
	
	return data;
}

}
