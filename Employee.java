// All the class are inherit from Object class

public abstract class Employee
{
   
	private int ID;
	private String name;
	private String department;
	private double salary;
	private String designation;
	
	private int Bonus = 200;
	
	public Employee(int id , String name , String dprt, double Salary , String designation ) {
		this.ID = id;
		this.name = name;
		this.department = dprt;
		this.salary = Salary;
		this.designation = designation;
	}
	
	public int getID() {
		return ID;
	}
	
	public void setID(int iD) {
		ID = iD;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public boolean equals(Employee obj) {
		if(obj.getDesignation().equals(this.designation)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
	public abstract void addBonues();
	
	public abstract void display();
	
	public abstract void deduct(int num);
	
	public abstract double getDeduct();

	
	
}
