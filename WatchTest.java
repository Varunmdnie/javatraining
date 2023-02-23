package inheritance;

public class WatchTest {

	public static void main(String[] args) {
		System.out.println("begin main");
		WatchD wd= new WatchD();
		wd.springdetails.setSpringDetails(20.1F, 200, 5);
		wd.springdetails.printspringdetails();
		
		wd.watchdetails.setWatchDetails(20F, 2000F, 20F, 10F, "HELLO");
		wd.watchdetails.printwatchdetails();
		
		
//		Watchdetails.set
		//springdetails.SpringDetails.setSpringDetails(45,70,30);
		
		
	//	watchdetails.WatchDetails.printWatchDetails();
	//	springdetails.SpringDetails.printSpringDetails();
		
		
	}

}

class WatchDetails
{
	float WatchCost;
	float length;
	float breadth;
	float beltLength;
	String watchName;
	void  setWatchDetails(float watchCost, float length, float breadth, float beltLength, String watchName) {
		
		WatchCost = watchCost;
		this.length = length;
		this.breadth = breadth;
		this.beltLength = beltLength;
		this.watchName = watchName;
	}
	void printwatchdetails() {
		System.out.println("watchcost"+WatchCost);
		System.out.println("length"+length);
		System.out.println("breadth"+breadth);
		System.out.println("beltlength"+beltLength);
		System.out.println("Watch name"+watchName);

	}
	
     
	
	
	
}
class SpringDetails
{
	float springLength;
	float springCircumfurence;
	float pitchDiameter;
	void  setSpringDetails(float springLength, float springCircumfurence, float pitchDiameter) {
		
		this.springLength = springLength;
		this.springCircumfurence = springCircumfurence;
		this.pitchDiameter = pitchDiameter;
	}
	void printspringdetails()
	{
		System.out.println("sping length"+springLength);
		System.out.println("spring circumferancre"+springCircumfurence);
		System.out.println("pitch diameter"+pitchDiameter);
		
	}
	
	
}

class WatchD
{
	WatchDetails watchdetails =new WatchDetails();
	SpringDetails springdetails = new SpringDetails();
	
	
	
}
class digitalWatch extends WatchD
{
	
}
class analogWatch extends WatchD
{
	
}

	


