

public class UserDefinedExceptionTest {

	public static void main(String[] args) {
		
		Person person = new Person();
		try
		{
			person.shower();
		}
		catch(Person.NoWaterException e)
		{
			System.out.println("Handler1" +e);
		}
		catch(Person.WaterTooHotException e)
		{
			System.out.println("Handler2 :"+e);
		}
		catch(Person.WaterTooColdException e)
		{
			System.out.println("Handler3 :"+e);
		}
		catch(Person.SlipAndFall e)
		{
			System.out.println("Handler4 :"+e);
		}
      
	}

}
class Person
{
	void shower()
	{
		System.out.println("inside the washroom");
		double d =Math.random()%10;
		if(d<0.10)
		{
			NoWaterException rte =new NoWaterException("there is no water");
			throw rte;
		}
		
		else
		{
			System.out.println("\tBegin shower...");
			for(int i=1;i<=20;i++) {
				System.out.println("\t\tShower going on....."+i);
				if(d > 0.80 && d < 0.99)
				{
					WaterTooHotException rte =new WaterTooHotException("water is too hot");
					throw rte;
				}
				else if(d> 0.20 && d <0.30)
				{
					WaterTooColdException rte = new WaterTooColdException();
					throw rte;
				}
				else if(d > 0.50 && d < 0.55) 
				{
					SlipAndFall rte =new SlipAndFall("slip and fall");
					throw rte;
				}
		}
			System.out.println("end of shower");
	}
}
	
	

	
	
class WaterTooHotException extends RuntimeException
{

	public WaterTooHotException(String string) {
		// TODO Auto-generated constructor stub
	}
}
class WaterTooColdException extends RuntimeException
{
	
}
class SlipAndFall extends RuntimeException
{

	public SlipAndFall(String string) {
		// TODO Auto-generated constructor stub
	}
	
}
class NoWaterException extends RuntimeException
{

	public NoWaterException(String string) {
		// TODO Auto-generated constructor stub
	}
	
}
}
	

