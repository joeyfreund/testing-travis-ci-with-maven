package com.dummy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DummyTest {

	@Test
	public void test() {
		Dummy d = new Dummy();
		assertEquals(2, d.add(1, 1));
	}

}
