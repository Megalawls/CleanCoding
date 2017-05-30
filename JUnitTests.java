import static org.junit.Assert.*;

import org.junit.Test;

public class JUnitTests {

	@Test
	public void bookingIsOldEnough(){
		boolean testIsOldEnough = Booking.isOldEnough(15, "15");
		assertEquals(true, testIsOldEnough);
		boolean testIsntOldEnough = Booking.isOldEnough(14, "15");	
		assertEquals(false, testIsntOldEnough);
	}
	
	@Test
	public void testPrintReceipt(){
		Booking.printReceipt("USERSNAME", 999.99);
	}
	
	@Test
	public void testTotalCost(){
		double cost = Booking.totalCost(10, 10);
		assertEquals(100.00, cost, 0);
	}
	
	@Test
	public void testTicketPrice(){
		double oap = Tickets.ticketPrice(75, false);
		double child = Tickets.ticketPrice(5, false);
		double student = Tickets.ticketPrice(25, true);
		double standard = Tickets.ticketPrice(25, false);
		assertEquals(6, oap, 0);
		assertEquals(4, child, 0);
		assertEquals(6, student, 0);
		assertEquals(8, standard, 0);
	}
}
