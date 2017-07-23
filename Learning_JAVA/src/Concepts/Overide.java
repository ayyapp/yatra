package Concepts;

public class Overide {
	

}

class one 
{
	public one()
	{
		System.out.println("I am Class ONE");
	}
}
class two extends one
{
	public two()
	{
		System.out.println("I am Class TWO");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		two b = new two();
		
	}
}