package se.hig.oodp.lab.model;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import se.hig.oodp.lab.model_2.Point;
import se.hig.oodp.lab.model_2.Vertex2D;

public class PointTest {
	Vertex2D point;
	Point p;

	@Before
	public void setUp() throws Exception {
		p = new Point(2.0, 1.0);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testNewPoint() {
		assertEquals("Wrong Position", 0, p.getPoint().dist(new Vertex2D(2.0,1.0)), 0.01);
	}
	@Test
	public void testNewMoveBy() {
		assertEquals("Wrong Position", 0, p.getPoint().dist(new Vertex2D(2.0,1.0)), 0.01);
	}
	
}
