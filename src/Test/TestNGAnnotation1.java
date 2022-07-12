package Test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class TestNGAnnotation1 {
	
	@Test(priority=-1)
	public void test2()
	{
		System.out.println("Test2");
	}
	@Test(dataProvider="TestData")
	public void test4(int a,int b)
	{
		System.out.println(a+b);
	}
	@Test
	@Parameters({"i","j"})
	public void test1(int a,int b)
	{
		System.out.println(a+b);
	}
	@Test(invocationCount=2)
	@Parameters({"k"})
	public void test3(int c)
	{
		System.out.println(c);
	}
	@Test(enabled=false)
	public void test5()
	{
		System.out.println("Test5");
		
	}
	@Test(timeOut=2000)
	public void test6() throws InterruptedException
	{
		Thread.sleep(4000);
		System.out.println("Test 6");
	}
	@Test(dependsOnMethods= {"test2"} )
	public void test7()
	{
		System.out.println("Test 7");
	}
	@DataProvider (name="TestData")
	public Object[][]values(){
		return new Object[][]{{5,7},{7,8}};
		
	}
	@DataProvider (name="NewData")
	public Object[][]StringData(){
		return new Object[][]{{"velocity"},{"katraj"}};
		
	}
	@Test(dataProvider="NewData")
	public void test9(String name) {
		System.out.println(name);
	}
}

