
public class FinalFieldTest {

	public static void main(String[] args) {
		
		final float pi =3.14f;
		System.out.println(pi);
		
		
		
		Sun sun =new Sun();
		sun.calculate();
		
		
	}

}
class Sun
{
	
		final float SPEED_OF_LIGHT =90877F;
		final float TIME_TO_REACH_EARTH=78976F;
		
			void calculate()
			{
				double distance=SPEED_OF_LIGHT*TIME_TO_REACH_EARTH;
				System.out.println("the distance is "+distance);
						
			}
		
		
	
}
