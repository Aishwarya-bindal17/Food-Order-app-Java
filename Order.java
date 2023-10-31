import java.util.Scanner;
import java.time.LocalDate;
import java.time.LocalTime;

public class Order {

	int OrderNo;
	int itemId;
	int qty;
	String itemName;
	int sqty=0;
	int pizzaqty=0;
	int pastaqty=0;
	int bqty=0;
	int res;
	double tprice;
	
	 static String restName="ABC RESTAURANT";
	
	public void getData() {	
		Scanner sc = new Scanner(System.in); 
	      boolean run=true;
		  while(run) {
			System.out.println("Please Select item number or select 5 to exit: ");
			res = sc.nextInt();
			switch(res) {
			
			case 1: System.out.println("Sandwitch selected");
			System.out.println("Select quantity:");
			qty=sc.nextInt();
			tprice=tprice+ 100*qty;
			sqty=qty;
			break;
			
			case 2:System.out.println("Pizza selected");
			System.out.println("Select quantity:");
			qty=sc.nextInt();
			tprice=tprice+ 300*qty;
			pizzaqty=qty;
			break;
			
			case 3:System.out.println("Burger selected");
			System.out.println("Select quantity:");
			qty=sc.nextInt();
			tprice=tprice+ 100*qty;
			bqty=qty;
			break;
			
			case 4:System.out.println("Pasta selected");
			System.out.println("Select quantity:");
			qty=sc.nextInt();
			tprice=tprice+ 250*qty;
			pastaqty=qty;
			break;
			case 5:
				run=false;
				break;
			default:
				break;
			}
			}	 
	}
	
	public void display(String cusId) {
        double finalPrice;
        String customerType = "Guest";
        
       if (cusId.startsWith("p")) {
             finalPrice = new Premium().payBill(tprice);
             customerType = "Regular";
         } 
       else if (cusId.startsWith("r")) {
           finalPrice = new Premium().payBill(tprice);
           customerType = "Regular";
       } 
         else {
             finalPrice = new Guest().payBill(tprice);
         }

        System.out.println();
        System.out.println("-----------       "+restName+"    ----------");
        System.out.println();
        System.out.println();
        System.out.println("Order details are: ");
        System.out.println();
        System.out.println("Customer Type: " + customerType);
        System.out.println("Ordered Items:");
        System.out.println("   Item    Quantity");
        if (sqty > 0) {
            System.out.println("  Sandwich   " + sqty);
        }
        if (pizzaqty > 0) {
            System.out.println("  Pizza      " + pizzaqty);
        }
        if (pastaqty > 0) {
            System.out.println("  Pasta      " + pastaqty);
        }
        if (bqty > 0) {
            System.out.println("  Burger     " + bqty);
        }
        System.out.println("Total Amount: Rs " + tprice);
        if (cusId.startsWith("g")) {
        	System.out.println("Payable Amount after adding delivery charge: Rs " + finalPrice);
        }
        else {
        System.out.println("No delivery charge");
        System.out.println("Payable Amount after discounts: Rs " + finalPrice);
        }
        LocalDate ld = LocalDate.now();
		System.out.println("date: "+ld);

		LocalTime lt = LocalTime.now();
		System.out.println("time: "+lt);
        System.out.println();
    }
}
	

