import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.CountDownLatch;

import org.hamcrest.core.Is;
import org.junit.jupiter.api.Test;

class JUnitTests {

	@Test
	void test() {
			Restaurant restaurant = new Restaurant(5);
					
			System.out.println(restaurant);
			assertTrue(restaurant.count == 5);
			assertEquals(restaurant.seatingFullOpenState, restaurant.state);
			restaurant.seatSearch();
			restaurant.chooseSeat();
			assertFalse(restaurant.count == 5);
			assertTrue(restaurant.count == 4);
			assertTrue(restaurant.state != null);
			assertEquals(restaurant.seatingAlmostFullState, restaurant.state);
						
			System.out.println(restaurant);
			assertTrue(restaurant.count == 4);
			restaurant.seatSearch();
			restaurant.chooseSeat();
			assertFalse(restaurant.count == 4);
			assertTrue(restaurant.count == 3);
			assertEquals(restaurant.seatingAlmostFullState, restaurant.state);
			
			System.out.println(restaurant);
			assertTrue(restaurant.count == 3);
			restaurant.seatSearch();
			restaurant.rejectCustomer();
			assertFalse(restaurant.count == 2);
			assertTrue(restaurant.count == 3);
			assertEquals(restaurant.seatingAlmostFullState, restaurant.state);
			
			System.out.println(restaurant);
			assertTrue(restaurant.count == 3);
			restaurant.seatSearch();
			restaurant.chooseSeat();
			assertFalse(restaurant.count == 3);
			assertTrue(restaurant.count == 2);
			assertEquals(restaurant.seatingAlmostFullState, restaurant.state);
			
			System.out.println(restaurant);
			assertTrue(restaurant.count == 2);
			restaurant.seatSearch();
			restaurant.chooseSeat();
			assertFalse(restaurant.count == 2);
			assertTrue(restaurant.count == 1);
			assertEquals(restaurant.seatingAlmostFullState, restaurant.state);
			
			System.out.println(restaurant);
			assertTrue(restaurant.count == 1);
			restaurant.seatSearch();
			restaurant.chooseSeat();
			assertFalse(restaurant.count == 1);
			assertTrue(restaurant.count == 0);
			assertEquals(restaurant.seatingFullState, restaurant.state);
			
			System.out.println(restaurant);
			assertTrue(restaurant.count == 0);
			restaurant.seatSearch();
			restaurant.chooseSeat();
			assertTrue(restaurant.count == 0);
			assertEquals(restaurant.seatingFullState, restaurant.state);
			
		}
	}
