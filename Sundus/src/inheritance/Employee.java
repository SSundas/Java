package inheritance;

class programmer {
	float salary=40000;
}

class Employee extends programmer{
	int bonus=10000; 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Employee p=new Employee(); 
		 System.out.println("Programmer salary is:"+p.salary);
		 System.out.println("Bonus of Programmer is:"+p.bonus);
	}

}
