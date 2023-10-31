import java.util.Scanner;
public class Customers {

	Name name;
	String c_id;
	Address address;
	long phoneNo;
	String location;
	//String cusType;
	
	public void getData() {
		
		System.out.println("Please enter your details: ");
		Scanner sc = new Scanner(System.in); 
		 System.out.println("Name: ");  
		 name = new Name(sc.next(),sc.next(),sc.next());
	      System.out.println("id: ");  
	      c_id = sc.next();
	      System.out.println("address: ");  
	      address = new Address(sc.next(), sc.next(), sc.next());
	      System.out.println("phoneNo: ");  
	      phoneNo = sc.nextInt();
	}
	
	public void display() {
		System.out.println("User details are: ");
		System.out.println("Name: "+name.getFullName());  
	      System.out.println("id: "+c_id);  
	      System.out.println("address: "+address.getAddressDetails());  
	      System.out.println("phone Number: "+phoneNo); 
	     // System.out.println("Current location: "+ location);
	     // System.out.println("Customer type: "+ cusType);
	      System.out.println();
	      System.out.println();
		
	}
	
}
