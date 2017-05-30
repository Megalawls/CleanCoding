
public class Tickets {
	int quantity;
	
	public Tickets(int quantity) {
		super();
		this.quantity = quantity;
	}

	public static double ticketPrice(int age, boolean isStudent){
		if(age <= 14) return 4.00;
		if(age >= 60) return 6.00;
		if(isStudent == true) return 6.00;
		return 8.00;	
	}
}
