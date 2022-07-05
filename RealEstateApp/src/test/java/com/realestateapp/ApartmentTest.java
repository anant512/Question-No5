package com.realestateapp;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class ApartmentTest {

	@Nested
	class MakeApartment {
		
		Apartment apartment = new Apartment(20.0, new BigDecimal(3000.0));
		
		@Test
		void getApartmentDetails() {
			apartment.setArea(30.0f);
			apartment.setPrice(new BigDecimal(4000.0));
			assertAll(() -> assertEquals(30.0,apartment.getArea()),
					() -> assertEquals(new BigDecimal(4000.0), apartment.getPrice()));
			System.out.println(apartment);
		}
	}
}
