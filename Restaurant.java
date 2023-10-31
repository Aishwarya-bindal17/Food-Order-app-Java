
public class Restaurant {

    String name;
    Address address;
    String contactNumber;
    String email;

    public Restaurant(String name, Address address, String contactNumber,String email) {
        this.name = name;
        this.address = address;
        this.contactNumber = contactNumber;
        this.email = email;
    }

    public void displayDetails() {
    	System.out.println();
    	System.out.println("---------------------------------------------------------------");
    	System.out.println();
    	 System.out.println("Restaurant Details:");
    	 System.out.println();
         System.out.println("Name: " + name);
         System.out.println("Address: " + address.getAddressDetails());
         System.out.println("Contact Number: " + contactNumber);
         System.out.println("Email id: " + email);
         System.out.println();
     }
    }
    