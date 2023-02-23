
public class KiteTest {

	public static void main(String[] args) {
		
		Kite kite = new Kite(1,"sds",0, true);
		Kite kite2 =new Kite(2,"yu",9,false);
		Kite kite3 =new Kite(3,"ty",8,true);
		kite.KiteCount();
		kite.Kitefight(kite3);
		kite.KiteCount();
		
		
		
	}
}
class Kite
{
	private int kiteColor;
	private String kiteOwner;
	private int kiteLength;
	private boolean flying;
	
	private static int KiteCount;
	
	public void KiteCount()
	{
		System.out.println(KiteCount);
	}
	
	
	public void Kitefight(Kite refToKite) {
		
		for(int i=0;i<10;i++)
		{
			double d = Math.random()%100;
			System.out.println("kite fight is going on"+d);
			if(d>0.95)
			{
				KiteCount--;
				break;
				
			}
			else if(d<0.10)
			{
				KiteCount--;
				break;
			}
			else if(d > 0.50 && d <0.75)
			{
				KiteCount--;
				KiteCount--;
				break;
			}
		}
		
		
	}


	public Kite(int kiteColor, String kiteOwner, int kiteLength, boolean flying) {
		super();
		this.kiteColor = kiteColor;
		this.kiteOwner = kiteOwner;
		this.kiteLength = kiteLength;
		this.flying = flying;
		KiteCount++;
	}
	@Override
	public String toString() {
		return "Kite [kiteColor=" + kiteColor + ", kiteOwner=" + kiteOwner + ", kiteLength=" + kiteLength + ", flying="
				+ flying + "]";
	}
	public int getKiteColor() {
		return kiteColor;
	}
	public void setKiteColor(int kiteColor) {
		this.kiteColor = kiteColor;
	}
	public String getKiteOwner() {
		return kiteOwner;
	}
	public void setKiteOwner(String kiteOwner) {
		this.kiteOwner = kiteOwner;
	}
	public int getKiteLength() {
		return kiteLength;
	}
	public void setKiteLength(int kiteLength) {
		this.kiteLength = kiteLength;
	}
	public boolean isFlying() {
		return flying;
	}
	public void setFlying(boolean flying) {
		this.flying = flying;
	}
	
	
}
