
public class Address {
	String street,city,zip;	 

	public Address(String street, String city, String zip) {


		this.street = street;

		this.city = city;

		this.zip = zip;

	}
	
	public String getAddressDetails() {
        return street + ", " + city + ", " + zip;
    }
}
