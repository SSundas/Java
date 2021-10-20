package polymorphism_test;

public class Test {
	void run() {
		System.out.println("Running");
	}
}
	
class rest extends Test
{
	public void run() 
	{
		System.out.println("Running safely with 60km");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Test b = new Test(); 
			b.run(); 
		
		rest c= new rest();
		c.run();

	}

}
