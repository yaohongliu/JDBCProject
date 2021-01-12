package org.juint.demo;

import org.junit.Before;
import org.junit.Test;
import org.mockito.practice.Calculator;
import static org.junit.Assert.*;

public class TestCalculator {

	Calculator c = null;
	
	@Before
	public void setUp()
	{
		c = new Calculator();
	}
	@Test
	public void testAdd()
	{
		assertEquals(5, c.add(2, 3));
	}
}
