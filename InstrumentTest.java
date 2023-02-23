
public class InstrumentTest {

	public static void main(String[] args) {
		
	}

}
abstract class Instrument
{
	abstract void use();
}
abstract class MusicalInstrument extends Instrument
{
	abstract void play();
}
abstract class StringBasedInstruments extends MusicalInstrument
{
	abstract void tunestrings();
}
abstract class guitar extends StringBasedInstruments
{

	@Override
	public String toString() {
		return "guitar [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
}


