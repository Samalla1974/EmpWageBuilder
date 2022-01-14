package com.bridgelabz.workShop2;
import org.junit.Assert;
import org.junit.Test;

public class HotelRegistrationTest {
	HotelReservationSystem register = new HotelReservationSystem ();
	
	@Test
	public void givenWhenProper_ShouldReturnTrue() {
		String input = register.weekORweekend();
		Assert.assertTrue(input, false);
	}
}
