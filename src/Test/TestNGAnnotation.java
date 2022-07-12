package Test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotation {
	@AfterClass
	public void afterClass()
	{
		System.out.println("after class");
	}
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("before class");
	}
     @Test
     public void test1()
     {
    	 System.out.println("test1");
     }
     @Test
     public void test2()
     {
    	 System.out.println("test2");
     }
     @BeforeMethod
     public void beforeMethhod()
     {
    	 System.out.println("beforeMethhod");
     }
     @AfterMethod
     public void afterMethod()
     {
    	 System.out.println("AfterMethod");
     }
     @Test
     public void test3()
     {
    	 System.out.println("test3");
     }
     @BeforeTest
     public void beforeTest()
     {
    	 System.out.println("beforeTest");
     }
     @AfterTest
     public void afterTest()
     {
    	 System.out.println("afterTest");
     }

}
