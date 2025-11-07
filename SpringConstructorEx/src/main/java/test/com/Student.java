package test.com;

public class Student {
	private int id;
	private String name;
	private String city;
	private  Subject subject;
	
	
	
	public void chat() {
		System.out.println("my id is :"+id);
		subject.write();
	}

}
