
public class Name {
	String fName,mName,lName;	 

	public Name(String fName, String mName, String lName) {

		this.fName = fName;

		this.mName = mName;

		this.lName = lName;

	}
	 
	 public String getFullName() {
	        return fName + " " +mName+" "+ lName;

     }
}
