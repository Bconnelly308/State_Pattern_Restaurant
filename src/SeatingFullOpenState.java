public class SeatingFullOpenState implements State {
	Restaurant restaurant;
	
	public SeatingFullOpenState(Restaurant restaurant) {
		this.restaurant = restaurant;
	}
	
	public void seatSearch() {
		System.out.println("Seating is Open");
	}
	
	public void rejectCustomer() {
		System.out.println("Customer Rejected");
	}
	
	public void chooseSeat() {
		System.out.println("Choose Seat");
	}
	
	public void seatCustomer() {
		System.out.println("First Customer Was Seated");
		restaurant.seatFilled();
		restaurant.setState(restaurant.getSeatingAlmostFullState());
	}
		 
	public String toString() {
		return "Ready for Customers";
	}
}