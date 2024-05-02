package FirstPortion;

public class Babydog extends Dog {

	String name = "Kaiser";
	public void baby()
	{
		System.out.println("Color of animal s " +color);
		System.out.println("Count of dog is " +count);
		System.out.println("Nam of baby dog is "+name);
	}
		public static void main(String[] args) {
			Babydog d = new Babydog();
			d.display();
			d.print();
			d.baby();
	}
}
