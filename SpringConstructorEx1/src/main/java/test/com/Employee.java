package test.com;

import java.util.List;

public class Employee {
	private String name;
	private String employeeID;
	private String department;
	private List<String> adress;
	public Employee(String name, String employeeID, String department, List<String> adress) {
		super();
		this.name = name;
		this.employeeID = employeeID;
		this.department = department;
		this.adress = adress;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(String employeeID) {
		this.employeeID = employeeID;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public List<String> getAdress() {
		return adress;
	}
	public void setAdress(List<String> adress) {
		this.adress = adress;
	}
	
	public void display() {
		System.out.println(getName()+" "+ getEmployeeID()+" "+getDepartment()+" "+getAdress());
	}
}
