public class Clerk extends Employee
{

	public Clerk(int id, String name, String dprt, int Salary, String designation) {
		super(id, name, dprt, Salary, designation);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void addBonues() {
		this.setSalary(getSalary() + 100);
	}
    
	public void display() {
		System.out.println( "Name: " + getName() + "\n" + "ID: " + getID() + "\n" + "Department: " + getDepartment() + "\n" + "Salary: " + getSalary() + "\n" + "Designation: " + getDesignation() + "\n");
	
	}

	double deduct = 0;
	
	@Override
	public void deduct(int input) {
		double num = this.getSalary() / 20 ;
		deduct = getSalary() - (input*num);
		setSalary(deduct);
	}

	@Override
	public double getDeduct() {
		return deduct;
	}
}
