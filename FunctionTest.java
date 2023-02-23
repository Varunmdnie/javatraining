package inheritance;

public class FunctionTest {

	public static void main(String[] args) {
		Calculator cal =new Calculator();
		cal.calculate();
		cal.calculate1(10,20 );
		cal.calculate2(40, 90);
		cal.calculate3();		
		
	}

}
class Calculator
{
	void calculate()
	{
		System.out.println("no argument no return type");
	}
	void calculate1(int x,int y)
	{
		System.out.println("with argument no retrn type ");
	}
	int calculate2(int x, int y)
	{
		System.out.println("with argument with return type "+(x+y));
		return x+y;
	}
	int calculate3()
	{
		System.out.println("without argument with return type");
		return 44+77;
	}
	
	
	
	
}
