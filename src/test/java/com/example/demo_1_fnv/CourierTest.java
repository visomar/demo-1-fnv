package com.example.demo_1_fnv;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CourierTest {

	@Test
	void testDeliverPlatinumChip() {
		Courier courier = new Courier();

		String message = courier.deliverPlatinumChip();

		assertEquals("Sorry, Benny stole it from me", message);
	}
}