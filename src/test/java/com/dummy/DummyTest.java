package com.dummy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DummyTest {

	@Test
	public void testAdd() {
		Dummy d = new Dummy();
		assertEquals(2, d.add(1, 1));
	}
	
	
	@Test
	public void testMultiply() {
		Dummy d = new Dummy();
		assertEquals(6, d.multiply(2, 3));
	}

}
