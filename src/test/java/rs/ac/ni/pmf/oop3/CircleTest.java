package rs.ac.ni.pmf.oop3;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CircleTest
{
	@Test
	public void shouldConfirmCirclesIntersect() throws BadCircleException
	{
		final Circle c1 = new Circle(0.0f, 0.0f, 3.0f);
		final Circle c2 = new Circle(1.0f, 1.0f, 3.0f);

		assertTrue(c1.intersects(c2));
	}

	@Test
	public void shouldConfirmCirclesDoNotIntersect() throws BadCircleException
	{
		final Circle c1 = new Circle(0.0f, 0.0f, 3.0f);
		final Circle c2 = new Circle(7.0f, 0.0f, 3.0f);

		assertFalse(c1.intersects(c2));
	}
}