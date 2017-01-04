package com.javapapers.servlet.introduction;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;

public class HelloWorldTest {
	@Test
	public void marshal() {		
		try {
			int i = 87;
			assertTrue(i== 87);
		} catch(Exception e) {			
			e.printStackTrace();
			fail("Error on parse XML using JAXB");
		}
	}
}
