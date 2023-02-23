
public class FuntionOveridngTest {

	public static void main(String[] args) {
		GrandFather g =new GrandFather();
		Father f=new Father();
		Child c =new Child();
		
		
		
		g.wakeUp();
		//g.farming();
		//System.out.println("------------------------------");
		f.wakeUp();
		c.wakeUp();
		
		
		 
	}

}
class GrandFather
{
	int gold;
	int land;
	
	
	void wakeUp()
	{
		System.out.println("grandfatrher wakes up at 4:00");
	}
	void farming()
	{
		System.out.println("farming ");
	}
}
class Father extends GrandFather
{
	void wakeUp()
	{
		System.out.println("father wakes up at 5:00");
	}
	void farming()
	{
		System.out.println("father does farming using tractor");
	}
}
class Child extends Father
{
	void wakeUp()
	{
		System.out.println("child wakes up at 6:00");
	}
	void farming()
	{
		System.out.println("child farms using the new methods");
	}
}
