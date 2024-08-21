package spring4;

public class Address {
//constructor injection with Dependent object using properties , counstructor and toString() method
	
	private String city;
	private String state;
	private String country;
	
	public Address(String city , String state , String country ) {
		super();
		this.city = city;
		this.state=state;
		this.country=country;
	}
	public String toString() {//for returning the value of these method
		return city+" "+state+" "+country;
	}
}
