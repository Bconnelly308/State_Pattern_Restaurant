public class Restaurant {
	
	State seatingFullOpenState;
	State seatingAlmostFullState;
	State seatingFullState;
	State seatedState;
	
	State state = seatingFullState;
	int count = 0;
	
	public Restaurant(int numberCustomers) {
		seatingFullState = new SeatingFullState(this);
		seatingAlmostFullState = new SeatingAlmostFullState(this);
		seatingFullOpenState = new SeatingFullOpenState(this);
		
		this.count = numberCustomers;
		if (numberCustomers == 5) {
			state = seatingFullOpenState;
		}
				
	}
	
	public void seatSearch() {
		state.seatSearch();			
	}
		
	public void rejectCustomer() {
		state.rejectCustomer();
	}
		
	public void chooseSeat() {
		state.chooseSeat();
		state.seatCustomer();
	}
				
	void setState(State state) {
		this.state = state;
	}

	void seatFilled() {
		System.out.println("Customer Has Been Seated");
		if (count != 0) {
			count = count - 1;
		}
	}

		int getCount() {
			return count;

		}
		
		public State getSeatingFullState() {
		    return seatingFullState;
		}
		
		public State getSeatingAlmostFullState() {
		    return seatingAlmostFullState;
		}
		
		public String toString() {
			StringBuffer result = new StringBuffer();
			result.append("\nWelcome to the Italian Restaurant");
			result.append("\nJava-enabled Guest Seating");
			result.append("\n" + count + " Open Seat");
			if (count != 1) {
				result.append("s");
			}
			result.append("\n");
			result.append("Restaurant is " + state + "\n");
			return result.toString();
		}
		
}
