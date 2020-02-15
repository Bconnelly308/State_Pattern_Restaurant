public class SeatingAlmostFullState implements State {
	Restaurant restaurant;
	
	public SeatingAlmostFullState(Restaurant restaurant) {
		this.restaurant = restaurant;
	}
	
	public void seatSearch() {
		System.out.println("There are Open Seats");
	}
	
	public void rejectCustomer() {
		System.out.println("Customer Rejected");
	}
		
	public void chooseSeat() {
		System.out.println("Seat Chosen");
	}
	
	public void seatCustomer() {
		System.out.println("Seat the New Guest");
		restaurant.seatFilled();
		if (restaurant.getCount() > 0) {
			restaurant.setState(restaurant.getSeatingAlmostFullState());
		} else {
			restaurant.setState(restaurant.getSeatingFullState());
		}
	}
    
	public String toString() {
		return "Waiting for More Customers";
	}
	
}