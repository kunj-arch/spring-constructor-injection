package spring4;
//hare three properties id, name and address(dependent obj)
//two constructor and one show() method
public class Corbic {
	private int id;
	private String name;
	private Address address;
	
	public Corbic() {System.out.println("def cons");}
       
	public Corbic(int id,String name , Address address) {
	super();
       this.id=id;
       this.name=name;
       this.address = address;
	}
void show() {//show the record of current object including the depedent object.
	System.out.println(id+" "+name);
	System.out.println(address.toString());
}
}
