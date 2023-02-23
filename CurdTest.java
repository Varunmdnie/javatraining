
public class CurdTest {

	public static void main(String[] args) {
		Curd thecurd =new Curd("cow","high","white","good");
		System.out.println("curd"+thecurd);
	
		System.out.println("density"+thecurd.getDensity());
		thecurd.setColor("black");
		System.out.println("color   "+thecurd.getColor());
		
		
		
		
	}

}
class Curd
{
	String type;
	String density;
	String color;
	String taste;
	public Curd(String type, String density, String color, String taste) {
		super();
		this.type = type;
		this.density = density;
		this.color = color;
		this.taste = taste;
	}
	@Override
	public String toString() {
		return "Curd [type=" + type + ", density=" + density + ", color=" + color + ", taste=" + taste + "]";
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getDensity() {
		return density;
	}
	public void setDensity(String density) {
		this.density = density;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getTaste() {
		return taste;
	}
	public void setTaste(String taste) {
		this.taste = taste;
	}
	
	
}
