import java.util.Arrays;

public class VariousExceptionTest {

	public static void main(String[] args) {
		
		try
		{
		int scores[]= {57,80,868};
		System.out.println("scores"+Arrays.toString(scores));
		System.out.println("scores[8]"+scores[8]);
		System.out.println("scores[0]"+scores[0]);

		String Str ="dassault systemes 7th block jaynagara Banglore";
		System.out.println(" str         "+Str);
		System.out.println("str         "+Str.toLowerCase());
		System.out.println("str         "+Str.toUpperCase());
		System.out.println("str char"     +Str.charAt(100));
		System.out.println("end");
		}
		catch(NullPointerException e)
		{ 
			System.out.println("string is null");
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println("string index is invalid");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("array index is out of bound");
		}
	}
}

