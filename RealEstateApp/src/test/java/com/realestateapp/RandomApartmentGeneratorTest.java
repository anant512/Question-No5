package com.realestateapp;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;

public class RandomApartmentGeneratorTest {

	RandomApartmentGenerator randomApartmentGenerator = new RandomApartmentGenerator();

	@Test
	void DefaultGenerator() {
//		Apartment apartment = new Apartment(20.0, new BigDecimal(3000.0));
		assertAll(() -> assertEquals(107.0, randomApartmentGenerator.generate().getArea()),
				() -> assertEquals(160595.4, randomApartmentGenerator.generate().getPrice()));

	}
	
	@Test
	void GeneratorOnSet() {
		RandomApartmentGenerator randomApartmentGenerator1 = new RandomApartmentGenerator(20.0, new BigDecimal(3000.0));
////		Apartment apartment = new Apartment(20.0, new BigDecimal(3000.0));
//		assertAll(() -> assertEquals(107.0, randomApartmentGenerator1.generate().getArea()),
//				() -> assertEquals(527955.4, randomApartmentGenerator1.generate().getPrice()));
//		
		boolean recommendedArea = (107.0 == (randomApartmentGenerator1.generate().getArea()));
		boolean recommendedPrice = (107.0 == (randomApartmentGenerator1.generate().getArea()));
		
		assertAll(() -> assertFalse(recommendedArea),
				() -> assertFalse(recommendedPrice));

		
    } 
	
}  
