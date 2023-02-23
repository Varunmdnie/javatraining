
public class SuperSubRefTest {

	public static void main(String[] args) {
		Sparrow sparrow =new Sparrow();
		Parrot parrot =new Parrot();
		Flying flying =new Flying();
		parrot.eat();
		parrot.layEggs();
		parrot.mimic();
		sparrow.eat();
		sparrow.layEggs();
		sparrow.eat();
		flying.fly1(sparrow, parrot);
		flying.fly2(sparrow, parrot);
		
		
		
		
		
		
	}


}


class Flying
{
	void fly1(Sparrow x, Parrot y)
	{
		x.chirp();
		y.mimic();
	}   
	
	void fly2(Animal x,Animal y)
	{
		x.eat();
		y.eat();
		
	}
}
class Animal
{
	void eat()
	{
		System.out.println("animal is eating");
	}
	void sleep()
	{
		System.out.println("animal is sleeping");
		
	}
	void fear()
	{
		System.out.println("animal is fearing");
	}
	void reProduce()
	{
		System.out.println("animal is reproducing");
	}
}

class Bird extends Animal
{
	void layEggs()
	{
		System.out.println("birds wil lay eggs ");
	}
	void fly()
	{
		System.out.println("birds will fly");
	}
}

class Sparrow extends Bird
{
	void chirp()
	{
		System.out.println("the sparrow will chirp");
	}

	@Override
	void layEggs() {
		System.out.println("sparrow wiil lay eggs");
	}

	@Override
	void fly() {
		System.out.println("sparrow will fly");
	}

	@Override
	void eat() {
		System.out.println("sparrow wiil eat");
	}

	@Override
	void sleep() {
		System.out.println("sparrow wiil sleep");
	}

	@Override
	void fear() {
		System.out.println("bird wiil fear");
	}

	@Override
	void reProduce() {
		System.out.println("bird wiil reProduce");
	}
	
	
	
}
class Parrot extends Bird
{
	void mimic()
	{
		System.out.println("the parrot will mimic");
	}

	@Override
	void layEggs() {
		// TODO Auto-generated method stub
		super.layEggs();
	}

	@Override
	void fly() {
		// TODO Auto-generated method stub
		super.fly();
	}

	@Override
	void eat() {
		// TODO Auto-generated method stub
		super.eat();
	}

	@Override
	void sleep() {
		// TODO Auto-generated method stub
		super.sleep();
	}

	@Override
	void fear() {
		// TODO Auto-generated method stub
		super.fear();
	}

	@Override
	void reProduce() {
		// TODO Auto-generated method stub
		super.reProduce();
	}
	
}

