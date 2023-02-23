
public class FunctionOverloadingTest {

	public static void main(String[] args) {
		Phone myphone= new Phone();
		
		myphone.dial();
		myphone.dial("abhishek");
		myphone.dial(90990909090L);
		byte intercomm =120;
		myphone.dial(intercomm);
		
		
		
	}
}
class Phone
{
	void dial()
	{
		System.out.println("dial() nowhere..");
	}
	void dial(byte intercommNumber)
	{
		System.out.println("dial(byte): dialing intercomm:"+intercommNumber);
	}
	void dial(String name)
	{
		System.out.println("dial(String): my name is" +name);
	}
	void dial(long mobileNumber)
	{
		System.out.println("dial(long) : my mobile" +mobileNumber);
	}
	
}
