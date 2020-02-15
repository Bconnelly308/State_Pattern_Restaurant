public class SeatingFullState implements State {
	Restaurant restaurant;
	
	public SeatingFullState(Restaurant restaurant) {
		this.restaurant = restaurant;
	}	
	
	public void seatSearch() {
		System.out.println("No More Open seats");
	}
	
	public void rejectCustomer() {
		System.out.println("Customer Rejected");
	}
	
	public void chooseSeat() {
		System.out.println("Can't Choose Seat");
	}
	
	public void seatCustomer() {
		System.out.println("Can't Seat Customer");

	}

	public String toString() {
		return "Sold Out";
	}		
}