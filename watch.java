
public class watch {

	public static void main(String[] args) {
		wristWatch wrObjRef1 = new wristWatch();
		
		
		wrObjRef1.Notify();
		wrObjRef1.getDate();
		wrObjRef1.GetTime();
		
		
	}

}
class wristWatch
{
	void GetTime()
	{
		System.out.println("get the timne ");
	
		
	}
	void getDate()
	{
		System.out.println("get the date ");
		
	}
	void Notify()
	{
		System.out.println("get the notification");
	}
	
}
