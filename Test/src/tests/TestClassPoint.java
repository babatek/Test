package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import specification.ClassPoint;
import specification.InterfacePoint;

public class TestClassPoint {

	@Test
	public void testAdd() {
		InterfacePoint a = new ClassPoint();
		a.setAbs(2);
		a.setOrd(1);
		InterfacePoint b = new ClassPoint();
		b.setAbs(3);
		b.setOrd(4);
		InterfacePoint c = a.add(b);
		assertTrue(c.getAbs() == 5 && c.getOrd() == 5);		
	}

}
