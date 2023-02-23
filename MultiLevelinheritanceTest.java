package inheritance;

public class MultiLevelinheritanceTest {
	public static void main(String[] args) {
		
		
		Person p = new Person("m",40);
		System.out.println("-------------");
		System.out.println("p"+p);
		Student s = new  Student("m",30,101,"nie","me");
		System.out.println("--------------");
		System.out.println("s"+s);
		Employee e = new Employee("f",25,102,"mit","cs",600,"ds",500f);
		System.out.println("--------------");
		System.out.println("e"+e);
		
	}


	}

class Person
{
	String gender;
	int age;
	
	Person()
	{
		super();
		System.out.println("person() scot");
	}

	public Person(String gender, int age) {
		super();
		this.gender = gender;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [gender=" + gender + ", age=" + age + "]";
	}
	
	
	
}
class Student extends Person
{
	int rollNo;
	String college;
	String department;
	
	Student()     
	{
		super();
		System.out.println("student() cont");
	}

	public Student(String gender, int age, int rollNo, String college, String department) {
		super(gender, age);
		this.rollNo = rollNo;
		this.college = college;
		this.department = department;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", college=" + college + ", department=" + department + ", gender="
				+ gender + ", age=" + age + "]";
	}
	
	
	
}
class Employee extends Student
{
	int id;
	String company;
	float salary;
	
	Employee()
	{
		super();
		System.out.println("employee() cont");
	}

	public Employee(String gender, int age, int rollNo, String college, String department, int id, String company,
			float salary) {
		super(gender, age, rollNo, college, department);
		this.id = id;
		this.company = company;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", company=" + company + ", salary=" + salary + ", rollNo=" + rollNo
				+ ", college=" + college + ", department=" + department + ", gender=" + gender + ", age=" + age + "]";
	}
	

}









