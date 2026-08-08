
public class Constructor+This {
	
		String name;
		double Salary;
		
		void display(String name, double Salary) {
			this.name = name;
			this.Salary = Salary;
			System.out.println(name);
			System.out.println(Salary);
			
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Constructor c = new Constructor();
		c.display("krushna",150000);
	     //System.out.println();
	}

}
