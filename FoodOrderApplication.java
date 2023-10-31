
public class FoodOrderApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Customers c= new Customers();
      c.getData();
       c.display();
       
       Menu m= new Menu();
       m.display();
       
 
       Order o=new Order();
       o.getData();
       o.display(c.c_id);
       Address restaurantAddress = new Address("123 Main Street", "Delhi", "12345");
       Restaurant r = new Restaurant("ABC RESTAURANT", restaurantAddress, "+1 123-456-7890","abcrestaurant@gmail.com");
       r.displayDetails();
	}

}
