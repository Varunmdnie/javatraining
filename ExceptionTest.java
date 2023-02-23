
public class ExceptionTest {

	public static void main(String[] args) {
		Calculator c =new Calculator();
		c.divide("90","5a");
		
	}
}

class Calculator
{
	void  divide(String num,String deno) 
	{
		
		
			
		try {
			int x =Integer.parseInt(num);
			int y =Integer.parseInt(deno);
			
		int div =x/y;
		
		System.out.println(div);
		}
		
		
		catch(ArithmeticException e)
		{
		System.out.println("not a number");
		}
		catch(NumberFormatException e) 
		{
			System.out.println("supply the number");
		}
		
		
		
	}
		 
	
}