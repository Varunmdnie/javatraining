
public class banktest {

	public static void main(String[] args) {
		bankAccount baObjRef1 = new bankAccount();
		bankAccount baObjRef2 = new bankAccount();
		bankAccount baObjRef3 = new bankAccount();
		bankAccount baObjRef4 = new bankAccount();
		
		
		baObjRef1.deposit();
		baObjRef1.withdraw();
		baObjRef2.deposit();
		baObjRef3.withdraw();
		baObjRef4.withdraw();
		
		
	}
}

class bankAccount
{
	int accno;
	
	void withdraw()
	{
		System.out.println("withdrawing");
	}
	void deposit()
	{
		System.out.println("depositing");
	}
	
}
 