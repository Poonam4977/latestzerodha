package poonam.aa;

import java.util.Scanner;

public class TryCatchArith {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		try
		{
			System.out.println(a/b);
		}
		catch(ArithmeticException e)
		{
			System.out.println("divide by zero error");
		}
		finally
		{
			System.out.println("it is executed every time");
		}
				
	
}

}
