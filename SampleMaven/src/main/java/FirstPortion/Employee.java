package FirstPortion;

public class Employee {

	String ename;
	int age;
	Address ad;
	public  Employee(String ename,int age,Address ad)
	{
		
		this.ename=ename;
		this.age=age;
		this.ad=ad;
	}

	public void display()
	{
		System.out.println("Emp name is " +ename);
		System.out.println("Age is " +age);
		System.out.println("Street name is "+ ad.Streetname);
		System.out.println("Street num is "+ ad.number);
		
	}
	public static void main(String[] args) {		
		Address ad = new Address("Rajiv Nagar",205);
		Employee em =new Employee("Roshan",25,ad);
		em.display();	
	}

}
