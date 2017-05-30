import java.util.Date;

public class Booking {
	
	public static boolean isOldEnough(int age, String rating){
	 if((rating.toLowerCase() == "18") && (age >= 18)) return true;
	 if((rating.toLowerCase() == "15") && (age >= 15)) return true;
	 if((rating.toLowerCase() == "12") && (age >= 12)) return true;
	 if(rating.toLowerCase() == "u") return true;
	return false;
	}
	
	public static double totalCost(double ticketPrice, int quantity){
		return ticketPrice*quantity;
	}
	
	public static void printReceipt(String name, double price){
	Date bookingDate = new Date();
 	System.out.println("Booking Confirmation for: " + name);
	System.out.println("Date: " + bookingDate);
 	System.out.println("Total Cost: £" + price);
	}
	
	public static void main(String[] args){
		Customer customer = new Customer("Steven", 17, true);
		Film film = new Film("Sharknado 50 - Return of the Sentient Space Sharks in a ridiculous vortex of poor acting", "15");
		Tickets tickets = new Tickets(2);
		
	if(isOldEnough(customer.age, film.rating)){
		double price = totalCost(Tickets.ticketPrice(customer.age, customer.isStudent), tickets.quantity);
		printReceipt(customer.name, price);
	}
	else{
		System.out.println("Customer is not old enough");
	}
	}
}

