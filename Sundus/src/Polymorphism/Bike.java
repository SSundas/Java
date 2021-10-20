package Polymorphism;

public class Bike {
	
	void run() {
		System.out.println("Running");
	}
}
	
class Splendor extends Bike	
{
	public void run() 
	{
		System.out.println("Running safely with 60km");
	}

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	  Bike b = new Bike(); 
		b.run(); 
	
	//	Splendor c= new Splendor();
		//c.run();
		
	}
	}

