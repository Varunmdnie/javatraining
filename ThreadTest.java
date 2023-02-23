
public class ThreadTest {

	public static void main(String[] args) {
		
		Bike bike= new Bike("honda");
		Car car =new Car("BMW");
		Train train= new Train("chamundi express");
		Boat boat = new Boat("kochi");
		
		bike.start();
		car.start();
		train.start();
		boat.start();
		
		
		
	}
}
class Bike extends Thread
{
	String str;
	
	Bike(String s) 
	{
		str=s;
	}
	void ride() {
		for(int i=1;i<=200;i++) {
			System.out.println(str+" is running...."+i);
		}
	}
	public void run() { 
		ride();
	}
}

class Car extends Thread 
{
	String str;
	
	Car(String s) {
		str = s;
	}
	void drive() {
		for(int i=1;i<=200;i++) {
			System.out.println(str+" is running...."+i);
		}
	}
	public void run() { 
		drive();
	}
}


class Train extends Thread 
{
	String str;
	
	Train(String s) {
		str = s;
	}
	void railing() {
		for(int i=1;i<=200;i++) {
			System.out.println(str+" is running...."+i);
		}
	}
	public void run() {
		railing();
	}
}

class Boat extends Thread 
{
	String str;
	
	Boat(String s) {
		str = s;
	}
	void sailing() {
		for(int i=1;i<=200;i++) {
			System.out.println(str+" is running...."+i);
		}
	}
	public void run() 
	{ 
		sailing();
	}
}
