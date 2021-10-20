package constructor;

public class bike1 {
	int sundas,  amal,  marks;

	public bike1 () {
		sundas=55;  
		amal=45;
		marks=sundas+amal;
			
		}
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			 bike1 myObj = new bike1();
	
			  System.out.println(myObj.marks);
	}

}
