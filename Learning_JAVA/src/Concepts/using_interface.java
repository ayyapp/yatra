package Concepts;

public class using_interface implements Interface_Concept

{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		using_interface ob1 = new using_interface();
		ob1.runAll();
		
	}
	
	public void runAll()
	{
		method1();
		method2();
		method3();
	}

	@Override
	public void method1() 
	{
		// TODO Auto-generated method stub
		System.out.println("Method 1");
	}

	@Override
	public void method2()
	{
		// TODO Auto-generated method stub
		System.out.println("Method 2");
	}

	@Override
	public void method3() 
	{
		// TODO Auto-generated method stub
		System.out.println("Method 3");
	}

}
